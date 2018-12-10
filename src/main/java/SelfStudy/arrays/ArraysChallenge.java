package SelfStudy.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysChallenge {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] myValues = getIntegers(4);
        int[] sortedValues = sortNumbers(myValues);
        printArray(sortedValues);
    }

    public static int[] getIntegers(int number) {
        System.out.println("Enter the number: ");
        int[] values = new int[number];
        for (int i = 0; i < values.length; i++) {
            values[i] = scanner.nextInt();
        }
        return values;
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    private static int[] sortNumbers(int[] array) {
        int[] newArray = Arrays.copyOf(array, array.length);
        int smallerValue = 0;
        boolean flag = true;
        while (flag) {
            flag = false;
            for (int i = 0; i < newArray.length-1; i++) {
                if (newArray[i] < newArray[i + 1]) {
                    smallerValue = newArray[i];
                    newArray[i] = newArray[i + 1];
                    newArray[i + 1] = smallerValue;
                    flag = true;
                }
            }
        }
        return newArray;
    }
}
