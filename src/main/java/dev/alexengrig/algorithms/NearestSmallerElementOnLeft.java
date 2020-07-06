package dev.alexengrig.algorithms;

import dev.alexengrig.structures.stack.IntLinkedStack;
import dev.alexengrig.structures.stack.IntStack;

/**
 * The search task for each element of the array of the nearest element on the left is smaller than it.
 */
public class NearestSmallerElementOnLeft {
    public static int[] indices(int[] array) {
        int[] target = new int[array.length];
        IntStack stack = new IntLinkedStack();
        for (int i = 0, arrayLength = array.length; i < arrayLength; i++) {
            while (!stack.empty() && array[stack.top()] >= array[i]) {
                stack.pop();
            }
            target[i] = stack.empty() ? -1 : stack.top();
            stack.push(i);
        }
        return target;
    }
}
