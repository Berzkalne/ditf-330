package imperative;

import org.junit.Test;

import static imperative.PerfectNumberFunctional.STATE.ABUNDANT;
import static imperative.PerfectNumberFunctional.STATE.DEFICIENT;
import static imperative.PerfectNumberFunctional.STATE.PERFECT;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class PerfectNumberTestFunctional {
    @Test
    public void test6Perfect() {
        assertEquals(PERFECT, PerfectNumberFunctional.process(6));
    }

    @Test
    public void test8Deficient() {
        assertEquals(DEFICIENT, PerfectNumberFunctional.process(8));
    }

    @Test
    public void test20Abundant() {
        assertEquals(ABUNDANT, PerfectNumberFunctional.process(20));
    }

    @Test
    public void test16DeficientWithIntSqrt() {
        assertEquals(DEFICIENT, PerfectNumberFunctional.process(16));
    }

    @Test
    public void test1Deficient() {
        assertEquals(DEFICIENT, PerfectNumberFunctional.process(1));
    }

    @Test
    public void testDivisors1() {
        Object[] expected = new Integer[] { 1 };
        int n = 1;
        assertArrayEquals(expected, PerfectNumberFunctional.divisors(n).toArray());
    }

    @Test
    public void testDivisors6() {
        Object[] expected = new Integer[] { 1, 2, 3, 6 };
        int n = 6;
        assertArrayEquals(expected, PerfectNumberFunctional.divisors(n).toArray());
    }

    @Test
    public void testDivisors8() {
        Object[] expected = new Integer[] { 1, 2, 4, 8 };
        int n = 8;
        assertArrayEquals(expected, PerfectNumberFunctional.divisors(n).toArray());
    }
}
