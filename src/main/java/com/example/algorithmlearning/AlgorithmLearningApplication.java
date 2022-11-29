package com.example.algorithmlearning;

import java.util.stream.IntStream;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AlgorithmLearningApplication {

	public static void main(String[] args) {
		final var total = IntStream.rangeClosed(1, 10).sum();
		System.out.println(total);
	}

}
