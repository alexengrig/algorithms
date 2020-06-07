package dev.alexengrig.algorithms;

public class ZFunction {
    public static int[] calculate(String string) {
        int length = string.length();
        int[] target = new int[length];
        int left = 0, right = 0;
        for (int i = 1; i < length; i++) {
            target[i] = Math.max(0, Math.min(right - i, target[i - left]));
            while (i + target[i] < length && string.charAt(target[i]) == string.charAt(i + target[i])) {
                target[i]++;
            }
            if (i + target[i] > right) {
                left = i;
                right = i + target[i];
            }
        }
        return target;
    }
}
