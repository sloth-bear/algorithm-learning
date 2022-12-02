package com.example.algorithmlearning.sort;

import java.util.ArrayList;
import java.util.List;
import org.springframework.lang.NonNull;

/**
 * Dynamic programming - 분할정복의 일종
 *
 * 시간 복잡도: O(n log n) 이나, 이미 정렬된 상태에서 pivot이 가장 크거나 가장 작을 경우 O(n²)
 */
public class QuickSort {

  private QuickSort() {
    throw new UnsupportedOperationException();
  }

  public static List<Integer> sort(@NonNull final List<Integer> src) {
    if (src.size() < 2) {
      return src;
    }

    final var pivot = src.get(0);

    final var left = new ArrayList<Integer>();
    final var right = new ArrayList<Integer>();

    for(int i=1; i<src.size(); i++) {
      if (src.get(i) < pivot) {
        left.add(src.get(i));
      } else {
        right.add(src.get(i));
      }
    }

    final var result = new ArrayList<>(sort(left));
    result.add(pivot);
    result.addAll(sort(right));

    return result;
  }
}
