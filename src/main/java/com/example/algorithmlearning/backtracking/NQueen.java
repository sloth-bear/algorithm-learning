package com.example.algorithmlearning.backtracking;

import java.util.List;

public class NQueen {

  private NQueen() {
   throw new UnsupportedOperationException();
  }

  /**
   * 주어진 n에 대해 가로 n, 세로 n 크기의 체스판에 퀸이 서로 공격할 수 없도록 위치하는 경우들의 목록을 반환한다.
   * 퀸은 가로열에 대해 공격할 수 있으므로, 반환되는 배열은 각 행 내에서의 값을 candidate에 담는다.
   *
   * 참고) 퀸은 체스판 내 수직/수평/대각선에 대해 공격할 수 있다.
   *
   * @param n 체스판의 가로, 세로 길이로 nxn 크기의 체스판을 가정해
   *          queen이 서로 공격할 수 없는 위치들의 목록을 반환
   */
  public static void indexesOfRows(final int n, final int currentRow, final List<Integer> candidate) {
    if (currentRow == n) {
      System.out.println(candidate);
      return;
    }

    for (int i = 0; i < n; i++) {
      if (isAvailable(candidate, i)) {
        candidate.add(i);
        indexesOfRows(n, currentRow + 1, candidate);
        candidate.remove(candidate.size() - 1);
      }
    }
  }

  private static boolean isAvailable(final List<Integer> candidate, final int currentCol) {
    final int currentRow = candidate.size();

    for (int index = 0; index < currentRow; index++) {
      if ((candidate.get(index) == currentCol) || (Math.abs(candidate.get(index) - currentCol) == currentRow - index)) {
        return false;
      }
    }

    return true;
  }

}
