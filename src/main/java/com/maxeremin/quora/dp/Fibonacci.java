package com.maxeremin.quora.dp;

import java.util.HashMap;
import java.util.Map;

public class Fibonacci {
    // bottom up approach
    private static int lookup(int n, Map<Integer, Integer> map) {
        if (n <= 1) return n;
        if (!map.containsKey(n)) {
            int value = lookup(n - 1, map) + lookup(n - 2, map);
            map.put(n, value);
        }
        return map.get(n);
    }

    // top down approach
    private static int lookup(int n) {
        if (n <= 1)  return n;
        int previous = 0;
        int current = 1;
        for (int i = 0; i < n - 1; i++) {
            int sum = current + previous;
            previous = current;
            current = sum;
        }
        return current;
    }

    public static void main(String[] args) {
        int n = 8;
        Map<Integer, Integer> map = new HashMap<>();
        System.out.println(lookup(n));
        System.out.println(lookup(n, map));
    }
}