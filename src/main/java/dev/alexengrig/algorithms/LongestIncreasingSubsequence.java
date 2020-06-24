package dev.alexengrig.algorithms;

public class LongestIncreasingSubsequence {
    public static int any(int[] array) {
        return any(array, array.length);
    }

    public static int any(int[] array, int length) {
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

    public static class Recursive {
        public static int any(int[] array) {
            return any(array, array.length);
        }

        public static int any(int[] array, int length) {
            int max = 1;
            for (int i = 1; i < length; i++) {
                int lis = any(array, i);
                if (array[i - 1] < array[length - 1] && lis + 1 > max) {
                    max = lis + 1;
                }
            }
            return max;
        }
    }
}
