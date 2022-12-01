package com.example.algorithmlearning.sort;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeSort {

  private MergeSort() {
    throw new UnsupportedOperationException();
  }

  public static List<Integer> sort(final List<Integer> src) {
    return split(src);
  }

  private static List<Integer> split(final List<Integer> src) {
    final var size = src.size();
    if (size <= 1) {
      return src;
    }

    final int half = size / 2;
    final List<Integer> sub1 = split(src.subList(0, half));
    final List<Integer> sub2 = split(src.subList(half, src.size()));

    return merge(sub1, sub2);
  }

  private static List<Integer> merge(final List<Integer> list1, final List<Integer> list2) {
    final List<Integer> result = new ArrayList<>();

    int leftPointer = 0;
    int rightPointer = 0;

    final int leftSize = list1.size();
    final int rightSize = list2.size();

    while (leftPointer < leftSize && rightPointer < rightSize) {
      if (list1.get(leftPointer) < list2.get(rightPointer)) {
        result.add(list1.get(leftPointer));
        leftPointer++;
      } else {
        result.add(list2.get(rightPointer));
        rightPointer++;
      }
    }

    if (rightPointer == 0) {
      result.addAll(list2);
    } else if (leftPointer == 0) {
      result.addAll(list1);
    } else if (rightPointer < rightSize) {
      result.addAll(list2.subList(rightPointer, rightSize));
    } else {
      result.addAll(list1.subList(leftPointer, leftSize));
    }

    return result;
  }
}
