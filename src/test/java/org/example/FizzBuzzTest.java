package org.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTest {
    @Test
    @DisplayName("Multiple of 3 and 5 should return FizzBuzz")
    public void shouldReturnFizzBuzz() {
        String result = FizzBuzz.of(15);
        assertEquals("FizzBuzz", result );
    }
}
