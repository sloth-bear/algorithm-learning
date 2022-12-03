package com.example.algorithmlearning.math;

public class FibonacciAlgorithm {

  private FibonacciAlgorithm() {
    throw new UnsupportedOperationException();
  }

  public static int recursive(final int n) {
    return n <= 1 ? n : recursive(n-1) + recursive(n-2);
  }

  public static int dp(final int n) {
    final int[] cache = new int[n+1];
    cache[0] = 0;

    if (n==0) {
      return cache[n];
    }

    cache[1] = 1;

    for (int i = 2; i < n+1; i++) {
      cache[i] = cache[i-1] + cache[i-2];
    }

    return cache[n];
  }

}
