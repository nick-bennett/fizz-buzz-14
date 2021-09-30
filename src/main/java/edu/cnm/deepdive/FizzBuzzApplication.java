package edu.cnm.deepdive;

public class FizzBuzzApplication {

  public static void main(String[] args) {
    FizzBuzz fb = new FizzBuzz();
    for (int i = 1; i <= 100; i++) {
      System.out.println(fb.getFizzBuzz(i));
    }
  }

}
