package edu.csc413.bugs;

/**
 * Represents a Beetle, which is a type of Bug.
 */
public class Beetle extends Bug {

    public Beetle(String name) {
        super(name, 6);
    }

    /**
     * Some beetles can fly.
     */
    public boolean canFly() {
        return true;
    }

    public String specialTrait() {
        return "strong";
    }
}
