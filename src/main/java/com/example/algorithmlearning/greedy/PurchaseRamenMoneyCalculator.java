package com.example.algorithmlearning.greedy;

import java.util.HashMap;
import java.util.Map;

/**
 * 라면매니아 교준이네 집 주변에는 N개의 라면 공장이 있다. 각 공장은 1번부터 N번까지 차례대로 번호가 부여되어 있다.
 * 교준이는 i번 공장에서 정확하게 Ai개의 라면을 구매하고자 한다(1 ≤ i ≤ N).
 *
 * 교준이는 아래의 세 가지 방법으로 라면을 구매할 수 있다.
 *
 * i번 공장에서 라면을 하나 구매한다(1 ≤ i ≤ N). 이 경우 비용은 3원이 든다.
 * i번 공장과 (i+1)번 공장에서 각각 라면을 하나씩 구매한다(1 ≤ i ≤ N-1). 이 경우 비용은 5원이 든다.
 * i번 공장과 (i+1)번 공장, (i+2)번 공장에서 각각 라면을 하나씩 구매한다(1 ≤ i ≤ N-2). 이 경우 비용은 7원이 든다.
 *
 * 최소의 비용으로 라면을 구매하고자 할 때, 교준이가 필요한 금액을 계산한다.
 *
 * @see <a href="https://www.acmicpc.net/problem/18185">BAEKJOON - 18185</a>
 * @deprecated 틀렸기 때문에 다시 풀 예정
 */
@Deprecated
public class PurchaseRamenMoneyCalculator {

  private PurchaseRamenMoneyCalculator() {
    throw new UnsupportedOperationException();
  }

  public static int calculate(final int n , final int[] countOfRamens) {
    final Map<Integer, Integer> result = new HashMap<>();
    result.put(1, 0);
    result.put(2, 0);
    result.put(3, 0);

    for (int i = 0; i < countOfRamens.length; i++) {
      if (i < countOfRamens.length - 2 && countOfRamens[i] == countOfRamens[i + 1] && countOfRamens[i + 1] == countOfRamens[i + 2]) {
        result.put(3, result.get(3) + (countOfRamens[i] * 7));
        i += 2;
      } else if (i < countOfRamens.length - 1 && countOfRamens[i] == countOfRamens[i + 1]){
        result.put(3, result.get(3) + (countOfRamens[i] * 5));
        i += 1;
      } else {
        result.put(1, result.get(1) + (countOfRamens[i] * 3));
      }
    }

    return result.get(1) + result.get(2) + result.get(3);
  }
}
