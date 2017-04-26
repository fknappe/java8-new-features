package br.com.github.java8.methodreference;

import br.com.github.java8.methodreference.interfaces.PersonInterface;
import br.com.github.java8.pojo.Person;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class UseStaticReference {

    public static void main(String[] args) {

        List<Person> people = Arrays.asList(
                new Person("John Doe", 48),
                new Person("Jane Doe",  35),
                new Person("Peter Doe", 76)
        );

        Collections.sort(people, PersonInterface::compareAges);
        people.forEach(person -> System.out.println(person.getPersonInfo()));
    }
}
