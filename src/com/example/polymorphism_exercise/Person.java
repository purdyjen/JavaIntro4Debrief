package com.example.polymorphism_exercise;

public class Person {
    String name;
    int health;
    public Person(String personName) {
        name = personName;
        health = 100;
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int level) {
        this.health = level;
    }
}
