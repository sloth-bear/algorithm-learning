package com.example.algorithmlearning.search;

import static org.assertj.core.api.Assertions.assertThat;

import com.example.algorithmlearning.search.graph.DfsSearch;
import java.util.List;
import java.util.Map;
import org.junit.jupiter.api.Test;

class DfsSearchTest {

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
    final var expected = List.of("A", "C", "I", "J", "H", "G", "B", "D", "F", "E");

    // when
    final var result = DfsSearch.search(graph, "A");

    // then
    assertThat(result).isEqualTo(expected);
  }
}