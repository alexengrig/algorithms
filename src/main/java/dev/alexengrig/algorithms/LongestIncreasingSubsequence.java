package dev.alexengrig.algorithms;

import java.util.Arrays;

public class LongestIncreasingSubsequence {
    public static int length(int[] array) {
        return length(array, array.length);
    }

    public static int length(int[] array, int length) {
        if (length == 0) {
            return 0;
        }
        int[] lis = new int[length];
        int max = 0;
        for (int i = 1; i < length; i++) {
            for (int j = 0; j < i; j++) {
                if (array[i] > array[j] && lis[i] < lis[j] + 1) {
                    lis[i] = lis[j] + 1;
                    if (max < lis[i]) {
                        max = lis[i];
                    }
                }
            }
        }
        return max + 1;
    }

    public static int[] values(int[] array) {
        return values(array, array.length);
    }

    public static int[] values(int[] array, int length) {
        if (length <= 1) {
            return Arrays.copyOf(array, length);
        }
        int[] lis = new int[length];
        int[] target = new int[0];
        for (int i = 1; i < length; i++) {
            int[] arr = new int[i];
            int k = 0;
            for (int j = 0; j < i; j++) {
                if (array[i] > array[j] && lis[i] < lis[j] + 1) {
                    arr[k++] = array[j];
                    lis[i] = lis[j] + 1;
                }
            }
            if (k < i) {
                arr[k++] = array[i];
            }
            if (k > target.length) {
                target = Arrays.copyOf(arr, k);
            }
        }
        return target;
    }

    public static void main(String[] args) {
        System.out.println("Target: " + Arrays.toString(values(new int[]{1, 10, 2, 9, 3, 8, 4, 7, 5, 6})));
    }

    public static class Recursive {
        public static int length(int[] array) {
            return length(array, array.length);
        }

        public static int length(int[] array, int length) {
            int max = 1;
            for (int i = 1; i < length; i++) {
                int lis = length(array, i);
                if (array[i - 1] < array[length - 1] && lis + 1 > max) {
                    max = lis + 1;
                }
            }
            return max;
        }
    }
}
