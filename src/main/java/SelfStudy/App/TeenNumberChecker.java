package SelfStudy.App;

public class TeenNumberChecker {
    public static void main(String[] args) {
        System.out.println(hasTeen(16, 13, 19));
        System.out.println(hasTeen(-1, 14, 50));
        System.out.println(hasTeen(44, 12, 20));

    }

    public static boolean hasTeen(int age1, int age2, int age3) {
        if ((age1 > 12 && age1 < 20) || (age2 > 12 && age2 < 20) || (age3 > 12 && age3 < 20)) {
            return true;
        } else return false;
    }
}
