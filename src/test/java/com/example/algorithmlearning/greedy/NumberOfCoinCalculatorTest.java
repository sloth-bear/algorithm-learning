package com.example.algorithmlearning.greedy;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;
import java.util.Map;
import org.junit.jupiter.api.Test;

class NumberOfCoinCalculatorTest {

  @Test
  void thenReturnSmallestCoinNumbers_whenCalculate_givenTotalPrice() {
    // given
    final Integer price = 4720;
    final List<Integer> coins = List.of(500, 100, 50, 1);

    final Map<Integer, Integer> expected = Map.of(
        500, 9,
        100, 2,
        50, 0,
        1, 20
    );

    // when
    final var result = NumberOfCoinCalculator.calculate(price, coins);

    // then
    assertThat(result).isEqualTo(expected);
  }

  @Test
  void thenReturnSmallestCoinNumbersTotal_whenCalculateMinTotal_givenTotalPrice() {
    // given
    final Integer price = 4720;
    final List<Integer> coins = List.of(500, 100, 50, 1);

    // when
    final var result = NumberOfCoinCalculator.calculateMinTotal(price, coins);

    // then
    assertThat(result).isEqualTo(31);
  }
}
