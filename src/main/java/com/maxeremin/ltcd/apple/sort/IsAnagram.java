package com.maxeremin.ltcd.apple.sort;

public class IsAnagram {
    public boolean isAnagram(String s, String t) {
        // Time: O(N + M). Space: O(26)
        int[] alphabet = new int[26];

        if (s.length() != t.length()) {
            return false;
        }

        for (int letterIndex = 0; letterIndex < s.length(); letterIndex++) {

            alphabet[s.charAt(letterIndex) - 'a']++;

        }

        for (int letterIndex = 0; letterIndex < t.length(); letterIndex++) {

            alphabet[t.charAt(letterIndex) - 'a']--;
            if (alphabet[t.charAt(letterIndex) - 'a'] < 0) {
                return false;
            }

        }


        return true;
    }
}
