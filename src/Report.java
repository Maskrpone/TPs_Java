public class Report extends Show {
    private final String theme;

    public Report(String name, int duration, String theme) {
        super(name, duration);
        this.theme = theme;
    }

    public void display() {
        System.out.println("-------------");
        System.out.println("Name of report : " + this.getName());
        System.out.println("Duration of report : " + this.getDuration());
        System.out.println("Theme of the report : " + this.theme);
    }
}
