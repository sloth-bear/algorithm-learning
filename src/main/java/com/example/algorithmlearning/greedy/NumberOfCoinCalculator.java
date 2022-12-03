package com.example.algorithmlearning.greedy;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 최적의 값에 가까운 값을 구하기 위한 탐욕 알고리즘을 사용한 동전 수 계산기
 */
public class NumberOfCoinCalculator {

  /**
   * 주어진 가격을 동전으로만 구성하였을 때 필요한 최소한의 동전 개수 구성을 계산하는 메서드
   *
   * @param price 동전 수를 구하고자 하는 가격
   * @param coins 필요한 동전 수를 구할 때 구성할 동전 목록으로, 큰 수부터 역순 정렬된 배열이어야 함
   *              정렬되어있지 않을 경우 최소의 코인 수가 계산되지 않는다. ex) List.of(500, 100, 50)
   * @throws NullPointerException price, coins 파라미터가 null이거나 coins를 구성하는 element 중 null 요소가 있을 경우 발생
   * @return 주어진 가격을 동전으로만 구성하였을 때 필요한 최소한의 동적 개수를 Key(동전) Value(개수) 구조로 반환
   *         ex) Map.of(500, 9, 100, 3, 50, 1);
   */
  public static Map<Integer, Integer> calculate(final Integer price, final List<Integer> coins) {
    final Map<Integer, Integer> result = new HashMap<>();

    Integer change = price;

    for (final Integer coin : coins) {
      if (Integer.valueOf(0).equals(change)) break;

      final Integer numberOfCoin = change / coin;
      result.put(coin, numberOfCoin);

      change -= coin * numberOfCoin;
    }

    return result;
  }

  public static int calculateMinTotal(final Integer price, final List<Integer> coins) {
    int total = 0;

    final var calculatedCoins = calculate(price, coins);
    for (final var numberOfCoin : calculatedCoins.values()) {
      total += numberOfCoin;
    }

    return total;
  }
}
