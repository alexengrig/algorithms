package dev.alexengrig.algorithms;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class KMPTest {
    @Test
    public void test() {
        assertEquals(1, KMP.first("aba", "baba"));
    }
}