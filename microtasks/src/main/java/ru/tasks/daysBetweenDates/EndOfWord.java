package ru.tasks.daysBetweenDates;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class EndOfWord {

    public static void main(String[] args) throws IOException, ParseException {
        // TODO при запуске просить пользователя ввести 2 даты. При ошибке ввода обрабатывать эксепшны:
        //  говорить что дата введена некорректно и просить ввести заново.
        //  Причем если пользователь уже корректно ввел первую дату то запрашивать у него на ввода только вторую дату.
        //  После вывода количества дней между датами начинать программу сначала.
        SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy");
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        Date date1 = sdf.parse(bufferedReader.readLine());
        Date date2 = sdf.parse(bufferedReader.readLine());

        //CALCULATE DIFFERENCE IN DAYS
        long diff = date1.getTime() - date2.getTime();
        long diffDays = TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);
        diffDays = Math.abs(diffDays);
        System.out.println(diffDays + pickPhrase((int) diffDays, "дней", "день", "дня"));
    }

    public static String pickPhrase(int count, String word0, String word1, String word2) {
        int rem = count % 100;
        if (rem < 11 || rem > 14) {
            rem = count % 10;
            if (rem == 1) {
                return word1;
            }
            if (rem >= 2 && rem <= 4) {
                return word2;
            }
        }
        return word0;
    }

}
