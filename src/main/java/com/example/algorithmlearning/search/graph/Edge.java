package com.example.algorithmlearning.search.graph;

public class Edge implements Comparable<Edge>{

  private final int distance;
  private final String targetVertex;

  public Edge(final int distance, final String targetVertex) {
    this.distance = distance;
    this.targetVertex = targetVertex;
  }

  public int getDistance() {
    return distance;
  }

  public String getTargetVertex() {
    return targetVertex;
  }

  public static Edge of(final int distance, final String vertex) {
    return new Edge(distance, vertex);
  }

  @Override
  public int compareTo(final Edge e2) {
    return distance - e2.getDistance();
  }

  @Override
  public String toString() {
    return "Edge{" +
        "distance=" + distance +
        ", vertex='" + targetVertex + '\'' +
        '}';
  }
}
