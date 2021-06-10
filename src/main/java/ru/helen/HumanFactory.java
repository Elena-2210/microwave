package ru.helen;

import com.github.javafaker.Faker;

import java.util.ArrayList;

public class HumanFactory {
    /**
     * Метод создает человека и заполняет его рандомными данными.
     */
    public static Human createHuman() {
        Faker faker = new Faker();

        String name = faker.name().firstName();
        String lastname = faker.name().lastName();
        int age = faker.number().numberBetween(1, 100);
        String city = faker.address().cityName();

        Human human = new Human();

        human.setName(name);
        human.setLastName(lastname);
        human.setAge(age);
        human.setCity(city);

        return human;
    }

    /**
     * Метод генерирует и возвращает список из 100 человек.
     */
    public static ArrayList<Human> create100Humans() {
        ArrayList<Human> list = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            list.add(createHuman());
        }
        return list;
    }
}
