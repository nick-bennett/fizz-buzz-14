/*
 *  Copyright 2021 CNM Ingenuity, Inc.
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package edu.cnm.deepdive;

import java.util.EnumSet;

/**
 * Implements a method that computes the FizzBuzz {@link String} value for any non-negative integer.
 * This implementation ignores the common form of the FizzBuzz challenge (i.e. "Write the numbers
 * from 1 to 100, but replace all multiples of 3 with the word 'fizz', all multiples of 5 with the
 * word 'buzz', and all multiples of <strong>both 3 and 5</strong> with the word 'fizzbuzz'.");
 * instead, this implementation includes a method that produces the single FizzBuzz value for a
 * single integer. This allows for more direct unit testing.
 */
public class FizzBuzz {

  /**
   * Computes and returns the {@link String} FizzBuzz value for a specified non-negative integer.
   * Return value will be "Fizz", "Buzz", "FizzBuzz", or the string representation of {@code value},
   * depending on whether it is divisible by 3, 5, 15, or none of the above.
   *
   * @param value {@code int} for which the FizzBuzz value will be computed.
   * @return {@link String} corresponding to {@code value}.
   */
  public EnumSet<FizzBuzzValue> getFizzBuzz(int value) {
    EnumSet<FizzBuzzValue> valueSet = EnumSet.noneOf(FizzBuzzValue.class);
    if (value % 3 == 0) {
      valueSet.add(FizzBuzzValue.FIZZ);
    }
    if (value % 5 == 0) {
      valueSet.add(FizzBuzzValue.BUZZ);
    }
    return valueSet;
  }

}
