package imperative;

import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class PerfectNumberFunctional {
    public enum STATE { ABUNDANT, DEFICIENT, PERFECT, ERROR }

    public static STATE detect(int number) {
        return (number > 0 ? process(number) : STATE.ERROR);
    }

    public static Set<Integer> divisors(int number) {
        Set<Integer> list = IntStream
                .rangeClosed(1, number)
                .filter(i -> number % i == 0)
                .boxed()
                .collect(Collectors.toSet());

        return list;
    }

    public static STATE process(int number) {
        int divisor_sum = divisors(number).stream().mapToInt(Integer::intValue).sum() / 2;

        return (divisor_sum == number ? STATE.PERFECT : divisor_sum > number ? STATE.ABUNDANT : STATE.DEFICIENT);
    }
}
