package com.example.algorithmlearning.sort;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.Collections;

class SortUtilsTest {

  @Test
  void thenAscSorted_whenBubbleSort_givenRandomIntegers() {
    // given
    final var list = new ArrayList<Integer>();
    for (int i = 0; i < 100; i++) {
      list.add((int) (Math.random() * 100));
    }

    final var expected = new ArrayList<>(list);

    // when
    final var result = SortUtils.bubble(list);
    Collections.sort(expected);

    // then
    Assertions.assertThat(result).isEqualTo(expected);
  }
}
