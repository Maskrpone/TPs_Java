public class Flight {
    private Technician pilot;
    private Technician copilot;
    private Airplane plane;
    private String fromCity;
    private String toCity;
    private TimeInfo specs;

    public Flight() {
        this.pilot = new Technician();
        this.copilot = new Technician();
        this.plane = new Airplane();
        this.fromCity = "Null";
        this.toCity = "Null";
        this.specs = new TimeInfo();
    }

    public Flight(Technician pilot, Technician copilot, Airplane plane, String fromCity, String toCity, TimeInfo specs) {
        this.pilot = pilot;
        this.copilot = copilot;
        this.plane = plane;
        this.fromCity = fromCity;
        this.toCity = toCity;
        this.specs = specs;
    }

    final public Technician getPilot() {
        return this.pilot;
    }

    final public Technician getCopilot() {
        return this.copilot;
    }

    final public Airplane getPlane() {
        return this.plane;
    }

    final public String getFromCity() {
        return this.fromCity;
    }

    final public String getToCity() {
        return this.toCity;
    }

    final public TimeInfo getSpecs() {
        return this.specs;
    }

    public void setPilot(Technician pilot) {
        this.pilot = pilot;
    }

    public void setCopilot(Technician copilot) {
        this.copilot = copilot;
    }

    public void setPlane(Airplane plane) {
        this.plane = plane;
    }

    public void setFromCity(String fromCity) {
        this.fromCity = fromCity;
    }

    public void setToCity(String toCity) {
        this.toCity = toCity;
    }

    public void setSpecs(TimeInfo specs) {
        this.specs = specs;
    }

    public void checkInfos() {
        System.out.println("Pilot: " + this.getPilot().getFirstname() + " " + this.pilot.getSurname());
        System.out.println("Copilot: " + this.getCopilot().getFirstname() + " " + this.copilot.getSurname());
        System.out.println("Plane: " + this.getPlane().getName());
        System.out.println("From: " + this.getFromCity());
        System.out.println("To: " + this.getToCity());
        System.out.println("Departure: " + this.getSpecs().getDay() + "/" + this.getSpecs().getMonth() + "/" + this.getSpecs().getYear() + " at " + this.getSpecs().getHours() + ":" + this.getSpecs().getMinutes());
        System.out.println("-----------------");
    }
}
