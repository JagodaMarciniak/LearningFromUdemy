package SelfStudy.AppLevelUp;

public class FlourPackProblem {
    public static void main(String[] args) {
//        System.out.println(canPack(1, 0, 4));
//        System.out.println(canPack(1, 0, 5));
//        System.out.println(canPack(0, 5, 4));
//        System.out.println(canPack(2, 2, 12));
//        System.out.println(canPack(-3, 2, 12));
        System.out.println(canPack(0, 5, 5));

    }

    public static boolean canPack(int bigCount, int smallCount, int goal) {
        if (bigCount < 0 || smallCount < 0 || goal < 0) {
            return false;
        }
        int kgAvailable = bigCount * 5 + smallCount;
        if (goal <= kgAvailable) {
            int bigBagFull = goal / 5;
            if (bigBagFull <= bigCount && goal % 5 <= smallCount) {
                return true;
            }
            if (bigBagFull >= bigCount && goal / 5 <= smallCount) {
                return true;
            }
        }
        return false;
    }
}
