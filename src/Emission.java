// Author: Hippolyte DEPARIS

/*
* Abstract class called Emission, which is the parent class of Movie, Report and Entertainment.
* It contains all methods and attributes that are common to all of its child-classes, and abstract methods who will be defined according to specific needs of each sub-classes.
*/

public abstract class Emission {
    private final String name;
    private int start = 0;
    private final int duration;
    // This constructor will be called by sub-classes using super()
    public Emission(String name, int duration) {
        this.name = name;
        this.duration = duration;
    }
    // getters
    public String getName() { return this.name; }
    public int getStart() {return this.start;}
    public int getDuration() { return this.duration; }

    public void setStart(int start) {
        this.start = start;
    }
    // abstract methods who will be defined differently for each sub-classes
    public abstract void print();
    public abstract boolean isValid();

}
