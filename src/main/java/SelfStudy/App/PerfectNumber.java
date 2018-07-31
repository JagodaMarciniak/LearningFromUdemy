package SelfStudy.App;

public class PerfectNumber {
    public static void main(String[] args) {
        System.out.println(isPerfectNumber(6));
        System.out.println(isPerfectNumber(28));
        System.out.println(isPerfectNumber(5));
        System.out.println(isPerfectNumber(-1));
    }

    public static boolean isPerfectNumber(int number) {
        int x = 1;
        int sum = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                x = i;
                sum += i;
            }
            if (sum == number) {
                return true;
            }
        }
        return false;
    }
}
