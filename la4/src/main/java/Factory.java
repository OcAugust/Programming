public enum Factory {
    WORKS("фабрика работает"),
    STOPPED("фабрика остановила свою работу");
    private String translation;
    Factory(String translation){
        this.translation =translation;
    }
    public String getTranslation(){
        return translation;
    }
}
