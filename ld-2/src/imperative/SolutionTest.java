package imperative;

import org.junit.Test;
import static junit.framework.TestCase.assertEquals;

public class SolutionTest {
    @Test
    public void test11ToBe2() { assertEquals(2, Solution.superDigit(11)); }

    @Test
    public void test2ToBe2() { assertEquals(2, Solution.superDigit(2)); }

    @Test
    public void test12345ToBe15() { assertEquals(15, Solution.superDigit(12345)); }

    @Test
    public void test513ToBe9() { assertEquals(9, Solution.superDigit(513)); }

    @Test
    public void testMinus11ToBeMinus2() { assertEquals(-2, Solution.superDigit(-11)); }

    @Test
    public void test0ToBe0() { assertEquals(0, Solution.superDigit(0)); }
}
