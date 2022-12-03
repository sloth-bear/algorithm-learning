package com.example.algorithmlearning.math;

import java.util.stream.IntStream;

/**
 * 자연수 n에 대한 팩토리얼 계산 객체, for loop, 재귀함수, Stream 이용함
 *
 * 시간 복잡도: O(n-1) 이므로 1은 무시, O(n)
 * 공간 복잡도: O(n-1) 이므로 1은 무시, O(n)
 */
public class FactorialAlgorithm {

  private FactorialAlgorithm() {
    throw new UnsupportedOperationException();
  }

  public static int forLoop(final int n) {
    int result = n;
    for (int k = n - 1; k > 0; k--) {
      result = result * k;
    }
    return result;
  }

  /**
   * 재귀함수로 호출될 때마다 해당 함수가 스택에 쌓이면서 최종 반환이 될 때까지 쌓인 후
   * 마지막에 쌓인 함수부터 순차적으로 호출되며 계산됨
   *
   * @param n 자연수, 자연수가 아닌 수를 넣을 경우 n을 반환
   * @return 자연수 n에 대한 팩토리얼 계산값
   */
  public static int recursive(final int n) {
    return n <= 1 ? n : n * recursive(n - 1);
  }

  public static int stream(final int n) {
    return IntStream.rangeClosed(1, n).reduce(1, (a, b) -> a*b);
  }
}
