package com.example.algorithmlearning.sort;

import static com.example.algorithmlearning.sort.SortTestUtils.addHundredRandoms;

import java.util.ArrayList;
import java.util.Collections;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class InsertionSortTest {

  @Test
  void thenAscSorted_whenInsertionSort_givenRandomIntegers() {
    // given
    final var list = new ArrayList<Integer>();
    addHundredRandoms(list);

    final var expected = new ArrayList<>(list);

    // when
    final var result = InsertionSort.sort(list);
    Collections.sort(expected);

    Assertions.assertThat(result).isEqualTo(expected);
  }

}