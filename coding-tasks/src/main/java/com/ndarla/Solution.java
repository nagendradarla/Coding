package com.ndarla;

import java.util.Arrays;

public class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = 0, j = 0;
        while (i < m+n && j < n) {
            if (nums1[i] == 0 && nums1[i] < nums2[j]) {
                System.out.println(">>> nums1[i] == 0 && nums1[i] < nums2[j]");
                System.out.println("Place nums2["+j+"]="+nums2[j]+" into nums1["+i+"]="+nums1[i]);
                //insert(nums1, nums2[j], i);
                i++;
                System.out.println(Arrays.toString(nums1));
                System.out.println(Arrays.toString(nums2));
                System.out.println("Increment i++ ");
                continue;
            } else if (nums1[i] < nums2[j]) {
                System.out.println(">>> nums1[i] < nums2[j]");
                i++;
                System.out.println(Arrays.toString(nums1));
                System.out.println(Arrays.toString(nums2));
                System.out.println("No insertion");
                System.out.println("Increment i++ ");
                continue;
            } else if (nums1[i] == nums2[j]) {
                System.out.println(">>> nums1[i] == nums2[j]");
                System.out.println("Place nums2["+j+"]="+nums2[j]+" into nums1["+(i+1)+"]="+nums1[i+1]);
                insert(nums1, nums2[j], i+1);
                i++;
                i++;
                System.out.println(Arrays.toString(nums1));
                System.out.println(Arrays.toString(nums2));
                System.out.println("Increment twice i++ ");
            } else if (nums1[i] > nums2[j]) {
                System.out.println(">>> nums1[i] > nums2[j]");
                System.out.println("Place nums2["+j+"]="+nums2[j]+" into nums1["+(i)+"]="+nums1[i]);
                insert(nums1, nums2[j], i);
                i++;
                System.out.println(Arrays.toString(nums1));
                System.out.println(Arrays.toString(nums2));
                System.out.println("Increment i++ ");
                //i++;
            }
            j++;
            System.out.println("Increment j++ ");
        }
    }

    // Method to insert a value at particular index and shift starting at that index to right side
    public void insert(int[] array, int value, int index) {
        if (index < array.length - 1) {
            //if (array[index] != 0) {
                for (int i = array.length - 1; i > index; i--) {
                    array[i] = array[i - 1];
                }
            //}
        }
        array[index] = value;
    }
}
