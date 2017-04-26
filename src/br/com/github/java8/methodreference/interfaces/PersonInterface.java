package br.com.github.java8.methodreference.interfaces;

import br.com.github.java8.pojo.Person;

public interface PersonInterface {

    String getName();
    Integer getAge();

    default String getPersonInfo()
    {
        return String.format("%s (%d)", getName(), getAge());
    }

    static int compareAges(Person p1, Person p2)
    {
        return p1.getAge().compareTo(p2.getAge());
    }
}
