package ru.helen;

import java.util.ArrayList;

public class DatabaseController {
    private ArrayList<Human> base;

    public DatabaseController() {
        System.out.println("Загрузка базы данных. Ожидайте...");
        base = HumanFactory.create100Humans();
        base.add(new Human("Karl", "Sagan", 47, "FloridaCity"));
        base.add(new Human("Karl", "Engels", 50, "NY"));

        this.printBase();
    }

    public void printBase() {
        for (Human human : base) {
            System.out.println(human);
        }
    }

    public ArrayList<Human> getBase() {
        return base;
    }

    public void setBase(ArrayList<Human> base) {
        this.base = base;
    }

    public void search(String query) {
        if (query.equalsIgnoreCase("all")) {
            printBase();
        } else {
            ArrayList<Human> results = new ArrayList<>();
            for (Human person : base) {
                if (person.getName().equals(query) || person.getLastName().equals(query) || person.getCity().equals(query) || String.valueOf(person.getAge()).equals(query)) {
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
