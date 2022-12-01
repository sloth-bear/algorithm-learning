package com.example.algorithmlearning.sort;

import java.util.ArrayList;

public class SortTestUtils {

  private SortTestUtils() {
    throw new UnsupportedOperationException();
  }

  public static void addHundredRandoms(final ArrayList<Integer> list) {
    for (int i = 0; i < 3; i++) {
      list.add((int) (Math.random() * 100));
    }
  }

}
