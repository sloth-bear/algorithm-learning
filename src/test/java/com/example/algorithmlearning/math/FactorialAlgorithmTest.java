package com.example.algorithmlearning.math;

import static org.assertj.core.api.Assertions.assertThat;

import com.example.algorithmlearning.math.FactorialAlgorithm;
import org.junit.jupiter.api.Test;

class FactorialAlgorithmTest {

  @Test
  void shouldReturnCalculatedFactorial_givenInteger() {
    final var result1 = FactorialAlgorithm.forLoop(4);
    final var result2 = FactorialAlgorithm.forLoop(5);

    final var result3 = FactorialAlgorithm.recursive(6);
    final var result4 = FactorialAlgorithm.recursive(5);

    final var result5 = FactorialAlgorithm.stream(5);
    final var result6 = FactorialAlgorithm.stream(7);

    assertThat(result1).isEqualTo(24);
    assertThat(result2).isEqualTo(120);
    assertThat(result3).isEqualTo(720);
    assertThat(result4).isEqualTo(120);
    assertThat(result5).isEqualTo(120);
    assertThat(result6).isEqualTo(5040);
  }

}
