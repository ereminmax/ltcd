package com.maxeremin.quora.devideandconquer;
// http://www.techiedelight.com/binary-search/
public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = new int[] {2, 5, 6, 8, 9, 10};
        int key = 5;
        int left = 0;
        int right = arr.length - 1;
        int index = binarySearch(arr, left, right, key);
        if (index == -1) System.out.println("Not found");
        else System.out.println("Index found: " + index);
    }

    private static int binarySearch(int[] arr, int left, int right, int key) {
        if (left > right) return -1;
        int mid = left + (right - left) / 2;
        if (arr[mid] == key) return mid;
        else if (key < arr[mid]) return binarySearch(arr, left, mid - 1, key);
        else return binarySearch(arr, mid + 1, right, key);
    }
}
