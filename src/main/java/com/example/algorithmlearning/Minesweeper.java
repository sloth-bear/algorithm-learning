package com.example.algorithmlearning;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * 지뢰찾기 게임은 2×N 배열에 숨겨져 있는 지뢰를 찾는 게임이다.
 * 지뢰 주위에 쓰여 있는 숫자들로 지뢰를 찾을 수 있는데,
 * 한 블록에 쓰여진 숫자는 그 블록 주위에 지뢰가 몇 개 있는지를 나타낸다.
 *
 * 지뢰가 확실히 있는 위치를 *, 숨겨진 블록을 #으로 표시한다.
 * 첫째 줄에는 숫자만 나타나고 둘째 줄에는 *와 #만 나타나는데, 지뢰는 둘째 줄에만 있다.
 *
 * 12110
 * ##*##
 *
 * 위의 그림 2×5 배열에는 지뢰가 2개가 있다는 것을 알 수 있다.
 * 숨겨진 블록 중 첫 번째 블록에 지뢰가 숨겨져 있고, 나머지 하나는 두 번째 줄의 가운데에 있다.
 *
 * 2×N 배열이 주어지면 주어진 배열에 있는 모든 지뢰의 개수(*까지 포함)를 찾는 프로그램을 작성하시오.
 *
 * Input
 * 입력의 첫 줄에는 테스트 케이스의 개수 T(1 ≤ T ≤ 10)가 주어진다.
 * 각 테스트 케이스는 첫 줄에 배열의 크기 N(1 ≤ N ≤ 100)이 주어지고, 그 다음 두 줄에 걸쳐서 배열이 주어진다.
 * 첫 줄에는 항상 숫자만이 나타나며 이 숫자들 사이에 공백은 없으며, 둘째 줄에 주어지는 입력들 사이에도 공백은 없다.
 * 그리고 이 숫자들은 올바른 값만이 입력으로 들어온다(지뢰의 위치에 대해 불가능한 값은 입력으로 주지 않는다).
 *
 * Output
 * 각 테스트 케이스에 대해서 주어진 배열에 있는 모든 지뢰의 수를 한 줄에 하나씩 출력한다.
 * 지뢰의 수가 여럿이 될 수 있으면 가능한 지뢰의 수 중 최댓값을 출력한다.
 *
 * @see <a href="https://www.acmicpc.net/problem/9082">BAEKJOON - 지뢰찾기</a>
 */
public class Minesweeper {

  public static void main(String[] args) throws IOException {
    final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    final int countOfCase = Integer.parseInt(br.readLine());

    for (int i=0; i<countOfCase; i++) {
      final String length = br.readLine();
      final int[] numbers = Arrays.stream(br.readLine().split(""))
          .mapToInt(Integer::parseInt)
          .toArray();
      final String mines = br.readLine();

      printMineCount(numbers);
    }
  }

  private static void printMineCount(final int[] numbers) {
    if (numbers.length == 1) {
      System.out.println(1);
      return;
    }

    int mineCount = 0;
    for (int i = 0; i < numbers.length; i++) {
      if (i == 0) {
        if (numbers[i] != 0 && numbers[i+1] != 0) {
          numbers[i]--;
          numbers[i+1]--;
          mineCount++;
        }
      } else if(i == numbers.length - 1) {
        if (numbers[i-1] != 0 && numbers[i] != 0) {
          numbers[i-1]--;
          numbers[i]--;
          mineCount++;
        }
      } else {
        if (numbers[i-1] != 0 && numbers[i] != 0 && numbers[i+1] != 0) {
          numbers[i-1]--;
          numbers[i]--;
          numbers[i+1]--;
          mineCount++;
        }
      }
    }

    System.out.println(mineCount);
  }
}
