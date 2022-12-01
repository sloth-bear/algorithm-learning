package com.example.algorithmlearning.bruteforce;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;
import org.junit.jupiter.api.Test;

class FibonacciAlgorithmTest {

  @Test
  void thenReturnFibonacci_whenRecursive_givenNaturalInteger() {
    // given
    final var number1 = (int) (Math.random() * 10);
    final var number2 = (int) (Math.random() * 10);
    
    final var fibonacciSequences = List.of(0, 1, 1, 2, 3, 5, 8, 13, 21, 34);
    
    // when
    final var result1 = FibonacciAlgorithm.recursive(number1);
    final var result2 = FibonacciAlgorithm.recursive(number2);

    // then
    assertThat(result1).isEqualTo(fibonacciSequences.get(number1));
    assertThat(result2).isEqualTo(fibonacciSequences.get(number2));
  }

  @Test
  void thenReturnFibonacci_whenDp_givenNaturalInteger() {
    final var number1 = (int) (Math.random() * 10);
    final var number2 = (int) (Math.random() * 10);

    final var fibonacciSequences = List.of(0, 1, 1, 2, 3, 5, 8, 13, 21, 34);

    // when
    final var result1 = FibonacciAlgorithm.dp(number1);
    final var result2 = FibonacciAlgorithm.dp(number2);

    // then
    assertThat(result1).isEqualTo(fibonacciSequences.get(number1));
    assertThat(result2).isEqualTo(fibonacciSequences.get(number2));
  }
}