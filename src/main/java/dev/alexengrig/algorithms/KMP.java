package dev.alexengrig.algorithms;

public class KMP {
    public static int first(String pattern, String text) {
        PrefixFunction prefixFunction = new PrefixFunction(pattern);
        for (int i = 0, p = pattern.length(), l = text.length() - p + 1; i < l; ) {
            String part = text.substring(i, i + p);
            int length = matchLength(pattern, part);
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

    private static int matchLength(String pattern, String text) {
        for (int i = 0, l = pattern.length(); i < l; i++) {
            if (pattern.charAt(i) != text.charAt(i)) {
                return i;
            }
        }
        return pattern.length();
    }
}
