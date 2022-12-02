package com.example.algorithmlearning.sort;

import static com.example.algorithmlearning.sort.util.SortTestUtils.addHundredRandoms;

import java.util.ArrayList;
import java.util.Collections;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class BubbleSortTest {

  @Test
  void thenAscSorted_whenBubbleSort_givenRandomIntegers() {
    // given
    final var list = new ArrayList<Integer>();
    addHundredRandoms(list);

    final var expected = new ArrayList<>(list);

    // when
    final var result = BubbleSort.sort(list);
    Collections.sort(expected);

    // then
    Assertions.assertThat(result).isEqualTo(expected);
  }

}