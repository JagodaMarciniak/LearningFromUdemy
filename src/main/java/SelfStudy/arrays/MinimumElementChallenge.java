package SelfStudy.arrays;

import java.util.Scanner;

public class MinimumElementChallenge {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] arrayOfIntegers = readIntegers(5);
        int minimumValueFromArray = findMin(arrayOfIntegers);
        System.out.println("Minimal Value is" + minimumValueFromArray);
    }

    public static int[] readIntegers(int numberOfIntegers) {
        int[] array = new int[numberOfIntegers];
        for (int i = 0; i < array.length; i++) {
            System.out.println("Enter the number");

            array[i] = scanner.nextInt();

        }
        return array;
    }

    public static int findMin(int[] array) {
        int min = Integer.MAX_VALUE;
            for (int i = 0; i < array.length; i++) {
                int value = array[i];
                if (array[i] < min) {
                    min = value;
                }
            }
            return min;
        }
    }




