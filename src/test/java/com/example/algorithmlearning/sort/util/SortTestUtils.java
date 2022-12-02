package com.example.algorithmlearning.sort.util;

import java.util.ArrayList;

public class SortTestUtils {

  private SortTestUtils() {
    throw new UnsupportedOperationException();
  }

  public static void addHundredRandoms(final ArrayList<Integer> list) {
    for (int i = 0; i < 100; i++) {
      list.add((int) (Math.random() * 100));
    }
  }

}
