package org.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTest {
    @Test
    @DisplayName("Should return FizzBuzz if given multiple of 3 and 5")
    public void shouldReturnFizzBuzz() {
        String result = FizzBuzz.of(15);
        assertEquals("FizzBuzz", result );
    }

    @Test
    @DisplayName("Should return Fizz if given multiple of 3")
    public void shouldReturnFizz() {
        String result = FizzBuzz.of(3);
        assertEquals("Fizz", result);
    }

    @Test
    @DisplayName("Should return Buzz if given multiple of 5")
    public void shouldReturnBuzz() {
        String result = FizzBuzz.of(5);
        assertEquals("Buzz", result);
    }

    @Test
    @DisplayName("Should return string of n if neither multiple of 3 or 5")
    public void shouldReturnStringN() {
        String result = FizzBuzz.of(1);
        assertEquals("1", result);
    }
}
