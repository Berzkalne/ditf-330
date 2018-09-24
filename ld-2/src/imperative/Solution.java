package imperative;

public class Solution {

    static int superDigit(int x) {
        return x == 0 ? 0 : x % 10 + superDigit(x / 10);
    }
}
