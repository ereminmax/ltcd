package com.maxeremin.ltcd.apple.sort;
//https://leetcode.com/problems/sort-colors/submissions/
public class SortColors {
    public void sortColors(int[] nums) {

        int red = 0;
        int current = 0;
        int blue = nums.length - 1;

        while (current <= blue) {

            if (nums[current] == 0) {

                int temp = nums[red];
                nums[red] = nums[current];
                nums[current] = temp;

                current++;
                red++;

            } else if (nums[current] == 2) {

                int temp = nums[blue];
                nums[blue] = nums[current];
                nums[current] = temp;

                blue--;

            } else {

                current++;

            }

        }

    }
}
