package SelfStudy.Utilities.udemy;

import SelfStudy.Utilities.Utilities;
import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertEquals;

@RunWith(JUnitParamsRunner.class)
public class UtilitiesTestParametrized {
    private Utilities util;

    @Before
    public void setUp() {
        util = new Utilities();
    }


    public Object[] testConditions() {
        return new Object[]{
                new Object[]{"ABCDEFF", "ABCDEF"},
                new Object[]{"AB88EFFG", "AB8EFG"},
                new Object[]{"112233445566", "123456"},
                new Object[]{"A", "A"}
        };
    }

    @Test
    @Parameters(method = "testConditions")
    public void testForRemovePairs(String actual, String expected) {
        assertEquals(expected, util.removePairs(actual));
    }

    @Test
    @Parameters({"ABCDEFF, ABCDEF",
            "AB88EFFG, AB8EFG"
    })
    public void testForRemovePairs2(String actual, String expected) {
        assertEquals(expected, util.removePairs(actual));

    }
}