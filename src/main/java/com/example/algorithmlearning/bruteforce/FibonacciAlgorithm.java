package com.example.algorithmlearning.bruteforce;

public class FibonacciAlgorithm {

  private FibonacciAlgorithm() {
    throw new UnsupportedOperationException();
  }

  public static int get(final int n) {
    if (n == 0) {
      return 0;
    }

    return n == 1 ? 1 : get(n-1) + get(n-2);
  }
}
