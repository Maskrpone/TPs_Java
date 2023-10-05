// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Hours empty = new Hours();
        empty.checkInfos();

        Hours firstConstruct = new Hours(3,30, 40);
        firstConstruct.checkInfos();

        Hours secondConstruct = new Hours(3.511111111111111);
        secondConstruct.checkInfos();

        System.out.println("\n\n");


        // We test each class with empty constructor
        Technician emptyTechnician = new Technician();
        emptyTechnician.checkInfos();

        Airplane emptyAirplane = new Airplane();
        emptyAirplane.checkInfos();

        TestAirplane emptyTestAirplane = new TestAirplane();
        emptyTestAirplane.checkInfos();

        Flight emptyFlight = new Flight();
        emptyFlight.checkInfos();

        System.out.println("\n\n");

        // we now test with the full constructor
        Flight fullFlight = getFullFlight();
        fullFlight.checkInfos();

        
    }

    private static Flight getFullFlight() {
        Technician fullTechnician = new Technician("1", "John", "Doe", "01/01/2000", "0123456789", 1000, true);
        fullTechnician.checkInfos();

        TimeInfo fullTimeInfo = new TimeInfo(3, 30, 12, 12, 2020);

        TestAirplane fullTestAirplane = new TestAirplane(1, "A320", true);

        Airplane fullAirplane = new Airplane(1, "FR", "A320", "Paris", "Airbus", 573.17, 100, 1000, "A320", fullTestAirplane);

        return new Flight(fullTechnician, fullTechnician, fullAirplane, "Paris", "New York", fullTimeInfo);
    }
}