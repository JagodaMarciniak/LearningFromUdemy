package SelfStudy.AppLevelUp;

import java.util.Scanner;

public class Scan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your date of birth: ");
        boolean hasNextInt = input.hasNextInt();
        if (hasNextInt) {
            int yearOfBirth = input.nextInt();
            input.nextLine(); //handle next line (enter key)
            System.out.println("Enter your name: ");
            String name = input.nextLine();
            int age = 2018 - yearOfBirth;
            if (age < 100 && age > 0) {
                System.out.println("Your name is " + name + ", and you are " + age + " years old.");
            } else {
                System.out.println("Invalid year of birth");
            }
        } else {
            System.out.println("Unable to parse your year of birth");
        }
    }
}