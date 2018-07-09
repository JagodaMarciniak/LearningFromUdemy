package ja;

public class BarkingDog {
    public static void main(String[] args) {
        System.out.println(bark(true, 1));
        System.out.println(bark(false, -8));
        System.out.println(bark(true, 0));
        System.out.println(bark(true, 25));
    }

    public static boolean bark(boolean barking, int hourOfDay) {
        if ((hourOfDay >= 0) && (hourOfDay < 8) && barking) {
            return true;
        }
        if ((hourOfDay > 22) && (hourOfDay < 24) && (barking)) {
            return true;
        } else
            return false;
    }
}


