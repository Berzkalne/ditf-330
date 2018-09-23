package imperative;

public class Main {

    public static void main(String[] args) {
        System.out.println(superDigit(11));
        System.out.println(superDigit(2));
        System.out.println(superDigit(12345));
        System.out.println(superDigit(513));
    }

    static int superDigit(int x) {
        return x == 0 ? 0 : x % 10 + superDigit(x / 10);
    }
}
