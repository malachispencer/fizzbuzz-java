package org.example;

public class FizzBuzz {
    public static void main( String[] args ) {

    }

    public static String of(int n) {
        if (n % 3 == 0 && n % 5 == 0) {
            return "FizzBuzz";
        } else if (n % 3 == 0) {
            return "Fizz";
        }

        return null;
    }
}
