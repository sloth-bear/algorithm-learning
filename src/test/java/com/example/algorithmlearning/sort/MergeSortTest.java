package com.example.algorithmlearning.sort;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Collections;
import java.util.ArrayList;
import org.junit.jupiter.api.Test;

class MergeSortTest {

  @Test
  void thenAscSorted_whenMergeSort_givenRandomIntegers() {
    // given
    final var list = new ArrayList<Integer>();
    SortTestUtils.addHundredRandoms(list);

    final var expected = new ArrayList<>(list);
    Collections.sort(expected);

    // when
    final var result = MergeSort.sort(list);
    assertThat(result).isEqualTo(expected);
  }

}