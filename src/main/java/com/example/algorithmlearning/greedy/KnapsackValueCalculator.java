package com.example.algorithmlearning.greedy;

import com.example.algorithmlearning.greedy.knapsack.DivisibleStuff;
import java.util.List;

/**
 * 부분 배낭 문제에 대한 해결을 위한 객체로, 무게 제한이 k인 배낭에 최대 가치를 가지도록 계산
 */
public class KnapsackValueCalculator {

  private KnapsackValueCalculator() {
    throw new UnsupportedOperationException();
  }

  /**
   * 무게 제한 배낭에 담을 수 있는 최대 가치를 반환한다. 주어진 물건은 쪼개서 넣을 수 있다.
   *
   * @param weightLimit 배낭의 무게, 0일 경우 0 반환
   * @param stuffs 무게와 가치를 가진 물건 목록으로, 해당 물건의 무게 1당 가치를 계산해 넣을 수 있는 최대 가치를 계산
   * @throws NullPointerException stuffs가 null, 혹은 stuffs 요소 중 하나라도 null 존재 시 발생
   */
  public static double calculate(final int weightLimit, final List<DivisibleStuff> stuffs) {
    stuffs.sort(DivisibleStuff::compareTo);

    int remainingWeight = weightLimit;
    double totalValue = 0;

    for (final DivisibleStuff stuff : stuffs) {
      final int weight = Math.min(remainingWeight, stuff.getWeight());
      if (weight <= 0) break;

      final double value = weight * stuff.getValuePerWeight();

      totalValue += value;
      remainingWeight -= weight;
    }

    return totalValue;
  }

}
