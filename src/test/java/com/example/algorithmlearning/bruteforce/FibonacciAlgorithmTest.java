package com.example.algorithmlearning.bruteforce;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import java.util.List;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class FibonacciAlgorithmTest {

  @Test
  void thenReturnFibonacci_whenGet_givenNaturalInteger() {
    // given
    final var number1 = (int) (Math.random() * 10);
    final var number2 = (int) (Math.random() * 10);
    
    final var fibonacciSequences = List.of(0, 1, 1, 2, 3, 5, 8, 13, 21, 34);
    
    // when
    final var result1 = FibonacciAlgorithm.get(number1);
    final var result2 = FibonacciAlgorithm.get(number2);

    // then
    assertThat(result1).isEqualTo(fibonacciSequences.get(number1));
    assertThat(result2).isEqualTo(fibonacciSequences.get(number2));
  }
}