package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

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
            int sequenceLength = sequence.length;
            assertEquals(15, sequenceLength);
        }

        @Test
        @DisplayName("multiples of 3 and 5 are FizzBuzz")
        void multiplesOfThreeAndFive() {
            String[] sequence = FizzBuzz.array(30);
            ArrayList<String> multipleResults = new ArrayList<>();

            for (int i = 1; i <= sequence.length; i++) {
                if (i % 3 == 0 && i % 5 == 0) {
                    multipleResults.add(sequence[i - 1]);
                }
            }

            assertEquals(2, multipleResults.size());

            for (String result : multipleResults) {
                assertEquals("FizzBuzz", result);
            }
        }

        @Test
        @DisplayName("multiples of 3 are Fizz")
        void multiplesOfThree() {
            String[] sequence = FizzBuzz.array(9);

            for (int i = 1; i <= sequence.length; i++) {
                if (i % 3 == 0 && i % 5 != 0) {
                    assertEquals("Fizz", sequence[i - 1]);
                }
            }
        }

        @Test
        @DisplayName("multiples of 5 are Buzz")
        void multiplesOfFive() {
            String[] sequence = FizzBuzz.array(20);

            for (int i = 1; i <= sequence.length; i++) {
                if (i % 5 == 0 && i % 3 != 0) {
                    assertEquals("Buzz", sequence[i - 1]);
                }
            }
        }
    }

}
