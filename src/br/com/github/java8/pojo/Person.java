package br.com.github.java8.pojo;

public class Person {

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

    @Override
    public String toString() {
        return String.format("%s (%d)", getName(), getAge());
    }

    public static int compareAges(Person p1, Person p2)
    {
        return p1.getAge().compareTo(p2.getAge());
    }
}
