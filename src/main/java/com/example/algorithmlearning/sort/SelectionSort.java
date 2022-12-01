package com.example.algorithmlearning.sort;

import java.util.Collections;
import java.util.List;
import org.springframework.lang.NonNull;

public class SelectionSort {

  private SelectionSort() {
    throw new UnsupportedOperationException();
  }

  public static List<Integer> sort(@NonNull final List<Integer> src) {
    for (int outer=0; outer < src.size()-1; outer++) {
      int minIndex = outer;

      for (int inner=outer+1; inner<src.size(); inner++) {
        if (src.get(minIndex) > src.get(inner)) {
          minIndex = inner;
        }
      }

      if (minIndex != outer) {
        Collections.swap(src, minIndex, outer);
      }
    }

    return src;
  }

}
