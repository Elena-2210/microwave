package ru.helen;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Application {
    /**
     * Запускает сервис, с помощью которого можно что-то поискать в базе.
     * @param dataBaseController - система управления базой данных.
     * @throws IOException
     */
    public static void startApp(DatabaseController dataBaseController) throws IOException {
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

//TODO Вывод подсказки пользователю по команде -help или --help.
