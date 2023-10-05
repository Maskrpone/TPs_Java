public class Airplane {
    final private int id;
    final private String idCountry;
    final private String type;
    final private String airport;
    final private String name;
    final private double weight;
    final private int capacity;
    final private int maxDistance;
    final private String icao;

    private TestAirplane[] tests;

    public Airplane() {
        this.id = 0;
        this.idCountry = "Null";
        this.type = "Null";
        this.airport = "Null";
        this.name = "Null";
        this.weight = 0;
        this.capacity = 0;
        this.maxDistance = 0;
        this.icao = "Null";
        this.tests = new TestAirplane[0];
    }

    public Airplane(int id, String idCountry, String type, String airport, String name, double weight, int capacity, int maxDistance, String icao, TestAirplane test) {
        this.id = id;
        this.idCountry = idCountry;
        this.type = type;
        this.airport = airport;
        this.name = name;
        this.weight = weight;
        this.capacity = capacity;
        this.maxDistance = maxDistance;
        this.icao = icao;
        this.tests = new TestAirplane[10];
        this.tests[0] = test;
    }

    final public int getId() {
        return this.id;
    }

    final public String getIdCountry() {
        return this.idCountry;
    }

    final public String getType() {
        return this.type;
    }

    final public String getAirport() {
        return this.airport;
    }

    final public String getName() {
        return this.name;
    }

    final public String getIcao() {
        return this.icao;
    }

    final public int getCapacity() {
        return this.capacity;
    }

    final public int getMaxDistance() {
        return this.maxDistance;
    }

    final public double getWeight() {
        return this.weight;
    }

    final public TestAirplane[] getTests() {
        return this.tests;
    }

    public void addTest(TestAirplane test) {
        // we need to make the array bigger if it's full
        if (this.tests[this.tests.length - 1] != null) {
            TestAirplane[] newTests = new TestAirplane[this.tests.length + 10];
            System.arraycopy(this.tests, 0, newTests, 0, this.tests.length);
            this.tests = newTests;
        }

        for (int i = 0; i < this.tests.length; i++) {
            if (this.tests[i] == null) {
                this.tests[i] = test;
                return;
            }
        }
    }

    public void checkInfos() {
        System.out.println("Id: " + this.getId());
        System.out.println("Id country: " + this.getIdCountry());
        System.out.println("Type: " + this.getType());
        System.out.println("Airport: " + this.getAirport());
        System.out.println("Name: " + this.getName());
        System.out.println("Weight: " + this.getWeight());
        System.out.println("Capacity: " + this.getCapacity());
        System.out.println("Max distance: " + this.getMaxDistance());
        System.out.println("Icao: " + this.getIcao());
        System.out.println("Tests: " + this.getTests().length);
        System.out.println("-----------------");
    }
}

