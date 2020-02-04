package com.maxeremin.ltcd.dp;

/**
 * https://leetcode.com/problems/climbing-stairs/
 */
public class ClimbingStairs {
    public int climbStairs(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        if (n == 2) {
            return 2;
        }

        int newLength = n + 1;
        int[] cache = new int[newLength];
        cache[1] = 1;
        cache[2] = 2;

        for (int i = 3; i < newLength; i++) {
            cache[i] = cache[i - 1] + cache[i - 2];
        }
        return cache[n];
    }
}
