package dev.alexengrig.algorithms;

public class PrefixFunction {
    protected final String string;
    protected final int[] lengths;

    public PrefixFunction(String str) {
        this(str, calculate(str));
    }

    protected PrefixFunction(String string, int[] lengths) {
        this.string = string;
        this.lengths = lengths;
    }

    public static int length(String str) {
        if (str.length() < 2) {
            return 0;
        }
        return calculate(str)[str.length() - 1];
    }

    protected static int[] calculate(String str) {
        return calculate(str, 1);
    }

    protected static int[] calculate(String str, int from) {
        int[] lengths = new int[str.length()];
        calculateTo(lengths, str, from);
        return lengths;
    }

    protected static void calculateTo(int[] array, String str) {
        calculateTo(array, str, 1);
    }

    protected static void calculateTo(int[] array, String str, int from) {
        char ch;
        int length;
        for (int i = from, l = array.length; i < l; i++) {
            ch = str.charAt(i);
            length = array[i - 1];
            while (length > 0 && ch != str.charAt(length)) {
                length = array[length - 1];
            }
            if (ch == str.charAt(length)) {
                array[i] = length + 1;
            }
        }
    }

    public int length() {
        return lengths[lengths.length - 1];
    }

    public String prefix() {
        return string.substring(0, length());
    }

    public String suffix() {
        return string.substring(string.length() - length());
    }

    public String without() {
        return string.substring(length(), string.length() - length());
    }
}
