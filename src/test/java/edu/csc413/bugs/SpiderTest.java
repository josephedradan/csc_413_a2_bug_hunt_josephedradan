/*
 * Created by Joseph Edradan
 *
 * Github: https://github.com/josephedradan
 *
 * Date created: 2/28/2021
 *
 * Purpose:
 *      Test the Spider class
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

class SpiderTest {
    private Spider spider;

    @BeforeEach
    void setUp() {
        spider = new Spider("Elise");
    }

    @Test
    void getName_Elise_Elise() {
        Assertions.assertEquals(spider.getName(), "Elise");
    }

    @Test
    void getNumLegs_10_10() {
        Assertions.assertEquals(spider.getNumLegs(), 8);
    }

    @Test
    void canFly_false_false() {
        Assertions.assertFalse(spider.canFly());
    }

    @Test
    void specialTrait_webs_webs() {
        Assertions.assertEquals(spider.specialTrait(), "webs");
    }
}