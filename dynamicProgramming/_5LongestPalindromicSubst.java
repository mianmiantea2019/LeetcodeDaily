package dynamicProgramming;

/**
 * @Author: mianmiantea2019
 * @Date: 2023-05-06 9:40 AM
 * @LastEditors: mianmiantea2019
 * @Description:
 */


public class _5LongestPalindromicSubstring {
    public String longestPalindromeDp(String s) {
        if (s == null) return null;
        char[] cs = s.toCharArray();
        if (cs.length <= 1) return s;
        int maxLen = 1;
        int begin = 0;
        int i = 0;
        while (i < cs.length) {
            int l = i - 1;
            int r = i;
            while (++r < cs.length && cs[r] == cs[i]);
            i = r;

            while (l >= 0 && r < cs.length && cs[l] == cs[r]) {
                l--;
                r++;
            }

            int len = r - ++l;
            if (len > maxLen) {
                maxLen = len;
                begin = l;
            }
        }
        return new String(cs, begin, maxLen);
    }
}
