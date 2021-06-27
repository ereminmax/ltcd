package com.maxeremin.ltcd.apple.sort;

public class TwoArrIntersection {
    public int[] intersection(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);

        // "left" means the current index of nums1 array, right - nums2.
        int left = 0, right = 0, resultArrayBoundary = 0;

        while (left < nums1.length && right < nums2.length) {
            // if values have intersaction then replace (save) the nums1 first cell (later the cell under resultArrayBoundary index) also check that the previously saved value is different to avoid duplicates in resulting array
            if (nums1[left] == nums2[right]) {
                if (resultArrayBoundary == 0 || nums1[left] != nums1[resultArrayBoundary - 1]) {
                    nums1[resultArrayBoundary] = nums1[left];
                    resultArrayBoundary++;
                }
                // move left and right indexes because the value was already processed and saved
                left++;
                right++;
            } else if (nums1[left] < nums2[right]) { // if left value is less then check following until you find the value which is equals to the right
                left++;
            } else { // do the opposite by checking the value of the following value in right array
                right++;
            }
        }

        // create new array by cutting from 0 till (not including) the resultArrayBoundary index.
        return Arrays.copyOf(nums1, resultArrayBoundary);
    }
}
