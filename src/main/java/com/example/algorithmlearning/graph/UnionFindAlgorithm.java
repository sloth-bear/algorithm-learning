package com.example.algorithmlearning.graph;

import com.example.algorithmlearning.graph.edge.Edge;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UnionFindAlgorithm {

  private final Map<String, String> parentMap = new HashMap<>();
  private final Map<String, Integer> rankMap = new HashMap<>();

  public List<Edge> doKruskalAlgorithm(final List<String> vertexes, final List<Edge> edges) {
    final List<Edge> result = new ArrayList<>();

    // 1. 초기화
    for (final var vertex : vertexes) {
      makeSet(vertex);
    }

    // 2. 간선 weight 기반 sorting
    Collections.sort(edges);

    for (final var edge : edges) {
      if (!find(edge.nodeV).equals(find(edge.nodeU))) {
        System.out.println(edge);
        union(edge.nodeV, edge.nodeU);
        result.add(edge);
      }
    }

    return result;
  }

  // A - B
  // B - C
  // C - C (root)
  // find("A");
  // A - C
  // B - C
  // C - C
  public String find(final String node) {
    final var isRoot = parentMap.get(node).equals(node);

    // path compression
    if (!isRoot) {
      parentMap.put(node, find(parentMap.get(node)));
    }

    return parentMap.get(node);
  }

  public void union(final String nodeV, final String nodeU) {
    final String root1 = find(nodeV);
    final String root2 = find(nodeU);

    // union-by-rank
    if (rankMap.get(root1).compareTo(rankMap.get(root2)) > 0) {
      parentMap.put(root2, root1);
    } else {
      parentMap.put(root1, root2);
      if (rankMap.get(root1).equals(rankMap.get(root2))) {
        rankMap.put(root2, rankMap.get(root2) + 1);
      }
    }
  }

  public void makeSet(final String node) {
    // init
    parentMap.put(node, node);
    rankMap.put(node, 0);
  }

}
