package com.ndarla;

public class RemoveElement {
    public static int removeElement(int[] nums, int val) {
        int k = 0; // Count of elements not equal to val

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[k] = nums[i]; // Overwrite the value at index k
                k++; // Increase the count
            }
        }

        return k; // Return the count of non-val elements
    }

    public static void main(String[] args) {
        int[] nums = {3, 2, 2, 3}; // Example input
        int val = 3;
        int[] expectedNums = {2, 2}; // Expected output after removal

        int k = removeElement(nums, val);

        // Validate result
        assert k == expectedNums.length;
        java.util.Arrays.sort(nums, 0, k);
        for (int i = 0; i < k; i++) {
            assert nums[i] == expectedNums[i];
        }

        System.out.println("Test passed! k = " + k);
    }
}
