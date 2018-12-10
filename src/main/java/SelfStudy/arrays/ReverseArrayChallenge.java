package SelfStudy.arrays;

import java.util.Arrays;

public class ReverseArrayChallenge {
    public static void main(String[] args) {
        int [] array = {1,2,3,4,5};
        int maxIndex = array.length-1;
        int halfLenght = array.length/2;
        for(int i=0; i<halfLenght;i++){
            int temp = array[i];
            array[i] = array[maxIndex-i];
            array[maxIndex -i] = temp;
        }
        System.out.println(Arrays.toString(array));
    }
}
