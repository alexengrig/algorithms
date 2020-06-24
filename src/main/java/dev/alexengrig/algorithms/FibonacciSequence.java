package dev.alexengrig.algorithms;

import java.util.HashMap;
import java.util.Map;

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

    public static class Memoization {
        private static final Map<Integer, Integer> SEQUENCE = new HashMap<>();

        public static int numberAt(int index) {
            if (index < 0) {
                return index;
            } else if (SEQUENCE.containsKey(index)) {
                return SEQUENCE.get(index);
            } else {
                int target = FibonacciSequence.numberAt(index);
                SEQUENCE.put(index, target);
                return target;
            }
        }
    }
}
