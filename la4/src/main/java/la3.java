public class la3 {
    public static void main(String[] args) {
        Human scooperfield = new Human("Скуперфильд", City.BREHVILL, Condition.MISER, Status.OLIGARCH);
        scooperfield.setWish("нанять рабочих");
        Human unemployed1 = new Human("обычный безработный из брехвиля", City.BREHVILL, Condition.NEUTRAL, Status.UNEMPLOYED);
        Newspaper newspaper = new Newspaper("какая-то газета"){ };
        newspaper.setInfo("меньше, чем где бы то ни было, фабриканты платят рабочим в городе Сан-Комарике и там наибольшее количество безработных");
        System.out.println(scooperfield.whatWish());
        System.out.println(unemployed1.whatDoItKnow());
        unemployed1.getHiredTo(scooperfield);
        scooperfield.read(newspaper);
        scooperfield.setWish("поехать в другой город и навербовать там рабочих для своей фабрики");
        System.out.println(scooperfield.whatWish());
    }
}
