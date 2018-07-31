package SelfStudy.App;

public class IsEvenNumber {
    public static void main(String[] args) {
        System.out.println(isEvenNumber(10));
    }

    public static boolean isEvenNumber(int number) {
        while (number % 2 == 0) {
            return true;
        }
        return false;
    }
}
