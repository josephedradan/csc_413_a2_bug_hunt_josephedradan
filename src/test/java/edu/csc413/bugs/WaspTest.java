/*
 * Created by Joseph Edradan
 *
 * Github: https://github.com/josephedradan
 *
 * Date created: 2/28/2021
 *
 * Purpose:
 *      Test the Wasp class
 *
 * Details:
 *
 * Description:
 *
 * Notes:
 *
 * IMPORTANT NOTES:
 *
 * Explanation:
 *
 * Reference:
 *
 */

package edu.csc413.bugs;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class WaspTest {

    private Wasp wasp;

    /**
     * Set up for each Test, assuming that the constructor works
     */
    @BeforeEach
    void setUp() {
        wasp = new Wasp("Joseph");
    }

    @Test
    void getName_Joseph_Joseph() {
        Assertions.assertEquals(wasp.getName(), "Joseph");
    }

    @Test
    void getNumLegs_6_6() {
        Assertions.assertEquals(wasp.getNumLegs(), 6);
    }

    @Test
    void canFly_true_true() {
        assertTrue(wasp.canFly());
    }

    @Test
    void specialTrait_mean_mean() {
        Assertions.assertEquals(wasp.specialTrait(), "mean");
    }
}