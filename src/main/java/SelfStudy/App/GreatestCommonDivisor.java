package SelfStudy.App;

public class GreatestCommonDivisor {
    public static void main(String[] args) {
//        System.out.println(getGreatestCommonDivisior(25, 15));
        System.out.println(getGreatestCommonDivisor(12, 30));
    }

    public static int getGreatestCommonDivisor(int first, int second) {
        int x = 1;
        if (first < 10 || second < 10) return -1;

        for (int i = 1; i <= first || i <= second; i++) {
            if ((first % i == 0) && (second % i == 0)) x = i;
        }
        return x;
    }

}

