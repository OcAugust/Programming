public enum Status {
    WORKER("рабочий"),
    UNEMPLOYED("безработный"),
    OLIGARCH("фабрикант"),
    DEAD("мертвый");
    private String translation;
    Status(String translation){
        this.translation =translation;
    }
    public String getTranslation(){
        return translation;
    }
}
