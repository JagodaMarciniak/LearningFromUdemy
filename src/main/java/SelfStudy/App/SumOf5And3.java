package SelfStudy.App;

public class SumOf5And3 {
    public static void main(String[] args) {
        int counter = 0;
        for (int i = 0; i < 1001; i++) {
            if ((i % 3 == 0) && (i % 5 == 0)) {
                counter++;
                int number = i;
                System.out.println(number);
                if (counter == 5) {
                    break;
                }
            }
        }
    }
}
