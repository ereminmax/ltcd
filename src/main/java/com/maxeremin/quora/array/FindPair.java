package com.maxeremin.quora.array;

import java.util.HashMap;
import java.util.Map;

public class FindPair {

    public static void main(String ... args) {

        int[] arr = new int[]{8, 7, 2, 5, 3, 1};

        int sum = 10;

        if (!isPairExist(arr, sum)) {
            System.out.print("Not found");
        }

    }

    private static boolean isPairExist(int[] arr, int sum) {

        if (arr == null || arr.length == 0) {
            return false;
        }

        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, 0);

        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(sum - arr[i])) {
                System.out.println(i + " has a pair with " + map.get(sum - arr[i]));
                return true;
            }
            else {
                map.put(arr[i], i);
            }
        }
        return false;
    }




}




/*
package com.maxeremin.quora.array;


import java.util.HashMap;
import java.util.Map;

public class FindPair
{
    // Naive method to find a pair in an array with given sum
    private static void findPair(int[] A, int sum)
    {
        // create an empty Hash Map
        Map<Integer, Integer> map = new HashMap<>();

        // do for each element
        for (int i = 0; i < A.length; i++)
        {
            // check if pair (arr[i], sum-arr[i]) exists

            // if difference is seen before, print the pair
            if (map.containsKey(sum - A[i]))
            {
                System.out.println("Pair found at index " +
                        map.get(sum - A[i]) + " and " + i);
                return;
            }

            // store index of current element in the map
            map.put(A[i], i);
        }

        // No pair with given sum exists in the array
        System.out.println("Pair not found");
    }

    // Find pair with given sum in the array
    public static void main (String[] args)
    {
        int[] A = { 8, 7, 2, 5, 3, 1 };
        int sum = 10;

        findPair(A, sum);
    }
}
*/
