package SelfStudy.Utilities.udemy;

import SelfStudy.Utilities.Utilities;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.*;

public class UtilitiesTest {
    private Utilities util;

    @Before
    public void setUp() {
        util = new Utilities();
    }

    @Test
    public void everyNthChar() throws Exception {
        char[] expected = {'e', 'l'};
        char[] actual = util.everyNthChar(new char[]{'h', 'e', 'l', 'l', 'o'}, 2);
        assertArrayEquals(expected, actual);
        assertNull(util.everyNthChar(null, 2));
        assertArrayEquals(new char[]{'h', 'e', 'l', 'l', 'o'}, util.everyNthChar(new char[]{'h', 'e', 'l', 'l', 'o'}, 8));
    }

    @Test
    public void removePairs() {

        assertEquals("ABCDEF", util.removePairs("AABCDDEFF"));
        assertEquals("A", util.removePairs("A"));
        assertEquals("", util.removePairs(""));
        assertNull("Did not get null returned when argument passed was null ", util.removePairs(null));
    }

    @Test
    public void converter() throws Exception {

        assertEquals(300, util.converter(10, 5));

    }

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test(expected = ArithmeticException.class)
    public void converter1() throws Exception {
        util.converter(10, 0);
    }

    @Test
    public void nullIfOddLength() throws Exception {
        assertNotNull(util.nullIfOddLength("jagoda"));
        assertNull(util.nullIfOddLength("grzegorze"));

    }
}