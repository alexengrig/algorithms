package dev.alexengrig.algorithms;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrefixFunctionTest {
    private void doTest(String str, int value) {
        assertEquals(PrefixFunction.length(str), value);
    }

    @Test
    public void testEmpty() {
        doTest("", 0);
    }

    @Test
    public void test1() {
        doTest("A", 0);
        doTest("AB", 0);
        doTest("ABA", 1);
        doTest("ABAC", 0);
        doTest("ABACA", 1);
        doTest("ABACAB", 2);
        doTest("ABACABA", 3);
        doTest("ABACABAD", 0);
    }

    @Test
    public void test2() {
        doTest("A", 0);
        doTest("AC", 0);
        doTest("ACC", 0);
        doTest("ACCA", 1);
        doTest("ACCAB", 0);
        doTest("ACCABA", 1);
        doTest("ACCABAC", 2);
        doTest("ACCABACC", 3);
        doTest("ACCABACCA", 4);
        doTest("ACCABACCAC", 2);
    }

    @Test
    public void test() {
        PrefixFunction function = new PrefixFunction("TESTtextTEST");
        assertEquals(4, function.length());
        assertEquals("TEST", function.prefix());
        assertEquals("TEST", function.suffix());
        assertEquals("text", function.without());
    }
}