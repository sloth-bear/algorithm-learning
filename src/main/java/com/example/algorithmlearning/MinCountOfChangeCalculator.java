package com.example.algorithmlearning;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 타로는 자주 JOI 잡화점에서 물건을 산다.
 * JOI 잡화점에는 잔돈으로 500엔, 100엔, 50엔, 10엔, 5엔, 1엔이 충분히 있고,
 * 언제나 거스름돈 개수가 가장 적게 잔돈을 준다.
 *
 * 타로가 JOI 잡화점에서 물건을 사고 카운터에서 1000엔 지폐를 한장 냈을 때,
 * 받을 잔돈에 포함된 잔돈의 개수를 구하는 프로그램을 작성하시오.
 *
 * Input
 * 입력은 한줄로 이루어져있고, 타로가 지불할 돈(1 이상 1000미만의 정수) 1개가 쓰여져있다.
 *
 * Output
 * 제출할 출력 파일은 1행으로만 되어 있다. 잔돈에 포함된 매수를 출력하시오.
 *
 * @see <a href="https://www.acmicpc.net/problem/5585">BACKJOON - 거스름돈</a>
 */
public class MinCountOfChangeCalculator {

  public static void main(final String[] args) throws IOException {
    final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    final int price = Integer.parseInt(br.readLine());

    final int[] coins = {500, 100, 50, 10, 5, 1};

    int countOfCoins = 0;
    int change = 1000 - price;

    for (final int coin : coins) {
      if (change == 0) {
        break;
      }
      countOfCoins += change / coin;
      change -= coin * (change / coin);
    }

    System.out.println(countOfCoins);
  }
}
