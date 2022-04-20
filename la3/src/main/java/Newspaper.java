public abstract class Newspaper implements Readable{
    protected String info;
    protected String name;

    Newspaper(String name){
        this.info = name;
    }

    @Override
    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public String getName(){
        return name;
    }
}
