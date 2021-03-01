package edu.csc413.bugs;

/**
 * Represents a Wasp, which is a type of Bug.
 */
public class Wasp extends Bug {
    public Wasp(String name) {
        super(name, 6);
    }

    public boolean canFly() {
        return true;
    }

    public String specialTrait() {
        return "mean";
    }
}
