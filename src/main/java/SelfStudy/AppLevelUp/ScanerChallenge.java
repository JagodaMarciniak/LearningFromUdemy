package SelfStudy.AppLevelUp;

import java.util.Scanner;

public class ScanerChallenge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int counter = 0;
        int order = counter + 1;

        while (counter < 10) {
            System.out.println("Enter the number #" + order);
            boolean hasNextInt = scanner.hasNextInt();
            if (hasNextInt) {
                int number = scanner.nextInt();
                sum += number;
                counter++;
            } else {
                System.out.println("Invalid value");
            }
            scanner.nextLine();
        }
        scanner.close();
        System.out.println("The sum is " + sum);
    }
}