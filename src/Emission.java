// Authors: Hippolyte DEPARIS

/*
* Abstract class called Emission, which is the parent class of Movie, Report and Entertainment.
* It contains all methods and attributes that are common to all of its child-classes.
*/

abstract class Emission {
    private final String name;
    private final int duration;

    // Constructor used with super() in child-classes.
    public Emission(String name, int duration) {
        this.name = name;
        this.duration = duration;
    }

    public String getName() { return this.name; }

    public int getDuration() { return this.duration; }

    public abstract void print();

}
