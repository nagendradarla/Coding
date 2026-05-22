package leetcode.SlidingWindowMaximum;

import java.util.Deque;
import java.util.LinkedList;

class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        if (nums == null || nums.length == 0) {
            return new int[0];
        }
        int l = nums.length, curr, max=nums[0];
        int[] result = new int[l-k+1];
        Deque<Integer> deQue = new LinkedList<>();
        for (int i=0; i<nums.length; i++) {
            System.out.println("Start = " + deQue);
            curr = nums[i];
            System.out.println("current = " + curr);
            // Remove element which are not part of the current window
            while(!deQue.isEmpty() && deQue.peek() < i - k + 1) {
                System.out.println("Queue Poll = " + deQue);
                System.out.println(deQue.peek());
                deQue.poll();
            }

            // remove all the element in the queue which are less than current value
            while(!deQue.isEmpty() && nums[deQue.getLast()] < curr) {
                System.out.println("Queue removeLast = " + deQue);
                System.out.println(deQue.removeLast());
            }
            deQue.add(i);
            if (i >= k-1) {
                result[i-k+1] = nums[deQue.peek()];
            }

        }
        return result;
    }

    public static void main(String[] args) {
        //[1,3,-1,-3,5,3,6,7] k = 3
        int[] input = new int[]{1,3,-1,-3,5,3,6,7};
        int k = 3;
        //[1] k = 1
        input = new int[]{1};
        k = 1;
        //[1,3,1,2,0,5] k = 3
        input = new int[]{1,3,1,2,0,5};
        k = 3;
        Solution solution = new Solution();
        int[] result = solution.maxSlidingWindow(input, k);
        for (int i : result) {
            System.out.print(i + " ");
        }
    }
}
