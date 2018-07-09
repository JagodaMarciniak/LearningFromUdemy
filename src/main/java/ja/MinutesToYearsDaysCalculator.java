package ja;

public class MinutesToYearsDaysCalculator {
    public static void main(String[] args) {
        printYearsAndDays(525600);
        printYearsAndDays(1051200);
        printYearsAndDays(-100);
    }

    public static void printYearsAndDays(long minutes) {
        if (minutes < 0) {
            System.out.println("Invalid Value");
        } else {
            long calc = 365 * 24 * 60;
            long y = minutes / calc;
            long remainingMinutes = minutes % calc;
            long d = remainingMinutes / (24 * 60);
            System.out.println(minutes + " min = " + y + " y and " + d + " d");
        }
    }
}
