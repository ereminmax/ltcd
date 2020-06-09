package com.maxeremin.quora.codility;

public class MaximumPossibleValue {
    public int solution(int N) {
        // write your code in Java SE 8

        String str = String.valueOf(N);
        char[] array = str.toCharArray();

        if (N >= 0)
        {
            for (int i = 0; i < array.length; i++)
            {
                if ('5' > array[i])
                {
                    return Integer.parseInt(str.substring(0, i).concat("5").concat(str.substring(i)));
                }
            }
        }
        else
        {
            for (int i = 1; i < array.length; i++)
            {
                if ('5' < array[i])
                {
                    return Integer.parseInt(str.substring(0, i).concat("5").concat(str.substring(i)));
                }
            }
        }
        return Integer.parseInt(str.concat("5"));
    }

}
