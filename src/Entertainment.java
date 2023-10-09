// Author: Hippolyte DEPARIS

public class Entertainment extends Emission {
    private final String presentator;
    public Entertainment(String name, String presentator) {
        super(name, 2);
        this.presentator = presentator;
    }

    public String getPresentator() {
        return this.presentator;
    }
    @Override
    public void print() {
        System.out.println("Name: " + this.getName());
        System.out.println("Presentator: " + this.getPresentator());
        System.out.println("Duration: " + this.getDuration() + " minutes");
    }
}
