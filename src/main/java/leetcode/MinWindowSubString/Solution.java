package leetcode.MinWindowSubString;

class Solution {
    public String minWindow(String s, String t) {
        s = s.toLowerCase();
        System.out.println("s = "+ s);
        t = t.toLowerCase();
        System.out.println("t = "+ t);
        int[] tArray = new int[26];
        int[] subArray = new int[26];
        for (int i = 0; i<t.length(); i++) {
            tArray[t.charAt(i)-'a']++;
        }
        int l=0,r=0;
        int[] ans = {-1,0,0};
        while (r < s.length()) {
            Character c = s.charAt(r);
            subArray[c-'a']++;
            /*if (matches(tArray, subArray) && (ans[0] == -1 || ans[0] > r-l+1)) {
                ans[0] = r-l+1;
                ans[1] = l;
                ans[2] = r;
            }*/
            while(matches(tArray, subArray) && l < r) {
                if (ans[0] == -1 || ans[0] > r-l+1) {
                    ans[0] = r-l+1;
                    ans[1] = l;
                    ans[2] = r;
                }
                subArray[s.charAt(l)-'a']--;
                l++;
            }
            r++;
        }
        return ans[0] == -1 ? "" : s.substring(l, r);
    }

    public boolean matches(int[] s1, int[] s2) {
        for (int i=0; i<s1.length; i++) {
            if (s1[i] > 0 && s1[i] > s2[i]) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        String result = solution.minWindow("ADOBECODEBANC", "ABC");
        System.out.println(result);
    }
}
