package ru.helen;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println("Поиск по имени, фамилии, городу и возрасту");
        DatabaseController dataBaseController = new DatabaseController();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            System.out.println("\nВведите запрос...");
            String query = bufferedReader.readLine();
            if (query.equalsIgnoreCase("exit")) {
                break;
            } else {
                dataBaseController.search(query);
            }
        }
    }
}
