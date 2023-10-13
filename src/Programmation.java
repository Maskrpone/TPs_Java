// Author: Hippolyte DEPARIS
import java.util.Objects;
public class Programmation {
    private final Emission[] program;
    private int index = 0;
    public Programmation() {
        this.program = new Emission[24];
        for (int i = 0; i < 24; i++) {
            this.program[i] = new Entertainment("None", "None");
        }
    }
    public boolean avoidOverlap(int hour, int duration) {
        for (int i = 0; i < this.index + 1; i++) {
            if (hour >= this.program[i].getStart() && hour <= this.program[i].getStart() + this.program[i].getDuration()) {
                return false;
            } else if (hour + duration >= this.program[i].getStart() && hour + duration <= this.program[i].getStart() + this.program[i].getDuration()) {
                return false;
            }
        }
        return true;
    }
    public void add(Emission emission) throws InvalidSchedule {
        if(!emission.isValid())
            throw new InvalidSchedule();
        if(!avoidOverlap(emission.getStart(), emission.getDuration()))
            throw new InvalidSchedule("This emission would overlap with another one.");

        this.program[this.index] = emission;
        this.index++;
    }
    public void displayProgram() {
        if (Objects.equals(this.program[0].getName(), "None"))
            System.out.println("You have not set anything yet for this day.");
        for (int i = 0; i < this.index; i++) {
            System.out.println("From " + this.program[i].getStart() + "h until " + this.program[i].getStart() + this.program[i].getDuration() + "h : ");
            this.program[i].print();
        }
    }
}
