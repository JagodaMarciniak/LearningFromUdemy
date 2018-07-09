package ja;

public class PlayingCat {
    public static void main(String[] args) {
        System.out.println(isCatPlaying(true, 10));
        System.out.println(isCatPlaying(false, 36));
        System.out.println(isCatPlaying(false, 35));
    }

    public static boolean isCatPlaying(boolean summer, int temp) {
        if (temp < 25 || temp > 45) {
            return false;
        } else if ((summer) && temp > 34) {
            return true;
        } else if (temp < 36) {
            return true;
        }
        return false;
    }
}