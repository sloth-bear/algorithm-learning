package com.example.algorithmlearning.greedy;

import static org.assertj.core.api.Assertions.assertThat;

import com.example.algorithmlearning.greedy.knapsack.DivisibleStuff;
import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;

class KnapsackValueCalculatorTest {

  @Test
  void thenReturnMaxValueStuff_whenSolveFractionalProblem_givenKnapsackLimitWithWeightValue() {
    // given
    final int limit = 30;
    final List<DivisibleStuff> stuffs = Arrays.asList(
        DivisibleStuff.of(10, 10), // 20
        DivisibleStuff.of(15, 12), //
        DivisibleStuff.of(20, 10),
        DivisibleStuff.of(25, 8),
        DivisibleStuff.of(30, 5)
    );

    // when
    final var result = KnapsackValueCalculator.calculate(limit, stuffs);

    // then
    assertThat(result).isEqualTo(24.5);
  }
}