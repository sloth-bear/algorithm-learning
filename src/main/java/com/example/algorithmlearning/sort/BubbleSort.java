package com.example.algorithmlearning.sort;

import java.util.Collections;
import java.util.List;

public class BubbleSort {

  private BubbleSort() {
    throw new UnsupportedOperationException();
  }

  public static List<Integer> sort(final List<Integer> src) {
    for (var outer=0; outer < src.size()-1; outer++) {
      var swapped = false;

      for (var inner=0; inner < src.size()-1-outer; inner++) {
        if (src.get(inner) > src.get(inner+1)) {
          Collections.swap(src, inner, inner+1);
          swapped = true;
        }
      }

      if (!swapped) {
        break;
      }
    }

    return src;
  }

}
