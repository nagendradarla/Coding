package sorting;

import java.util.Arrays;

public class MergeSort {
    public int[] sort(int[] a) {
        if (a.length == 1) {
            return a;
        }
        int len = a.length;
        int mid = a.length / 2;
        //System.out.println("Before Split = " + Arrays.toString(a));
        //System.out.println("len = " + len);
        //System.out.println("mid = " + mid);
        int[] left = Arrays.copyOfRange(a, 0, mid);
        //System.out.println("left Array = " + Arrays.toString(left));
        int[] right = Arrays.copyOfRange(a, mid, len);
        //System.out.println("left Array = " + Arrays.toString(right));
        return merge(sort(left), sort(right));
    }

    public int[] merge(int[] left, int[] right) {
        int i=0, j=0, k=0;
        int l = left.length;
        int r = right.length;
        int[] merged = new int[l+r];
        while (i < l && j < r) {
            if (left[i] < right[j]) {
                merged[k] = left[i];
                i++;
            } else if(left[i] > right[j]) {
                merged[k] = right[j];
                j++;
            } else { // if both are equal
                merged[k]=left[i];
                merged[k+1]=right[j];
                i++;
                j++;
                k++;
            }
            k++;
        }
        //add remain from left or right into merged
        while(i<l) {
            merged[k] = left[i];
            i++;
            k++;
        }
        while (j < r) {
            merged[k] = right[j];
            j++;
            k++;
        }
        return merged;
    }

    public static void main(String[] args) {
        int[] input = {3, 6, 78, 34, 26, 1, 9, 5, 3 , 2, 89};
        MergeSort ms = new MergeSort();
        System.out.println("Before : " + Arrays.toString(input));
        System.out.println("After : " + Arrays.toString(ms.sort(input)));

        input = new int[]{99, 44, 6, 2, 1, 5, 63, 87, 283, 4, 0};
        System.out.println("Before : " + Arrays.toString(input));
        System.out.println("After : " + Arrays.toString(ms.sort(input)));
    }
}
