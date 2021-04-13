package org.example;

public class FizzBuzz {
    public static void main( String[] args ) {

    }

    public static String of(int n) {
        if (n % 3 == 0 && n % 5 == 0) {
            return "FizzBuzz";
        } else if (n % 3 == 0) {
            return "Fizz";
        } else if (n % 5 == 0) {
            return "Buzz";
        } else {
            return Integer.toString(n);
        }
    }

    public static String[] array(int n) {
        String[] sequence = new String[n];

        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                sequence[i - 1] = "FizzBuzz";
            } else if (i % 3 == 0) {
                sequence[i - 1] = "Fizz";
            }
        }

        return sequence;
    }
}
