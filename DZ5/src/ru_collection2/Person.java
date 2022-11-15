package ru_collection2;

import java.util.Objects;

public class Person {
    protected String fio;
    protected int age;

    public Person(String fio, int age) {
        this.fio = fio;
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age && fio.equals(person.fio);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fio, age);
    }
}