# LeetCode 332 - Reconstruct Itinerary

## Problem
Given flight tickets `[from, to]`, build a complete itinerary that:

- starts from `JFK`
- uses every ticket exactly once
- returns the lexicographically smallest valid path when multiple answers exist

## Implementation
- Source: `Solution.java`
- Package: `leetcode/LeetCode332`
- Approach: graph traversal with lexical ordering

## Example

Input:

```text
[["JFK","SFO"],["JFK","ATL"],["SFO","ATL"],["ATL","JFK"],["ATL","SFO"]]
```

Output:

```text
["JFK","ATL","JFK","SFO","ATL","SFO"]
```

## Constraints

- `1 <= tickets.length <= 300`
- Airport codes are 3 uppercase letters
