package SelfStudy.arrays;

import java.util.Arrays;

public class DimentionalArrays {
    public static void main(String[] args) {
        int [] [] dimencionalArray = createMultiplicationTable(5);
        System.out.println(Arrays.deepToString(dimencionalArray));
    }
    public static int[][] createMultiplicationTable(int size) {
        int[][] dimencionalArray = new int[size][size];
        int counter = 0;
//        int[][] array = {{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}, {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}};
//        System.out.println(Arrays.deepToString(array));
//        for (int j = 1; j <= size; j++) {
//            System.out.printf("%4d", j);
//        }
//        System.out.println();
//        for (int i = 1; i <= size; i++) {
//            System.out.printf("%2d", i);
//
//            for (int j = 1; j <= size; j++) {
//                int multi = i * j;
//                System.out.printf("%4d", multi);
//            }
//            System.out.println();
//        }

        for (int i = 1 ; i < size; i++) {

            dimencionalArray[0][0] = counter;

            for (int j = 1; j < size; j++) {
                int multi = i * j;

                dimencionalArray[i] [j] = multi;
                counter++;
//                System.out.printf("%4d", multi);
            }
        }
        return dimencionalArray;
    }
}
