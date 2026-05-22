package sorting;

import java.util.Arrays;

public class InsertionSort {
    public void sort(int[] a) {
        int n = a.length;
        for(int i=1; i<n; i++) { // start from second element in the array
            int key = a[i];
            int j = i-1;
            while (j>=0 && a[j] > key) {
                a[j+1] = a[j];
                j--;
            }
            a[j+1] = key;
        }
    }

    public static void main(String[] args) {
        int[] input = {3, 6, 78, 34, 26, 1, 9, 5, 3 , 2, 89};
        InsertionSort is = new InsertionSort();
        System.out.println("Before : " + Arrays.toString(input));
        is.sort(input);
        System.out.println("After : " + Arrays.toString(input));

        input = new int[]{99, 44, 6, 2, 1, 5, 63, 87, 283, 4, 0};
        System.out.println("Before : " + Arrays.toString(input));
        is.sort(input);
        System.out.println("After : " + Arrays.toString(input));
    }
}
