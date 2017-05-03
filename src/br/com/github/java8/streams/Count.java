package br.com.github.java8.streams;

import java.util.ArrayList;
import java.util.List;

public class Count {

    public static void main(String[] args) {
        System.out.println("Creating a list");
        List<String> strings = new ArrayList<>();

        for (int i = 0; i < 1_000_000; i++) {
            strings.add(String.format("Item %d", i));
        }

        final long count = strings.parallelStream().count();
        System.out.println(String.format("Strings count: %d", count));
    }
}
