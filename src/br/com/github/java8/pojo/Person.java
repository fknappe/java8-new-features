package br.com.github.java8.pojo;

import br.com.github.java8.methodreference.interfaces.PersonInterface;

public class Person implements PersonInterface {

    private String name;

    private Integer age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }
}
