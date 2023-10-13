// Author: Hippolyte DEPARIS

/*
* Abstract class called Emission, which is the parent class of Movie, Report and Entertainment.
* It contains all methods and attributes that are common to all of its child-classes.
*/

public abstract class Emission {
    private final String name;
    private int start = 0;
    private final int duration;
    public Emission(String name, int duration) {
        this.name = name;
        this.duration = duration;
    }
    public String getName() { return this.name; }
    public int getStart() {return this.start;}
    public int getDuration() { return this.duration; }
    public void setStart(int start) {
        this.start = start;
    }
    public abstract void print();
    public abstract boolean isValid();

}
