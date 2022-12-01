package com.example.algorithmlearning.bruteforce;

public class FibonacciAlgorithm {

  private FibonacciAlgorithm() {
    throw new UnsupportedOperationException();
  }

  public static int get(final int n) {
    return n <= 1 ? n : get(n-1) + get(n-2);
  }
}
