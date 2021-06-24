package ru.helen;

import lombok.*;

/**
 * Дата-класс, описывающий модель человека.
 */

@Data
public class Human {
    private String name;
    private String lastName;
    private int age;
    private String city;

    public Human() {
    }

    public Human(String name, String lastName, int age, String city) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.city = city;
    }


}

