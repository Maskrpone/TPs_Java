public class Programmation {
    private final boolean[] timetable;
    public Programmation() {
        this.timetable = new boolean[24];
        for (int i = 0; i < 24; i++) {
            this.timetable[i] = true;
        }
    }

    public boolean getHour(int hour) {
        return this.timetable[hour - 1];
    }

    public void setHour(int hour) {
        timetable[hour - 1] = !timetable[hour - 1];
    }

    public void createProgram() {
        // TODO -> create the function that asks what type of content we want to program
    }

    // TODO -> See to optimize this, maybe change this class to put programs as a stack, with begin and end values in the Emission class as legacy for child classes
    public int setProgram(int hour, Emission emission) {
        if (this.getHour(hour)) {
            int availability = 0;
            for (int i = 0; i < emission.getDuration(); i++) {
                if (!this.getHour(hour + i)) {
                    availability++;
                }
            }
            if (availability == 0) {
                for (int i = 0; i < emission.getDuration(); i++) {
                    this.setHour(hour + i);
                }
            } else {
                System.err.println("Error: Booking can't be made, there is not enough free time ahead...");
                return 1;
            }
        } else {
            System.err.println("Error: Booking can't be made, time slot unavailable...");
            return 1;
        }
        return 0;
    }
    // this function will be used to print the formatted timetable
    public void print() {
        System.out.println("Timetable:");
        System.out.println("Hour\t\tAvailability");
        for (int i = 0; i < 24; i++) {
            System.out.print(i + 1 + "h\t\t");
            if (this.getHour(i + 1)) {
                System.out.println("Available");
            } else {
                System.out.println("Unavailable");
            }
        }
    }
    public void printv2() {
        System.out.println("Timetable : ");
        boolean availability = this.getHour(1);
        System.out.print("\t0h\t");
        for (int i = 1; i < 24; i++) {
            if (this.getHour(i) != availability) {
                System.out.print(((availability) ? "Available" : "unavailable" ) + "\t" + i + "h" + "\t");
                availability = !availability;
            }
        }
        System.out.print("\t" + ((availability) ? "available" : "unavailable") + "\t" + "24h");
    }
}
