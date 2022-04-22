public enum Condition {
    MISER("жмот"),
    GENEROUS("щедрый"),
    OUTRAGED("возмущен"),
    HELPING_OUT("помогает"),
    NEUTRAL("нейтральный");
    private String translation;
    Condition(String translation){
        this.translation =translation;
    }
    public String getTranslation(){
        return translation;
    }
}
