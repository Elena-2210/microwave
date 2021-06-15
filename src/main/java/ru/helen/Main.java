package ru.helen;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        ArrayList<Human> base = HumanFactory.create100Humans();
        base.add(new Human("Karl", "Sagan", 47, "FloridaCity"));
        base.add(new Human("Karl", "Engels", 50, "NY"));

        for (Human human : base) {
            System.out.println(human);
        }

        System.out.println("Поиск по имени, фамилии, городу...");


        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        // TODO разделить логику на управляющую (в класс контроллер) и бизнес-логику (в класс Searcher)
        while (true) {
            System.out.println("\nВведите запрос...");
            String query = bufferedReader.readLine();
            if (query.equalsIgnoreCase("exit")) {
                break;
            } else if (query.equalsIgnoreCase("all")) {
                System.out.println(base);
            } else {
                ArrayList<Human> results = new ArrayList<>();
                for (Human person : base) {
                    if (person.getName().equals(query) || person.getLastName().equals(query) || person.getCity().equals(query)) {
                        results.add(person);
                    }
                }

                if (results.isEmpty()) {
                    System.out.println("Нет результатов.");
                } else {
                    System.out.println(results);
                }
            }
        }
    }
}
