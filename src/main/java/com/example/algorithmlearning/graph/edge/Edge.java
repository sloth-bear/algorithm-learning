package com.example.algorithmlearning.graph.edge;

public class Edge implements Comparable<Edge> {

  public int weight;
  public String nodeV;
  public String nodeU;

  public Edge(final int weight, final String nodeV, final String nodeU) {
    this.weight = weight;
    this.nodeV = nodeV;
    this.nodeU = nodeU;
  }

  @Override
  public int compareTo(final Edge e2) {
    return weight - e2.weight;
  }

  @Override
  public String toString() {
    return "(" + this.nodeV + ", " + this.nodeU + ", " + this.weight + ")";
  }

}
