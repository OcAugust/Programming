public enum Salary {
    ONE_FERTING("один фертинг"),
    LESS_THAN_FERTING("меньше чем один фертинг"),
    MORE_THAN_FERTING("больше чем один фертинг"),
    UNKNOWN("неизвестна"),
    WITHOUT("без дохода");
    private String translation;
    Salary(String translation){
        this.translation =translation;
    }
    public String getTranslation(){
        return translation;
    }


}
