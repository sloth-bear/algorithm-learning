package com.example.algorithmlearning.sort;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import org.springframework.lang.NonNull;

public class SortUtils {

  private SortUtils() {
    throw new UnsupportedOperationException();
  }

  public static List<Integer> bubble(final List<Integer> src) {
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

  public static List<Integer> selection(@NonNull final List<Integer> src) {
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

  public static List<Integer> insertion(final List<Integer> src) {
    for (int i=0; i<src.size()-1; i++) {
      for (int j=i+1; j>0; j--) {
        if (src.get(j) < src.get(j-1)) {
          Collections.swap(src, j, j-1);
        }
      }
    }

    return src;
  }
}
