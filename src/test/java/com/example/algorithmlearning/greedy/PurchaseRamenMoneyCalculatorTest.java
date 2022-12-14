package com.example.algorithmlearning.greedy;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

@Deprecated
class PurchaseRamenMoneyCalculatorTest {

  @Test
  void givenNFactories_whenARamens_thenCalculateMinimumMoney() {
    // given
    final int n1 = 5;
    final int[] countOfRamens1 = new int[]{1,1,1,0,2};
    final var expected1 = 13;

    final int n2 = 5;
    final int[] countOfRamens2 = new int[]{1,0,1};
    final var expected2 = 6;

    // when
    final var result1 = PurchaseRamenMoneyCalculator.calculate(n1, countOfRamens1);
    final var result2 = PurchaseRamenMoneyCalculator.calculate(n2, countOfRamens2);

    // then
    Assertions.assertThat(result1).isEqualTo(expected1);
    Assertions.assertThat(result2).isEqualTo(expected2);
  }
}