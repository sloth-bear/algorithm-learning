package com.example.algorithmlearning.sort;

import static org.assertj.core.api.Assertions.assertThat;

import java.sql.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.ArrayList;
import org.junit.jupiter.api.Test;

class MergeSortTest {

  @Test
  void thenAscSorted_whenMergeSort_givenRandomIntegers() {
    // given
    final var list1 = new ArrayList<Integer>();
    SortTestUtils.addHundredRandoms(list1);

    final var list2 = new ArrayList<>(Arrays.asList(10,9,8,7,6,5));

    final var expected1 = new ArrayList<>(list1);
    Collections.sort(expected1);
    final var expected2 = new ArrayList<>(list2);
    Collections.sort(expected2);

    // when
    final var result1 = MergeSort.sort(list1);
    assertThat(result1).isEqualTo(expected1);

    final var result2 = MergeSort.sort(list2);
    assertThat(result2).isEqualTo(expected2);
  }

}