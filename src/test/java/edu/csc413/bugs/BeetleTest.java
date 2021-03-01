/*
 * Created by Joseph Edradan
 *
 * Github: https://github.com/josephedradan
 *
 * Date created: 2/28/2021
 *
 * Purpose:
 *      Test the Beetle class
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

class BeetleTest {

    private Beetle beetle;

    @BeforeEach
    void setUp() {
        beetle = new Beetle("Hercules");
    }

    @Test
    void getName_Hercules_Hercules() {
        Assertions.assertEquals(beetle.getName(), "Hercules");
    }

    @Test
    void getNumLegs_6_6() {
        Assertions.assertEquals(beetle.getNumLegs(), 6);
    }

    @Test
    void canFly_true_true() {
        Assertions.assertTrue(beetle.canFly());
    }

    @Test
    void specialTrait_strong_strong() {
        Assertions.assertEquals(beetle.specialTrait(), "strong");
    }
}