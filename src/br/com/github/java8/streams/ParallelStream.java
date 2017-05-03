package br.com.github.java8.streams;

import java.util.ArrayList;
import java.util.List;

public class ParallelStream {

    public static void main(String[] args) {
        System.out.println("Creating a list");
        List<String> strings = new ArrayList<>();

        for (int i = 0; i < 10000; i++) {
            strings.add(String.format("Item %d", i));
        }

        strings.parallelStream()
                .forEach(System.out::println);

        strings.stream()
                .parallel()
                .forEach(System.out::println);
    }
}
