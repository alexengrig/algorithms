package dev.alexengrig.algorithms;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class ZFunctionTest {
    @Test
    public void test() {
        assertArrayEquals(new int[]{0, 0, 1, 0, 3, 0, 1}, ZFunction.calculate("abacaba"));
    }
}