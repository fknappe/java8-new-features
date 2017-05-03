package br.com.github.java8.streams;


import br.com.github.java8.pojo.Person;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;

public class SumAndAverage {

    public static void main(String[] args) {

        List<Person> people = Arrays.asList(
                new Person("John Doe", 48),
                new Person("Jane Doe",  35),
                new Person("Peter Doe", 76)
        );

        int sum = people.stream().mapToInt(Person::getAge).sum();

        System.out.println(String.format("People age sum: %d", sum));

        OptionalDouble avg = people.stream().mapToInt(Person::getAge).average();

        if(avg.isPresent()) {
            System.out.println(String.format("Average: %f", avg.getAsDouble()));
        } else {
            System.out.println("Average not calculated");
        }
    }
}
