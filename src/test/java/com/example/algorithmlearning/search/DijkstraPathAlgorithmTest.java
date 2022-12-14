package com.example.algorithmlearning.search;

import com.example.algorithmlearning.search.DijkstraPathAlgorithm;
import com.example.algorithmlearning.search.graph.Edge;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class DijkstraPathAlgorithmTest {

  @Test
  void thenShortestPathsAll_whenShortestDistances_givenGraph() {
    // given
    final Map<String, List<Edge>> graph = Map.of(
        "A", Arrays.asList(Edge.of(8, "B"), Edge.of(1, "C"), Edge.of(2, "D")),
        "B", List.of(),
        "C", Arrays.asList(Edge.of(5, "B"), Edge.of(2, "D")),
        "D", Arrays.asList(Edge.of(3, "E"), Edge.of(5, "F")),
        "E", List.of(Edge.of(1, "F")),
        "F", List.of(Edge.of(5, "A"))
    );
    final Map<String, Integer> expected = Map.of(
        "A", 0,
        "B", 6,
        "C", 1,
        "D", 2,
        "E", 5,
        "F", 6
    );

    // when
    final Map<String, Integer> result = DijkstraPathAlgorithm.shortestDistances(graph, "A");

    // then
    Assertions.assertThat(result).isEqualTo(expected);
  }
}