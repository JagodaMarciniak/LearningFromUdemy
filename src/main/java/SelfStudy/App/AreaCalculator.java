package SelfStudy.App;

public class AreaCalculator {
    public static void main(String[] args) {
        System.out.println(area(5.0));
        System.out.println(area(-1));
        System.out.println(area(5.0, 4.0));
        System.out.println(area(-1.0, 4.0));
    }

    public static final double NEGATIVE_VALUE = -1.0;

    public static double area(double x, double y) {
        if (x < 0 || y < 0) {
            return NEGATIVE_VALUE;
        }
        return x * y;
    }

    public static double area(double radius) {
        if (radius < 0) {
            return NEGATIVE_VALUE;
        }
        return 3.14159 * radius * radius;
    }
}
