package com.example.algorithmlearning.search;

import java.util.List;

public class SequentialSearch {

  private SequentialSearch() {
    throw new UnsupportedOperationException();
  }

  /**
   * 주어진 배열의 인덱스를 순차 탐색 기반으로 검색하여 찾는 메소드
   *
   * 시간복잡도: O(n)
   *
   * @param src Integer 배열
   * @param element 찾고자 하는 요소
   * @throws NullPointerException src가 null일 경우 발생함. src 내 요소 중 null이 존재할 경우에도 발생할 수 있음
   * @return 찾고자 하는 element의 index 위치를 반환함. 존재하지 않을 경우 -1을 반환
   */
  public static int findIndex(final List<Integer> src, final Integer element) {
    int result = -1;

    for (int i=0; i<src.size(); i++) {
      if (src.get(i).equals(element)) {
        result = i;
        break;
      }
    }

    return result;
  }
}
