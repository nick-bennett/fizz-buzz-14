package edu.cnm.deepdive;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class FizzBuzzTest {

  static final int[] fizzValues = {21, 999, 3, 9};
  static final int[] buzzValues = {10, 95, 65, 500};
  static final int[] fizzBuzzValues = {15, 90, 0, 60, 135, 1500};
  static final int[] neitherValues = {17, 2, 98, 7, 97};

  @Test
  @DisplayName("Test Fizz values")
  void getFizzBuzz_fizz() {
    FizzBuzz fb = new FizzBuzz();
    for (int value : fizzValues) {
      assertEquals(FizzBuzz.FIZZ_VALUE, fb.getFizzBuzz(value));
    }
  }

  @Test
  @DisplayName("Test Buzz values")
  void getFizzBuzz_buzz() {
    FizzBuzz fb = new FizzBuzz();
    for (int value : buzzValues) {
      assertEquals(FizzBuzz.BUZZ_VALUE, fb.getFizzBuzz(value));
    }
  }

  @Test
  @DisplayName("Test FizzBuzz values")
  void getFizzBuzz_fizzBuzz() {
    FizzBuzz fb = new FizzBuzz();
    for (int value : fizzBuzzValues) {
      assertEquals(FizzBuzz.FIZZ_BUZZ_VALUE, fb.getFizzBuzz(value));
    }
  }

}