package com.example.algorithmlearning.graph;

import com.example.algorithmlearning.graph.edge.Edge;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class KruskalAlgorithmTest {

  @Test
  void thenMinSpanningTreePaths_whenKruskal_givenGraph() {
    // given
    final List<Edge> edges = new ArrayList<>();
    addEdges(edges);

    final List<String> vertexes = new ArrayList<>(Arrays.asList("A", "B", "C", "D", "E", "F", "G"));
    final var kruskal = new UnionFindAlgorithm();

    // when
    final var result = kruskal.doKruskalAlgorithm(vertexes, edges);

    // then
    Assertions.assertThat(result.size()).isEqualTo(6);
  }

  void addEdges(final List<Edge> edges) {
    edges.add(new Edge(7, "A", "B"));
    edges.add(new Edge(5, "A", "D"));

    edges.add(new Edge(7, "B", "A"));
    edges.add(new Edge(8, "B", "C"));
    edges.add(new Edge(9, "B", "D"));
    edges.add(new Edge(7, "B", "E"));

    edges.add(new Edge(8, "C", "B"));
    edges.add(new Edge(5, "C", "E"));

    edges.add(new Edge(5, "D", "A"));
    edges.add(new Edge(9, "D", "B"));
    edges.add(new Edge(7, "D", "E"));
    edges.add(new Edge(6, "D", "F"));

    edges.add(new Edge(7, "E", "B"));
    edges.add(new Edge(5, "E", "C"));
    edges.add(new Edge(7, "E", "D"));
    edges.add(new Edge(8, "E", "F"));
    edges.add(new Edge(9, "E", "G"));

    edges.add(new Edge(6, "F", "D"));
    edges.add(new Edge(8, "F", "E"));
    edges.add(new Edge(11, "F", "G"));

    edges.add(new Edge(9, "G", "E"));
    edges.add(new Edge(11, "G", "F"));
  }

}
