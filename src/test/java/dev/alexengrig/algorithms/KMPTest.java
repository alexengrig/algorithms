package dev.alexengrig.algorithms;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class KMPTest {
    @Test
    public void testFirst() {
        assertEquals(1, KMP.first("aba", "baba"));
    }

    @Test
    public void testAll() {
        assertArrayEquals(new int[]{0, 4}, KMP.all("ABA", "ABACABAD"));
        assertArrayEquals(new int[]{0, 2, 4}, KMP.all("ABA", "ABABABA"));
    }

    @Test
    public void testOtherAll() {
        assertArrayEquals(new int[]{0, 4}, KMP.otherAll("ABA", "ABACABAD"));
        assertArrayEquals(new int[]{0, 2, 4}, KMP.otherAll("ABA", "ABABABA"));
    }

    @Test
    public void testNonOverlap() {
        assertArrayEquals(new int[]{0, 4}, KMP.nonOverlap("ABA", "ABACABAD"));
        assertArrayEquals(new int[]{0, 4}, KMP.nonOverlap("ABA", "ABABABA"));
    }
}