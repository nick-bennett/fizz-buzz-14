package edu.cnm.deepdive;

import java.util.EnumSet;

public class FizzBuzzApplication {

  public static void main(String[] args) {
    FizzBuzz fb = new FizzBuzz();
    for (int i = 1; i <= 100; i++) {
      EnumSet<FizzBuzzValue> fizzBuzzValue = fb.getFizzBuzz(i);
      if (!fizzBuzzValue.isEmpty()) {
        System.out.println(fizzBuzzValue);
      } else {
        System.out.println(i);
      }
    }
  }

}
