package com.example.algorithmlearning.backtracking;

import java.util.ArrayList;
import org.junit.jupiter.api.Test;

class NQueenTest {

  @Test
  void givenSizeN_whenIndexesOfRows_thenAddedQueensIndexesOfRows() {
    // given
    final int n = 4;

    // when
    final var result = new ArrayList<Integer>();
    NQueen.indexesOfRows(n, 0, result);
  }
}