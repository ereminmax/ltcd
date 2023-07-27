package com.maxeremin.ltcd.l2023;
public class ContainsDuplicate {
    /**
     @return true if nums have duplicates otherwise false.
     */
    public boolean containsDuplicate(int[] nums) {



        // space 1, time is O(N^2)
        // if (nums.length == 1) return false;

        // for (int i = 1; i < nums.length; i++) {
        //     for (int j = 0; j < i; j++) {
        //         if (nums[i] == nums[j]) {
        //             return true;
        //         }
        //     }
        // }

        // return false;

        // O(n) //O(n)

        if (nums == null) return false;

        if (nums.length == 0 || nums.length == 1) return false;

        Set<Integer> set = new HashSet<>(nums.length);
        for (int value: nums) {
            if (set.contains(value)) return true;
            set.add(value);
        }
        return false;
    }
}