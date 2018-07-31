package SelfStudy.App;

public class SharedDigit {
    public static void main(String[] args) {
        System.out.println(hasShareDigit(65, 54));
        System.out.println(hasShareDigit(9, 99));
        System.out.println(hasShareDigit(15, 55));
    }

    public static boolean hasShareDigit(int x, int y) {
        while (x > 10 && x < 100 && y > 10 && y < 100) {
            int xDigit = x % 10;
            x /= 10;
            while (y > 0) {
                int yDigit = y % 10;
                y /= 10;
                if (xDigit == yDigit) {
                    return true;
                }
            }
        }
        return false;
    }
}

