/*
 * Created by Joseph Edradan
 *
 * Github: https://github.com/josephedradan
 *
 * Date created: 2/28/2021
 *
 * Purpose:
 *      Test the Terrarium class
 *
 * Details:
 *
 * Description:
 *
 * Notes:
 *      Terrarium Default Constructor test might be unnecessary
 *
 * IMPORTANT NOTES:
 *
 * Explanation:
 *
 * Reference:
 *      Unit test naming best practices [closed]
 *          Notes:
 *              modified version of [UnitOfWork_StateUnderTest_ExpectedBehavior]
 *          Reference:
 *              https://stackoverflow.com/questions/155436/unit-test-naming-best-practices
 *      How to test that no exception is thrown?
 *          Reference:
 *              https://stackoverflow.com/questions/17731234/how-to-test-that-no-exception-is-thrown
 */

package edu.csc413.bugs;

import org.junit.jupiter.api.*;

import java.util.ArrayList;

public class TerrariumTest {
    /**
     * Test the default constructor even works
     */
    @DisplayName("Terrarium Default Constructor")
    @Test
    void terrarium_noThrow_noThrow() {
        Assertions.assertDoesNotThrow(Terrarium::new);
    }


    /**
     * Assumes that Default Terrarium works
     */
    @DisplayName("Terrarium Default Constructor (Assuming that it works)")
    @Nested
    class TerrariumDefault {

        private Terrarium terrarium;

        @BeforeEach
        void setUp() {
            terrarium = new Terrarium();
        }

        /**
         * Test Terrarium's setUpBugs method will run
         * Can't really verify that a known, fixed input produces a known fixed output
         * this mothod should not throw
         */
        @DisplayName("setUpBugs_setUpBugs_Success (setUpBugs is assumed to be hard coded)")
//        @Disabled
        @Test
        void setUpBugs_setUpBugs_Success() {
            Assertions.assertDoesNotThrow(() -> terrarium.setUpBugs());
        }

        /**
         * Test if getting the number bugs has the default size of 3 based on the 3 initial bugs.
         * The initial amount of bugs should be hard coded to 3
         */
        @Test
        void getNumBugs_setUpBugs_AmountBugSetUpBugs3() {
            terrarium.setUpBugs();

            Assertions.assertEquals(terrarium.getNumBugs(), 3);
        }

        /**
         * Test if setUpBugs bugs are in the terrarium
         */
        @Test
        void getBugWithName_setUpBugsWithCorrespondingName_BugSetUpBugsExist_AmountTest4() {
            terrarium.setUpBugs();

            Assertions.assertAll(
                    () -> Assertions.assertNotNull(terrarium.getBugWithName("Juice")),
                    () -> Assertions.assertNotNull(terrarium.getBugWithName("Charlotte")),
                    () -> Assertions.assertNotNull(terrarium.getBugWithName("Boris"))
            );
        }

        @Test
        void getBugWIthName_NonExistingName_null() {
            terrarium.setUpBugs();

            Assertions.assertNull(terrarium.getBugWithName("Obama"));

        }

        /**
         * Note that you should not test the implementation of the the get method. You Should test if the position
         * of the bug is in the correct position.
         */
        @Test
        void getBug_setUpBugsWithCorrespondingIndex_BugSetUpBugsExist_AmountTest4() {
            terrarium.setUpBugs();

            Assertions.assertAll(
                    () -> Assertions.assertEquals(terrarium.getBug(0), terrarium.getBugWithName("Juice")),
                    () -> Assertions.assertEquals(terrarium.getBug(1), terrarium.getBugWithName("Charlotte")),
                    () -> Assertions.assertEquals(terrarium.getBug(2), terrarium.getBugWithName("Boris"))
            );
        }

        @Test
        void getBugsWithLegs_setUpBugs_ArraylistBug_AmountTest2() {
            terrarium.setUpBugs();

            ArrayList<Bug> legs6 = new ArrayList<>();
            legs6.add(terrarium.getBugWithName("Juice"));
            legs6.add(terrarium.getBugWithName("Boris"));

            ArrayList<Bug> legs10 = new ArrayList<>();
            legs10.add(terrarium.getBugWithName("Charlotte"));

            Assertions.assertAll(
                    () -> Assertions.assertEquals(terrarium.getBugsWithLegs(6), legs6),
                    () -> Assertions.assertEquals(terrarium.getBugsWithLegs(8), legs10)
            );
        }
    }
}
