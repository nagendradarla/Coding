package com.ndarla;

class LowestAndHighestIndexOfElementInArray {
    public int[] searchRange(int[] nums, int target) {
        int first = findIndex(nums, target, true);
        int last = findIndex(nums, target, false);
        return new int[] {first, last};
    }

    // Helper method to find either first or last occurrence using binary search
    private int findIndex(int[] nums, int target, boolean findFirst) {
        int low = 0, high = nums.length - 1;
        int result = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (nums[mid] == target) {
                result = mid;
                if (findFirst) {
                    high = mid - 1;  // Keep searching on the left
                } else {
                    low = mid + 1;   // Keep searching on the right
                }
            } else if (nums[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        LowestAndHighestIndexOfElementInArray local = new LowestAndHighestIndexOfElementInArray();
        int[] A = {1, 2, 2, 2, 3, 4};
        int target = 2;
        int[] output = local.searchRange(A, target);
        System.out.println("low = " + output[0]);
        System.out.println("high = " + output[1]);
    }
}

