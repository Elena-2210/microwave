package com.example.microwave.abstractions;

import lombok.Data;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;

@Data
public abstract class MicrowaveAbstractTimer {
    Calendar state = GregorianCalendar.getInstance(Locale.forLanguageTag("ru"));

    /**
     * Обнуление таймера
     */
    public abstract void setStateToZero();

    /**
     * @return Количество минут на таймере
     */
    public abstract Integer getMinutes();

    /**
     * @return Количество секунд на таймере
     */
    public abstract Integer getSeconds();

    /**
     * Начать обратный отсчет
     */
    public abstract void startTimer();

    /**
     * Добавить к таймеру 1 минуту
     */
    public abstract void addOneMinute();

    /**
     * Добавить к таймеру 10 секунд
     */
    public abstract void addTenSeconds();
}
