package ja;

public class MinutesToSeconds {
    public static final String INVALID_VALUE_MESSAGE = "Invalid value";

    public static void main(String[] args) {
        System.out.println(getDurationString(65, 45));
        System.out.println(getDurationString(3900));
    }

    public static String getDurationString(int minutes, int seconds) {
        if (minutes >= 0 && seconds >= 0 && seconds <= 59) {
            int sec = minutes * 60 + seconds;
            int h = sec / 3600;
            int m = (sec % 3600) / 60;
            int s = (sec % 3600) % 60;
            String hoursString = h + "h";
            if (h < 10) {
                hoursString = "0" + hoursString;
            }
            String minutesString = m + "m";
            if (m < 10) {
                minutesString = "0" + minutesString;
            }
            String secondsString = s + "s";
            if (s < 10) {
                secondsString = "0" + secondsString;
            }
            return hoursString + minutesString + secondsString;
        } else {
            return INVALID_VALUE_MESSAGE;
        }
    }

    public static String getDurationString(int seconds) {
        if (seconds >= 0) {
            int minutes = seconds / 60;
            int remainingSeconds = seconds % 60;
            return getDurationString(minutes, remainingSeconds);
        } else
            return INVALID_VALUE_MESSAGE;
    }
}