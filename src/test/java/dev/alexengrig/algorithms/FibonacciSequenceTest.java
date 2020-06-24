package dev.alexengrig.algorithms;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FibonacciSequenceTest {
    @Test
    public void should_return_numberAtIndex() {
        assertEquals("Index 0", 0, FibonacciSequence.numberAt(0));
        assertEquals("Index 1", 1, FibonacciSequence.numberAt(1));
        assertEquals("Index 2", 1, FibonacciSequence.numberAt(2));
        assertEquals("Index 3", 2, FibonacciSequence.numberAt(3));
        assertEquals("Index 4", 3, FibonacciSequence.numberAt(4));
        assertEquals("Index 5", 5, FibonacciSequence.numberAt(5));
        assertEquals("Index 12", 144, FibonacciSequence.numberAt(12));
    }

    @Test
    public void should_return_numberAtIndex_recursive() {
        assertEquals("Index 0", 0, FibonacciSequence.Recursive.numberAt(0));
        assertEquals("Index 1", 1, FibonacciSequence.Recursive.numberAt(1));
        assertEquals("Index 2", 1, FibonacciSequence.Recursive.numberAt(2));
        assertEquals("Index 3", 2, FibonacciSequence.Recursive.numberAt(3));
        assertEquals("Index 4", 3, FibonacciSequence.Recursive.numberAt(4));
        assertEquals("Index 5", 5, FibonacciSequence.Recursive.numberAt(5));
        assertEquals("Index 12", 144, FibonacciSequence.Recursive.numberAt(12));
    }
}