package edu.csc413.bugs;

/** Represents a Wasp, which is a type of Bug. */
public class Wasp extends Bug {
    public Wasp(String name) {
        super(name, 6);
    }

    // TODO ERROR: This is meant to override a method, but it's misspelled.
    public boolean cantFly() {
        return true;
    }

    public String specialTrait() {
        // TODO ERROR: Should be "mean" instead.
        return "nice";
    }
}
