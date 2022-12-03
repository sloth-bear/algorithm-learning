package com.example.algorithmlearning.search;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class BfsSearchTest {

  /**
   *        A
   *   B          C
   *   D       G  H  I
   * E  F            J
   */
  @Test
  void thenReturnVertexList_whenSearch_givenGraph() {
    // given
    final var graph = Map.of(
        "A", List.of("B", "C"),
        "B", List.of("A", "D"),
        "C", List.of("A", "G", "H", "I"),
        "D", List.of("B", "E", "F"),
        "E", List.of("D"),
        "F", List.of("D"),
        "G", List.of("C"),
        "H", List.of("C"),
        "I", List.of("C", "J"),
        "J", List.of("I")
    );
    final var expected = List.of("A", "B", "C", "D", "G", "H", "I", "E", "F", "J");

    // when
    final var result = BfsSearch.search(graph, "A");

    // then
    assertThat(result).isEqualTo(expected);
  }
}