package leetcode.longestSubString;

import java.util.HashSet;
import java.util.Set;

class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int result = solution.lengthOfLongestSubstring("au");
        System.out.println(result);
    }

    public int lengthOfLongestSubstring(String s) {
        int left = 0, right = 0;
        int result = 0;
        Set<Character> set = new HashSet<>();
        while (right < s.length()) {
            char c = s.charAt(right);
            while (set.contains(c)) {
                set.remove(c);
                left++;
            }
            set.add(c);
            result = Math.max(result, right - left + 1);
            right++;
        }
        return result;
    }
}