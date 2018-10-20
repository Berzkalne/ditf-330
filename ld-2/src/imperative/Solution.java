package imperative;

import java.util.stream.LongStream;

public class Solution {

    static long superDigit(long x) {
        long sum_of_digits = LongStream.rangeClosed(1, (int) (Math.log10(Math.abs(x)) + 1))
                .map(i -> (x / (long) Math.pow(10, i - 1)) % 10)
                .sum();

        return (sum_of_digits == x) ? sum_of_digits : superDigit(sum_of_digits);
    }
}
