package edu.csc413.bugs;

/**
 * Represents a Spider, which is a type of Bug (sorta technically not, but this isn't a Biology class).
 */
public class Spider extends Bug {
    public Spider(String name) {
        super(name, 8);
    }

    public String specialTrait() {
        return "webs";
    }
}
