package strings.easy;

import java.util.HashMap;
import java.util.Map;

public class IsomorphicStrings {

    /*
     Problem: https://leetcode.com/problems/longest-common-prefix/description/
     Level: Easy
    */
    public static boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) return false;

            Map<Character, Character> pairs = new HashMap<>();
            Map<Character, Character> pairs2 = new HashMap<>();
            for (int i = 0; i < s.length(); i++) {
                if (pairs.containsKey(s.charAt(i)) && pairs.get(s.charAt(i)) != t.charAt(i)) {
                        return false;
                    }

                if (pairs2.containsKey(t.charAt(i)) && pairs2.get(t.charAt(i)) != s.charAt(i)) {
                        return false;
                    }

                pairs.put(s.charAt(i), t.charAt(i));
                pairs2.put(t.charAt(i), s.charAt(i));
            }
            return true;
        }

    public static void main(String[] args) {
        System.out.print(isIsomorphic("paper", "title"));
    }
}