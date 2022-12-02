package com.example.algorithmlearning.sort;

import com.example.algorithmlearning.sort.util.SortTestUtils;
import java.util.ArrayList;
import java.util.Collections;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class QuickSortTest {

  @Test
  void thenAscSorted_whenBubbleSort_givenRandomIntegers() {
    // given
    final var list = new ArrayList<Integer>();
    SortTestUtils.addHundredRandoms(list);

    final var expected = new ArrayList<>(list);

    // when
    final var result = QuickSort.sort(list);
    Collections.sort(expected);

    // then
    Assertions.assertThat(result).isEqualTo(expected);
  }
}