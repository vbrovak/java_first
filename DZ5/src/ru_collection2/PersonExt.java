package ru_collection2;

import java.util.Objects;

public class PersonExt {
    protected String fio;
    protected int age;
    protected String myAccList;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PersonExt personExt = (PersonExt) o;
        return age == personExt.age && Objects.equals(fio, personExt.fio) && Objects.equals(myAccList, personExt.myAccList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fio, age, myAccList);
    }

    public PersonExt(String fio, int age, String myAccList) {
        this.fio = fio;
        this.age = age;
        this.myAccList = myAccList;
    }
}
