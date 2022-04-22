public class Human implements Hired{
    protected Condition condition;
    protected String name;
    protected City hometown;
    protected String wish;
    protected String knowledge;
    protected Status status;

    public Human() {
    }

    public Condition getCondition() {
        return condition;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Human(String name, City hometown, Condition condition, Status status){
        this.name = name;
        this.hometown = hometown;
        this.condition = condition;
        this.status = status;

        if(status == Status.UNEMPLOYED && hometown == City.BREHVILL )
            this.knowledge = "рабочие ведут борьбу со Скуперфильдом";

    }

    public String getName(){
        return name;
    }

    public void setWish(String wish){
        this.wish = wish;
    }

    public String whatWish() {
        return name + " хочет " + wish;
    }

    @Override
    public int hashCode(){
        return name.hashCode();
    }

    @Override
    public boolean equals(Object o){
        return (o instanceof Human) &&
                (this.name.equals(((Human) o).getName())) &&
                (this.status == ((Human) o).getStatus()) &&
                (this.condition == ((Human) o).getCondition());
    }

    @Override
    public String toString(){
        return "Human " + this.name + "_ahd_he_or_she_is_" + this.status;
    }

    public String whatDoItKnow(){
        if(knowledge != null) return this.name + " знает, что " + knowledge;
        else return this.name + " ничего не знает.";
    }

    @Override
    public void getHiredTo(Human h) {
        if(status == Status.UNEMPLOYED && h.getCondition() != Condition.MISER)
            System.out.println(name + " нанялся и стал работником.");
        else System.out.println(name + " отказался устраиваться к этому сквалыге (" + h.name + ")");
    }

    public void read(Readable readableObject){
        System.out.println(name + " прочитал, что " + readableObject.getInfo());
    }
}
