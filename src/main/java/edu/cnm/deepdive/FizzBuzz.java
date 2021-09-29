package edu.cnm.deepdive;

public class FizzBuzz {

  static final String FIZZ_BUZZ_VALUE = "FizzBuzz";
  static final String FIZZ_VALUE = "Fizz";
  static final String BUZZ_VALUE = "Buzz";

  public String getFizzBuzz(int value) {
    String str;
    if (value % 3 == 0) {
      if (value % 5 == 0) {
        str = FIZZ_BUZZ_VALUE;
      } else {
        str = FIZZ_VALUE;
      }
    } else if (value % 5 == 0) {
      str = BUZZ_VALUE;
    } else {
      str = String.valueOf(value);
    }
    return str;
  }
}
