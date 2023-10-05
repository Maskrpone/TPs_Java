public class TestAirplane {
    final private int id;
    final private String label;
    final private boolean valid;

    public TestAirplane() {
        this.id = 0;
        this.label = "Null";
        this.valid = false;
    }

    public TestAirplane(int id, String label, boolean valid) {
        this.id = id;
        this.label = label;
        this.valid = valid;
    }

    final public int getId() {
        return this.id;
    }

    final public String getLabel() {
        return this.label;
    }

    final public boolean isValid() {
        return this.valid;
    }

    public void checkInfos() {
        System.out.println("Id: " + this.id);
        System.out.println("Label: " + this.label);
        System.out.println("Valid: " + this.valid);
        System.out.println("-----------------");
    }
}
