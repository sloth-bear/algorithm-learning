package com.example.algorithmlearning.sort;

import java.util.Collections;
import java.util.List;

public class InsertionSort {

  private InsertionSort() {
    throw new UnsupportedOperationException();
  }

  public static List<Integer> sort(final List<Integer> src) {
    for (int i=0; i<src.size()-1; i++) {
      for (int j=i+1; j>0; j--) {
        if (src.get(j) < src.get(j-1)) {
          Collections.swap(src, j, j-1);
        } else {
          break;
        }
      }
    }

    return src;
  }
}
