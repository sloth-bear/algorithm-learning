package com.example.algorithmlearning.search;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import java.util.List;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SequentialSearchTest {

  @Test
  void thenReturnedIndex_whenFindIndex_givenIntegers() {
    // given
    final var arr1 = List.of(1, 2, 3, 4, 5);
    final var arr2 = List.of(10, 11, 23, 45, 60);

    // when
    final var result1 = SequentialSearch.findIndex(arr1, 2);
    final var result2 = SequentialSearch.findIndex(arr1, 51);

    final var result3 = SequentialSearch.findIndex(arr2, 60);
    final var result4 = SequentialSearch.findIndex(arr2, 0);

    // then
    assertThat(result1).isEqualTo(1);
    assertThat(result2).isEqualTo(-1);
    
    assertThat(result3).isEqualTo(4);
    assertThat(result4).isEqualTo(-1);
  }
}