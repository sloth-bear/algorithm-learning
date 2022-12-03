package com.example.algorithmlearning.greedy.knapsack;

public class DivisibleStuff implements Comparable<DivisibleStuff> {

  private final int weight;
  private final double valuePerWeight;

  public DivisibleStuff(final int weight, final double value) {
    this.weight = weight;
    this.valuePerWeight = weight == 0 ? 0 : value / weight;
  }

  public static DivisibleStuff of(final int weight, final double value) {
    return new DivisibleStuff(weight, value);
  }

  public int getWeight() {
    return weight;
  }

  public double getValuePerWeight() {
    return valuePerWeight;
  }

  @Override
  public int compareTo(final DivisibleStuff e2) {
    return Double.compare(e2.valuePerWeight, this.valuePerWeight);
  }
}
