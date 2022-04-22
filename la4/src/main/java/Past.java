public class Past extends  Human{
    public Condition getCondition() {
        return condition;
    }
    Communication communication=new Communication();
    protected Salary salary;
    private String information1="";
    private String information2="";
    private Factory factory;
    public Salary getSalary() {return salary;}
    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
    public Past(String name, City hometown, Condition condition, Status status,Salary salary){
        super(name,hometown,condition,status);
        this.salary = salary;
        if(condition== Condition.OUTRAGED && hometown==City.BREHVILL && salary==Salary.LESS_THAN_FERTING){
            this.knowledge = "голодает с зарплатой ниже фертинга";}
        else if(status == Status.WORKER && hometown == City.OTHER_CITIES && condition==Condition.HELPING_OUT ){
            this.knowledge ="если Скуперфильд одержит победу, с богачами им придется не сладко";
            setInformation1("Каждый "+status.WORKER.getTranslation()+" имел большие трудности"+helping.help());}
        else{this.knowledge = "без работы любой рабочий станет "+Status.DEAD.getTranslation();}

    }
    Past.HelpSome helping = new Past.HelpSome();
    public static class HelpSome{
        public String help(){
            return ", но им помогали рабочие других фабрик.";
        }

    }
    public class Communication  implements Speak{
        public String speak(String sentense) {
            System.out.print(name + " сказал, что " + getInformation1()+ sentense+ getInformation2());
            return sentense;
        }
    }
    Communication excuse=new Communication(){
        public String speak(String k){
            return " ,потому что " + knowledge +k;
        }
    };



    public void leaveCond(){
        if (condition==Condition.MISER && status ==Status.OLIGARCH){
            name=Status.WORKER.getTranslation();
            communication.speak("бросит работу,если зарплата ");
            name="Скуперфильд";
            System.out.println(Salary.LESS_THAN_FERTING.getTranslation());}


    }
    public void setInformation1(String information1){
        this.information1=information1;
    }
    public String getInformation1(){
        return information1;
    }
    public void setInformation2(String information2){
        this.information2=information2;
    }
    public String getInformation2(){
        return information2;
    }
    public void setFactory(Factory factory){
        this.factory=factory;
    }
    public Factory getFactory(){
        return factory;
    }
    public void thinking(String t){
        System.out.println(name + " подумал, что " + t+getInformation1());

    }
    public void getMoney(String k){
        switch(k){
            case ("<1"):
            System.out.print("Каждый "+status.getTranslation()+" из города "+hometown.getTranslation()+
                    " "+condition.getTranslation());
            break;
            case("без изменений"):
            System.out.print("Каждый "+status.getTranslation()+" бросил работу и ");
            if (factory==Factory.STOPPED){
                try {
                    throw new NoFactoryException();}
                catch (NoFactoryException e){
                    System.out.println(factory.getTranslation());}}
            break;
            default:
                System.out.println("ничего");
                break;
        }}


}
