public class Entertainment extends Show {
    private String speaker;

    public Entertainment() {
        super("None", 2);
        this.speaker = "None";
    }

    public Entertainment(String name, String speaker) {
        super(name, 2);
        this.speaker = speaker;
    }
    public void display() {
        System.out.println("-------------");
        System.out.println("Name of entertainment : " + this.getName());
        System.out.println("Duration of entertainment : " + this.getDuration());
        System.out.println("Name of the Speaker : " + this.speaker);
    }
}