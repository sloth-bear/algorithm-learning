package com.example.algorithmlearning.search;

import java.util.List;

public class BinarySearch {

  private BinarySearch() {
    throw new UnsupportedOperationException();
  }

  /**
   * 주어진 배열에 대한 요소 존재 여부를 반환하는 메소드로, 이진 탐색 기반으로 검색한다.
   * 이진 탐색은 분할 정복 기법 중 하나로, 문제를 하나 또는 둘 이상으로 나누며 다룰 수 있을 때까지 충분히 작게 나누며 해결한 다음 합친다.
   *
   * 시간 복잡도: O(log n)
   *
   * @param src Integer 배열, 순차정렬되어있어야 하며 정렬되어있지 않을 경우 올바르지 않은 결과가 반환될 수 있다.
   * @param element 찾고자 하는 요소
   * @throws NullPointerException src가 null일 경우 발생함. src 내 요소 중 null이 존재할 경우에도 발생할 수 있음
   * @return 찾고자 하는 element가 src에 존재할 경우 true, 존재하지 않을 경우 false
   */
  public static boolean contains(final List <Integer> src, final Integer element) {
    if (src.size() == 1) {
      return src.get(0).equals(element);
    }

    final var size = src.size();
    final var half = size / 2;
    final var halfList = src.get(half).compareTo(element) > 0 ? src.subList(0, half): src.subList(half, size);

    return contains(halfList, element);
  }
}
