// Author: Hippolyte DEPARIS
public class Report extends Emission{
    private final String theme;
    public Report(String name, String theme, int duration){
        super(name, duration);
        this.theme = theme;
    }
    public String getTheme(){
        return this.theme;
    }
    @Override
    public void print(){
        System.out.println("Name: " + this.getName());
        System.out.println("Theme: " + this.getTheme());
        System.out.println("Duration: " + this.getDuration() + " minutes");
    }
    @Override
    public boolean isValid() {
        if (this.getDuration() != 1) {
            return false;
        } else if (this.getStart() >= 0 && this.getStart() <= 6 && this.getStart() + this.getDuration() <= 6) {
            return true;
        } else return this.getStart() >= 14 && this.getStart() <= 18 && this.getStart() + this.getDuration() <= 18;
    }
}
