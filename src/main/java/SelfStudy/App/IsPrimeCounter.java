package SelfStudy.App;

public class IsPrimeCounter {
    public static void main(String[] args) {
        System.out.println(isPrime(3));

        int counter = 0;
        for (int i = 20; i < 80; i++) {

            if (isPrime(i)) {
                counter++;
                System.out.println(i);
            }
            if (counter == 3) {
                break;
            }
        }
    }

    public static boolean isPrime(int n) {
        if (n == 1) {
            return false;
        }
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}