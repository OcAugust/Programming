enum City{
    BREHVILL("Брехенвиль"),
    SAN_KOMARIK("Сан-Комарик"),
    OTHER_CITIES("другого города");
    private String translation;
    City(String translation){
        this.translation =translation;
    }
    public String getTranslation(){
        return translation;
    }
}
