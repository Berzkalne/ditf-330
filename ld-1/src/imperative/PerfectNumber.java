package imperative;

import java.util.Set;
import java.util.HashSet;

public class PerfectNumber {
    public enum STATE { ABUNDANT, DEFICIENT, PERFECT, ERROR }

    public static STATE detect(int number) {
        return (number > 0 ? process(number) : STATE.ERROR);
    }

    public static Set<Integer> divisors(int number) {
        Set list = new HashSet();

        for (int i = 1; i <= number ; i++) {
            if (number % i == 0) {
                list.add(i);
            }
        }
        return list;
    }

    public static STATE process(int number) {
        int divisor_sum = divisors(number).stream().mapToInt(Integer::intValue).sum() / 2;

        if (divisor_sum == number) {
            return STATE.PERFECT;
        } else if (divisor_sum > number) {
            return STATE.ABUNDANT;
        } else {
            return STATE.DEFICIENT;
        }
    }
}
