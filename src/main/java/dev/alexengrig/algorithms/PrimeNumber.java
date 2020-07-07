package dev.alexengrig.algorithms;

public class PrimeNumber {
    public static boolean isPrime(int number) {
        if (number == 2 || number == 3) {
            return true;
        } else if (number <= 1 || number % 2 == 0 || number % 3 == 0) {
            return false;
        }
        for (int i = 5, n = number / 2; i < n; i += 2) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
