// Author: Hippolyte DEPARIS
public class Report extends Emission{
    private final String theme;
    public Report(String name, String theme, int duration){
        super(name, duration);
        this.theme = theme;
    }

    // getters
    public String getTheme(){
        return this.theme;
    }
    @Override
    public void print(){
        System.out.println("Name: " + this.getName());
        System.out.println("Theme: " + this.getTheme());
        System.out.println("Duration: " + this.getDuration() + " minutes");
    }
}
