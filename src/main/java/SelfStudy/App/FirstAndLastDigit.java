package SelfStudy.App;

public class FirstAndLastDigit {
    public static void main(String[] args) {
        System.out.println("Sum of first and the last digit in given number is: " + sumFirstAndLastDigit(2789));
        System.out.println("Sum of first and the last digit in given number is: " + sumFirstAndLastDigit(0));
        System.out.println("Sum of first and the last digit in given number is: " + sumFirstAndLastDigit(10));
        System.out.println("Sum of first and the last digit in given number is: " + sumFirstAndLastDigit(-10));
    }

    public static int sumFirstAndLastDigit(int number) {
        int lastDigit = number % 10;
        while (number >= 0) {
            if (number >= 10) {
                number = number / 10;
            }
            if (number < 10) {
                return lastDigit + number;
            }
        }
        return -1;
    }
}