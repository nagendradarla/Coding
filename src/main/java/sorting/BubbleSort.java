package sorting;

import java.util.Arrays;

public class BubbleSort {
    //Ascending order
    public void sort(int[] input) {
        for(int i=0; i<input.length; i++) {
           for(int j=0; j<input.length-1; j++) {
               if(input[j] > input[j+1]) {
                   int temp = input[j];
                   input[j] = input[j+1];
                   input[j+1] = temp;
               }
           }
        }
    }

    public static void main(String[] args) {
        int[] input = {3, 6, 78, 34, 26, 1, 9, 5, 3 , 2, 89};
        BubbleSort bs = new BubbleSort();
        System.out.println("Before : " + Arrays.toString(input));
        bs.sort(input);
        System.out.println("After : " + Arrays.toString(input));

        input = new int[]{99, 44, 6, 2, 1, 5, 63, 87, 283, 4, 0};
        System.out.println("Before : " + Arrays.toString(input));
        bs.sort(input);
        System.out.println("After : " + Arrays.toString(input));
    }
}
