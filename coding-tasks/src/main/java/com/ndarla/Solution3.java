package com.ndarla;

class Solution3 {
    // Method which will merge the arrays
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int length = m+n;
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < n; j++) {
                int targetIndex;
                if (nums1[i] < nums2[j]){
                    i++;
                    continue;
                }
                if (nums1[i] <= nums2[j]) {
                    if (i < length - 1) {
                        targetIndex = i + 1;
                        if (nums1[i + 1] == nums2[j]) {
                            targetIndex = i + 2;
                        }
                    } else {
                        targetIndex = i;
                    }
                    insert(nums1, nums2[j], targetIndex);
                    i = targetIndex + 1;
                } else {
                    insert(nums1, nums2[j], i);
                    i++;
                }
            }
        }
    }

    // Method to insert a value at particular index and shift starting at that index to right side
    public void insert(int[] array, int value, int index) {
        if (index < array.length - 1) {
            for (int i = array.length - 1; i > index; i--) {
                array[i] = array[i - 1];
            }
        }
        array[index] = value;
    }
}