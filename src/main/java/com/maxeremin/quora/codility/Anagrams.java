package com.maxeremin.quora.codility;

public class Anagrams {
    public int solution(String A, String B) {
        // write your code in Java SE 8
        int result = 0;
        int[] char_count = new int[26];
        for (int i = 0; i < A.length(); i++)
        {
            char_count[A.charAt(i) - 'a']++;
        }
        for (int i = 0; i < B.length(); i++)
        {
            if (char_count[B.charAt(i) - 'a']-- <= 0)
            {
                result++;
            }
        }

        for (int i = 0; i < char_count.length; i++)
        {
            if (char_count[i] > 0)
            {
                result += char_count[i];
            }
        }

        return result;
    }
}
