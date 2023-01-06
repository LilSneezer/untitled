package ru.pflb;

public abstract class Person {
    protected String age;
    protected String name;

    public Person(String age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "ФИО - " + name + "\n" + "Возраст - " + age;
    }
}
