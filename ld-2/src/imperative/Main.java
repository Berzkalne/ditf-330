package imperative;

public class Main {

    public static void main(String[] args) {
        System.out.print(digitSum(2345));
    }

    static int digitSum(int n){
        if (Integer.toString(n).length() == 1) {
            return n;
        } else {
            return superDigit(n);
        }
    }

    static int superDigit(int x) {
        return x == 0 ? 0 : x % 10 + superDigit(x/10);
    }
}
