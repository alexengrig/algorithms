package dev.alexengrig.algorithms;

import java.util.ArrayList;
import java.util.List;

public class KMP {
    public static int first(String pattern, String text) {
        PrefixFunction prefixFunction = new PrefixFunction(pattern);
        for (int i = 0, p = pattern.length(), l = text.length() - p + 1; i < l; ) {
            int length = matchLength(pattern, text, i);
            if (length == p) {
                return i;
            } else if (length > 0) {
                i += length - prefixFunction.lengthAt(length - 1);
            } else {
                i++;
            }
        }
        return -1;
    }

    public static int[] all(String pattern, String text) {
        PrefixFunction prefixFunction = new PrefixFunction(pattern);
        List<Integer> target = new ArrayList<>();
        for (int i = 0, p = pattern.length(), l = text.length() - p + 1; i < l; ) {
            int length = matchLength(pattern, text, i);
            if (length == p) {
                target.add(i);
            }
            if (length > 0) {
                i += length - prefixFunction.lengthAt(length - 1);
            } else {
                i++;
            }
        }
        return target.stream().mapToInt(Integer::intValue).toArray();
    }

    public static int[] otherAll(String pattern, String text) {
        PrefixFunction prefixFunction = new PrefixFunction(pattern);
        List<Integer> target = new ArrayList<>();
        for (int i = 0, j = 0; i < text.length(); i++) {
            while (j > 0 && text.charAt(i) != pattern.charAt(j)) {
                j = prefixFunction.lengthAt(j - 1);
            }
            if (text.charAt(i) == pattern.charAt(j)) {
                j += 1;
            }
            if (j == pattern.length()) {
                target.add(i - j + 1);
                j = prefixFunction.lengthAt(j - 1);
            }
        }
        return target.stream().mapToInt(Integer::intValue).toArray();
    }

    public static int[] nonOverlap(String pattern, String text) {
        PrefixFunction prefixFunction = new PrefixFunction(pattern);
        List<Integer> target = new ArrayList<>();
        for (int i = 0, p = pattern.length(), l = text.length() - p + 1; i < l; ) {
            int length = matchLength(pattern, text, i);
            if (length == p) {
                target.add(i);
                i += length;
            } else if (length > 0) {
                i += length - prefixFunction.lengthAt(length - 1);
            } else {
                i++;
            }
        }
        return target.stream().mapToInt(Integer::intValue).toArray();
    }

    public static int[] otherNonOverlap(String pattern, String text) {
        PrefixFunction prefixFunction = new PrefixFunction(pattern);
        List<Integer> target = new ArrayList<>();
        for (int i = 0, j = 0; i < text.length(); i++) {
            while (j > 0 && text.charAt(i) != pattern.charAt(j)) {
                j = prefixFunction.lengthAt(j - 1);
            }
            if (text.charAt(i) == pattern.charAt(j)) {
                j += 1;
            }
            if (j == pattern.length()) {
                target.add(i - j + 1);
                j = 0;
            }
        }
        return target.stream().mapToInt(Integer::intValue).toArray();
    }

    private static int matchLength(String pattern, String text, int from) {
        for (int i = 0, l = pattern.length(); i < l; i++) {
            if (pattern.charAt(i) != text.charAt(from + i)) {
                return i;
            }
        }
        return pattern.length();
    }
}
