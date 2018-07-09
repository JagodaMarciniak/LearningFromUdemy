package ja;

public class DecimalComparator {
    public static void main(String[] args) {

        System.out.println(areEqualByThreeDecimalPlaces(3.176, 3.175));
        System.out.println(areEqualByThreeDecimalPlaces(5.0, 5.0));
        System.out.println(areEqualByThreeDecimalPlaces(3.1756, 3.1757));
    }

    public static boolean areEqualByThreeDecimalPlaces(double number1, double number2) {
        return ((int) (number1 * 1000) == (int) (number2 * 1000));
    }
}
