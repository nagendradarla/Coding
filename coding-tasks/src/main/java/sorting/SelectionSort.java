package sorting;

import java.util.Arrays;

public class SelectionSort {
    //ascending order
    public void sort(int[] input) {
        int length = input.length;
        for (int i=0; i<length; i++) {
            int smallestIndex = i;
            for(int j=i+1; j<length; j++) {
                //if (i == j) continue;
                if (input[j] < input[smallestIndex]) {
                    smallestIndex = j;
                }
            }
            //swap only if new smallest is found
            if (smallestIndex != i) {
                int temp = input[i];
                input[i] = input[smallestIndex];
                input[smallestIndex] = temp;
            }
        }
    }

    public static void main(String[] args) {
        int[] input = {3, 6, 78, 34, 26, 1, 9, 5, 3 , 2, 89};
        SelectionSort ss = new SelectionSort();
        System.out.println("Before : " + Arrays.toString(input));
        ss.sort(input);
        System.out.println("After : " + Arrays.toString(input));

        input = new int[]{99, 44, 6, 2, 1, 5, 63, 87, 283, 4, 0};
        System.out.println("Before : " + Arrays.toString(input));
        ss.sort(input);
        System.out.println("After : " + Arrays.toString(input));
    }
}
