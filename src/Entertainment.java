// Author: Hippolyte DEPARIS
public class Entertainment extends Emission {
    private final String presenter;
    public Entertainment(String name, String presenter) {
        super(name, 2);
        this.presenter = presenter;
    }
    @Override
    public void print() {
        System.out.println("Name: " + this.getName());
        System.out.println("Presenter: " + this.presenter);
        System.out.println("Duration: " + this.getDuration() + " minutes");
    }
    @Override
    public boolean isValid() {
        return this.getStart() >= 18 && this.getStart() + this.getDuration() <= 23;
    }
}
