package com.example.algorithmlearning.search;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;
import org.junit.jupiter.api.Test;

class BinarySearchTest {

  @Test
  void thenReturnedWhetherContainsElement_whenContains_givenIntegers() {
    // given
    final var arr1 = List.of(1, 2, 3, 4, 5);
    final var arr2 = List.of(10, 11, 23, 45, 60);

    // when
    final var result1 = BinarySearch.contains(arr1, 2);
    final var result2 = BinarySearch.contains(arr1, 51);

    final var result3 = BinarySearch.contains(arr2, 60);
    final var result4 = BinarySearch.contains(arr2, 0);

    // then
    assertThat(result1).isTrue();
    assertThat(result2).isFalse();

    assertThat(result3).isTrue();
    assertThat(result4).isFalse();
  }
}