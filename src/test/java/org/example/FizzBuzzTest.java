package org.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTest {
    @Nested
    @DisplayName("FizzBuzz.of")
    public class Of {
        @Test
        @DisplayName("returns FizzBuzz if given multiple of 3 and 5")
        void shouldReturnFizzBuzz() {
            String result = FizzBuzz.of(15);
            assertEquals("FizzBuzz", result );
        }

        @Test
        @DisplayName("returns Fizz if given multiple of 3")
        void shouldReturnFizz() {
            String result = FizzBuzz.of(3);
            assertEquals("Fizz", result );
        }

        @Test
        @DisplayName("returns Buzz if given multiple of 5")
        void shouldReturnBuzz() {
            String result = FizzBuzz.of(5);
            assertEquals("Buzz", result );
        }

        @Test
        @DisplayName("returns string of n if neither multiple of 3 or 5")
        void shouldReturnStringN() {
            String result = FizzBuzz.of(1);
            assertEquals("1", result );
        }
    }

    @Nested
    @DisplayName("FizzBuzz.array")
    public class Array {
        @Test
        @DisplayName("returns an array of size n")
        void shouldReturnArrayOfSizeN() {
            String[] sequence = FizzBuzz.array(15);
            int length = sequence.length;
            assertEquals(15, length);
        }
    }

}
