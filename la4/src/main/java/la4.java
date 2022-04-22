public class la4 {
    public static void main(String[] args) throws DeathExaption {

        Past unemployed1 = new Past("Каждый", City.BREHVILL, Condition.OUTRAGED, Status.WORKER,Salary.LESS_THAN_FERTING);
        Past unemployed2 = new Past("Каждый рабочий", City.OTHER_CITIES, Condition.HELPING_OUT,Status.WORKER,Salary.UNKNOWN);
        Past scooperfield = new Past("Скуперфильд", City.BREHVILL, Condition.MISER, Status.OLIGARCH,Salary.UNKNOWN);
        if(unemployed1.status==Status.DEAD){
            throw new DeathExaption("Ни один Скуперфильдский рабочий не должен быть мертвым");
        }

        unemployed1.getMoney("<1");
        System.out.println(unemployed1.excuse.speak(""));
        System.out.print("Каждый ");
        scooperfield.leaveCond();
        scooperfield.setInformation1(Salary.LESS_THAN_FERTING.getTranslation());
        scooperfield.thinking("рабочие блефуют и оплата осталась ");
        unemployed1.setFactory(Factory.STOPPED);
        unemployed1.getMoney("без изменений");
        scooperfield.salary=Salary.WITHOUT;
        System.out.println(scooperfield.name+" остался "+scooperfield.salary.getTranslation());
        scooperfield.setWish("стоять на своем");
        System.out.println(scooperfield.whatWish()+scooperfield.excuse.speak(" от голода"));
        System.out.println(unemployed2.getInformation1());
        System.out.println(unemployed2.whatDoItKnow());




    }
}
