package com.example.algorithmlearning.bruteforce;

import java.util.stream.IntStream;

public class FactorialAlgorithm {

  private FactorialAlgorithm() {
    throw new UnsupportedOperationException();
  }

  public static int forLoop(int i) {
    int result = i;
    for (int k = i - 1; k > 0; k--) {
      result = result * k;
    }
    return result;
  }

  public static int recursive(int i) {
    return i == 1 ? i : i * recursive(i - 1);
  }

  public static int stream(int i) {
    return IntStream.rangeClosed(1, i).reduce(1, (a, b) -> a*b);
  }
}
