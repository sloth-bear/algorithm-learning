package com.example.algorithmlearning.search;

import static java.util.Collections.emptyList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/**
 * Breadth-First Search 구현, 그래프의 정점(vertex)을 탐색하는 방법 중 하나로
 * 같은 레벨에 있는 vertex를 먼저 탐색한다.
 *
 * 시간 복잡도: O(V+E) (V: vertex, E: edge)
 * ex) vertex 개수: 3개, edge 개수: 2개면 5번 탐색
 */
public class BfsSearch {

  private BfsSearch() {
    throw new UnsupportedOperationException();
  }

  public static List<String> search(final Map<String, List<String>> graph, final String startVertex) {
    final var result = new ArrayList<String>();
    result.add(startVertex);

    final var adjacentVertexes = new ArrayList<>(graph.get(startVertex));

    while (adjacentVertexes.size() > 0) {
      final var firstAVertex = adjacentVertexes.remove(0);
      if (!result.contains(firstAVertex)) {
        result.add(firstAVertex);
        adjacentVertexes.addAll(graph.getOrDefault(firstAVertex, emptyList()));
      }
    }

    return result;
  }
}
