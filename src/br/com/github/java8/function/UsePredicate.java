package br.com.github.java8.function;


import br.com.github.java8.pojo.Person;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class UsePredicate {

    public static void main(String[] args) {

        List<Person> people = Arrays.asList(
                new Person("John Doe", 48),
                new Person("Jane Doe",  35),
                new Person("Peter Doe", 76)
        );

        /*Predicate<Person> predicate = new Predicate<Person>() {
            @Override
            public boolean test(Person person) {
                return person.getAge() > 65;
            }
        };*/

        Predicate<Person> predOlder = (person -> person.getAge() >= 65);
        Predicate<Person> predYounger = (person -> person.getAge() <= 65);

        /*for(Person p : people) {
            if(predicate.test(p)) {
                System.out.println(p);
            }
        }*/

        System.out.println(">>>> Older People");
        displayPeople(people, predOlder);

        System.out.println(">>>> Younger People");
        displayPeople(people, predYounger);
    }

    private static void displayPeople(List<Person> people,
                                      Predicate<Person> predicate) {
        /*people.forEach(p -> {
            if (predicate.test(p)) {
                System.out.println(p.getPersonInfo());
            }
        });*/

        people.stream()
                .filter(predicate)
                .forEach(person -> System.out.println(person.getPersonInfo()));
    }
}
