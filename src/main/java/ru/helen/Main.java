package ru.helen;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println("Поиск по имени, фамилии, городу и возрасту");
        DatabaseController dataBaseController = new DatabaseController();
        Application.startApp(dataBaseController);
    }
}
