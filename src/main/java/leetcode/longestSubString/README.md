# LeetCode 3 - Longest Substring Without Repeating Characters

## Problem
Given a string `s`, return the length of the longest substring that contains no repeated characters.

## Implementation
- Source: `Solution.java`
- Package: `leetcode/longestSubString`
- Approach: sliding window with a `HashSet<Character>`

## Examples

- `"abcabcbb" -> 3`
- `"bbbbb" -> 1`
- `"pwwkew" -> 3`

## Constraint

- `0 <= s.length <= 5 * 10^4`
