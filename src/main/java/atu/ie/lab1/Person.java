package atu.ie.lab1;

public class Person {
    private String name;
    private int age;

    // Default constructor (important for JSON serialization/deserialization)
    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getters
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    // Setters (needed for Spring to map JSON -> Object if you accept Person in requests)
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

