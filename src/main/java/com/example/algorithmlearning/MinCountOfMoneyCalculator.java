package com.example.algorithmlearning;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * 계좌에 들어있는 돈 일부를 은행에서 출금하고자 합니다.
 * 돈 담을 지갑이 최대한 가볍도록 큰 금액의 화폐 위주로 받습니다.
 * 돈의 액수 money가 매개변수로 주어질 때, 오만 원권, 만 원권, 오천 원권, 천 원권, 오백원 동전, 백원 동전, 오십원 동전, 십원 동전, 일원 동전
 * 각 몇 개로 변환되는지 금액이 큰 순서대로 배열에 담아 return 하도록 solution 메서드를 완성해주세요.
 *
 * 제한사항
 * money는 1 이상 1,000,000 이하인 자연수입니다.
 *
 * 입출력 예
 * money	result
 * 50237	[1, 0, 0, 0, 0, 2, 0, 3, 7]
 * 15000	[0, 1, 1, 0, 0, 0, 0, 0, 0]
 *
 * 입출력 예 설명
 * 입출력 예 #1
 * 50,237원은 5만 원권 1매, 100원짜리 동전 2개, 10원짜리 동전 3개, 1원짜리 동전 7개로 만들 수 있습니다.
 *
 * 입출력 예 #2
 * 15,000원은 만 원권 1매, 5천 원권 1매로 만들 수 있습니다.
 */
public class MinCountOfMoneyCalculator {

  private static final int[] MONEY_UNITS = new int[]{50000, 10000, 5000, 1000, 500, 100, 50, 10, 1};

  public List<Integer> solution(final int money) {
    if (money < 1 || money > 1000000) {
      throw new IllegalArgumentException();
    }

    final var result = new ArrayList<Integer>();

    var change = money;
    for (final var unit : MONEY_UNITS) {
      result.add(change / unit);
      change %= unit;
    }

    return result;
  }

  public static void main(String[] args) {
    final var calculator = new MinCountOfMoneyCalculator();
    System.out.println(calculator.solution(15000));
  }
}


