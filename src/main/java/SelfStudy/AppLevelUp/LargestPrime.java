package SelfStudy.AppLevelUp;

public class LargestPrime {
    public static void main(String[] args) {
        System.out.println(getLargestPrime(45));
        System.out.println(getLargestPrime(217));
        System.out.println(getLargestPrime(0));
        System.out.println(getLargestPrime(45));
        System.out.println(getLargestPrime(-1));

    }

    public static int getLargestPrime(int number) {
        if (number <= 1) {
            return -1;
        }
        int i = number;
        while (i > 1) {
            if (number % i == 0) {
                number = i;
            }
            i--;
        }
        return number;
    }
}