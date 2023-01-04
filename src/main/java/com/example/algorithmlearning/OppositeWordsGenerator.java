package com.example.algorithmlearning;

import static java.util.Map.entry;

import java.util.Map;
import java.util.stream.Collectors;
import org.springframework.lang.NonNull;

public class OppositeWordsGenerator {

  private static final Map<String, String> DICTIONARY = Map.ofEntries(
      entry("A", "Z"),
      entry("B", "Y"),
      entry("C", "X"),
      entry("D", "W"),
      entry("E", "V"),
      entry("F", "U"),
      entry("G", "T"),
      entry("H", "S"),
      entry("I", "R"),
      entry("J", "Q"),
      entry("K", "P"),
      entry("L", "O"),
      entry("M", "N"),
      entry("N", "M"),
      entry("O", "L"),
      entry("P", "K"),
      entry("Q", "J"),
      entry("R", "I"),
      entry("S", "H"),
      entry("T", "G"),
      entry("U", "F"),
      entry("V", "E"),
      entry("W", "D"),
      entry("X", "C"),
      entry("Y", "B"),
      entry("Z", "A")
  );

  public String solution(@NonNull final String words) {
    return words.chars()
        .mapToObj(w -> {
          final var word = Character.toString(w);
          return Character.isUpperCase(w)
              ? DICTIONARY.getOrDefault(word, word)
              : DICTIONARY.getOrDefault(word.toUpperCase(), word).toLowerCase();
        })
        .collect(Collectors.joining());
  }

  public static void main(String[] args) {
    final var generator = new OppositeWordsGenerator();
    System.out.println(generator.solution("I love you"));
  }
}
