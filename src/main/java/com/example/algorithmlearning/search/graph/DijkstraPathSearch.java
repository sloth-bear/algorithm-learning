package com.example.algorithmlearning.search.graph;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;

public class DijkstraPathSearch {

  private DijkstraPathSearch() {
    throw new UnsupportedOperationException();
  }

  public static Map<String, Integer> shortestDistances(final Map<String, List<Edge>> graph, final String startVertex) {
    final Map<String, Integer> shortestDistances = init(graph, startVertex);

    final PriorityQueue<Edge> pq = new PriorityQueue<>();
    pq.add(Edge.of(shortestDistances.get(startVertex), startVertex));

    while (!pq.isEmpty()) {
      final Edge vertex = pq.poll();
      System.out.println("start vertex: " + vertex.getTargetVertex());

      if (shortestDistances.get(vertex.getTargetVertex()) < vertex.getDistance()) {
        continue;
      }

      final List<Edge> nextVertexes = graph.get(vertex.getTargetVertex()); // 다음 depth vertexes
      for (final Edge next : nextVertexes) {
        final int totalDistance = vertex.getDistance() + next.getDistance();

        if (shortestDistances.get(next.getTargetVertex()) > totalDistance) {
          shortestDistances.put(next.getTargetVertex(), totalDistance);
          pq.add(Edge.of(totalDistance, next.getTargetVertex()));
        }
      }
    }

    return shortestDistances;
  }

  private static Map<String, Integer> init(final Map<String, List<Edge>> graph, final String startVertex) {
    final Map<String, Integer> result = new HashMap<>();
    for (final var vertex : graph.keySet()) {
      result.put(vertex, Integer.MAX_VALUE);
      result.put(startVertex, 0);
    }

    return result;
  }

}
