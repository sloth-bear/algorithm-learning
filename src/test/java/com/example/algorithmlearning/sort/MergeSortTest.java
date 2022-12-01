package com.example.algorithmlearning.sort;

import static com.example.algorithmlearning.sort.SortTestUtils.addHundredRandoms;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Collections;
import java.util.List;
import java.util.ArrayList;
import org.assertj.core.api.Assertions;
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