# LeetCode 239 - Sliding Window Maximum

## Problem
For each window of size `k` moving from left to right in `nums`, return the maximum value in that window.

## Implementation
- Source: `Solution.java`
- Package: `leetcode/SlidingWindowMaximum`
- Approach: monotonic deque storing indices of useful candidates

## Example

- Input: `nums = [1,3,-1,-3,5,3,6,7], k = 3`
- Output: `[3,3,5,5,6,7]`

## Constraints

- `1 <= nums.length <= 10^5`
- `-10^4 <= nums[i] <= 10^4`
- `1 <= k <= nums.length`
