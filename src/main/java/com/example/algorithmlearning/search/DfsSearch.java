package com.example.algorithmlearning.search;

import static java.util.Collections.emptyList;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Depth-First Search 구현, 그래프의 정점(vertex)을 탐색하는 방법 중 하나로
 * 한 노드의 자식을 타고 끝까지 순회한 후, 다시 돌아와서 다른 형제들의 자식을 타고 내려가며 순회하며 탐색한다.
 *
 * 시간 복잡도: O(V+E) (V: vertex, E: edge)
 */
public class DfsSearch {

  private DfsSearch() {
    throw new UnsupportedOperationException();
  }

  public static List<String> search(
      final Map<String, List<String>> graph,
      final String startVertex) {
    final List<String> result = new ArrayList<>();
    result.add(startVertex);

    final var adjacentVertexes = new ArrayList<>(graph.get(startVertex));

    while (!adjacentVertexes.isEmpty()) {
      final String lastVertex = adjacentVertexes.remove(adjacentVertexes.size() - 1);

      if (!result.contains(lastVertex)) {
        result.add(lastVertex);
        adjacentVertexes.addAll(graph.getOrDefault(lastVertex, emptyList()));
      }
    }

    return result;
  }
}
