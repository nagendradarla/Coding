package sorting;

import java.util.Arrays;

public class QuickSort {
    public void sort(int[] a, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(a, low, high);
            //System.out.println("Pivot Index : " + pivotIndex);
            sort(a, low, pivotIndex - 1);
            sort(a, pivotIndex+1, high);
        }
    }

    /**
     * Places the pivot in correct place and returns the pivot index
     * @param a
     * @param low
     * @param high
     * @return
     */
    public int partition(int[] a, int low, int high) {
        // consider pivot as the right most element
        int pivot = a[high];
        int i = low - 1;
        for (int j = low; j<high; j++) {
            if (a[j] < pivot) {
                i++;
                swap(a,i,j);
            }
        }
        // pivot has the based after all the values which are less that pivot.
        // This way pivot is placed in right place
        i++;
        swap(a,i,high);
        return i;
    }

    private void swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    public static void main(String[] args) {
        int[] input = {3, 6, 78, 34, 26, 1, 9, 5, 3 , 2, 89};
        QuickSort qs = new QuickSort();
        System.out.println("Before : " + Arrays.toString(input));
        qs.sort(input,0, input.length-1);
        System.out.println("After : " + Arrays.toString(input));

        input = new int[]{99, 44, 6, 2, 1, 5, 63, 87, 283, 4, 0};
        System.out.println("Before : " + Arrays.toString(input));
        qs.sort(input,0, input.length-1);
        System.out.println("After : " + Arrays.toString(input));
    }

}
