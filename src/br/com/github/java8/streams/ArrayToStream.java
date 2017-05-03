package br.com.github.java8.streams;


import br.com.github.java8.pojo.Person;

import java.util.Arrays;
import java.util.stream.Stream;

public class ArrayToStream {

    public static void main(String[] args) {

        Person[] people = {
            new Person("Joe Doe", 48),
            new Person("Mary Doe", 35),
            new Person("Peter Doe", 78)
        };

        /*for (int i = 0; i < people.length; i++) {
            System.out.println(people[i].getPersonInfo());
        }*/

        //Stream<Person> stream = Stream.of(people);
        Stream<Person> stream = Arrays.stream(people);
        stream.forEach(person -> System.out.println(person.getPersonInfo()));
    }
}
