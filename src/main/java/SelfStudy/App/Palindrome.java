package SelfStudy.App;

public class Palindrome {
    public static void main(String[] args) {

        System.out.println(isPalindrome(12033021));
    }

    public static boolean isPalindrome(int number) {
        int reverse = 0;
        int num = number;
        while (number != 0) {
            int lastDigit = number % 10;
            number = number / 10;
            reverse = (reverse * 10) + lastDigit;
            if (num == reverse) {
                return true;
            }
        }
        return false;
    }
}