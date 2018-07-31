package SelfStudy.App;

public class LastDigitChecker {
    public static void main(String[] args) {
        System.out.println(hasSameLastDigit(41, 22, 71));
        System.out.println(hasSameLastDigit(23, 32, 42));
        System.out.println(hasSameLastDigit(9, 99, 999));

    }

    public static boolean hasSameLastDigit(int x, int y, int z) {
        if (x >= 10 && x < 1000 && y >= 10 && y < 1000 && z >= 10 && z < 1000) {
            int xDigit = x % 10;
            int yDigit = y % 10;
            int zDigit = z % 10;
            if (xDigit == yDigit || zDigit == yDigit || xDigit == zDigit) {
                return true;
            }
        }
        return false;
    }
}
