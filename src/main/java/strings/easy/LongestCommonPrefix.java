package strings.easy;

public class LongestCommonPrefix {

    private LongestCommonPrefix() {
    }

/*
  Problem: https://leetcode.com/problems/longest-common-prefix/description/
  Level: Easy
 */

    public static String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) return "";
        var prefix = strs[0];
        for (String s : strs) {
            while (s.indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
            }
        }
        return prefix;
    }

    public static String longestCommonPrefixFirst(String[] strs) {
        if (strs == null || strs.length == 0)
            return "";
        for (int i = 0; i < strs[0].length(); i++) {
            char c = strs[0].charAt(i);
            for (int j = 1; j < strs.length; j++) {
                if (i >= strs[j].length() || strs[j].charAt(i) != c) {
                    return strs[0].substring(0, i);
                }
            }
        }
        return strs[0];
    }
}