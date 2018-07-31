package SelfStudy.App;

public class DayofWeek {
    public static void main(String[] args) {
        printDayofWeek(0);
        printDayofWeek(1);
        printDayofWeek(2);
        printDayofWeek(3);
        printDayofWeek(4);
        printDayofWeek(5);
        printDayofWeek(6);
    }

    public static void printDayofWeek(int day) {
        switch (day) {
            case 0:
                System.out.println("Sunday");
                break;
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Invalid day");
        }
    }
}
