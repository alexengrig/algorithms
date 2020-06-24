package dev.alexengrig.algorithms;

public class FibonacciSequence {
    public static int numberAt(int index) {
        int target = index;
        for (int i = 1, left = 0, right = 1; i < index; i++) {
            target = left + right;
            left = right;
            right = target;
        }
        return target;
    }

    public static class Recursive {
        public static int numberAt(int index) {
            if (index <= 1) {
                return index;
            } else {
                return numberAt(index - 1) + numberAt(index - 2);
            }
        }
    }
}
