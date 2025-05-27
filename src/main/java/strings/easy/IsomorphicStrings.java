package strings.easy;

public class IsomorphicStrings {

    private IsomorphicStrings() {
    }

/*
  Problem: https://leetcode.com/problems/two-sum/
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


    public static void main(String[] args) {
        String[] test = {"abcf", "abct", "abcf"};
        var prefix = longestCommonPrefix(test);
        System.out.printf(prefix);
    }


}
