package edu.csc413.bugs;

import java.util.ArrayList;

/**
 * Represents a collection of Bugs.
 */
public class Terrarium {
    private ArrayList<Bug> bugs;

    /**
     * Creates an empty Terrarium.
     */
    public Terrarium() {
        bugs = new ArrayList<>();
    }

    /**
     * Adds some preset Bugs to the Terrarium.
     */
    public void setUpBugs() {
        bugs.add(new Beetle("Juice"));
        bugs.add(new Spider("Charlotte"));
        bugs.add(new Wasp("Boris"));
    }

    /**
     * Returns the number of Bugs in the Terrarium.
     */
    public int getNumBugs() {
        return bugs.size();
    }

    /**
     * Returns the Bug at the specified index in the Terrarium's list of Bugs.
     */
    public Bug getBug(int index) {
        return bugs.get(index);
    }

    /**
     * Searches for a Bug with the specified name and returns it. Returns null if there isn't a Bug with that name.
     */
    public Bug getBugWithName(String name) {
        for (Bug bug : bugs) {
            if (bug.getName().equals(name)) {
                return bug;
            }
        }
        return null;
    }

    /**
     * Returns a list of all Bugs that have the specified number of legs.
     */
    public ArrayList<Bug> getBugsWithLegs(int numLegs) {
        ArrayList<Bug> result = new ArrayList<>();
        for (Bug bug : bugs) {
            if (bug.getNumLegs() == numLegs) {
                result.add(bug);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Terrarium terrarium = new Terrarium();
        terrarium.setUpBugs();

        System.out.println("Terrarium created!");
        System.out.println("Number of bugs: " + terrarium.getNumBugs());
        System.out.println("Bug info:");
        for (int i = 0; i < terrarium.getNumBugs() - 1; i++) {
            Bug bug = terrarium.getBug(i);
            String message =
                    String.format(
                            "- %s: %d legs, %s fly",
                            bug.getName(),
                            bug.getNumLegs(),
                            bug.canFly() ? "can" : "cannot");
            System.out.println(message);
        }
    }
}
