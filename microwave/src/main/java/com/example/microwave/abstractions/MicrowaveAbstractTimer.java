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

    public abstract Integer getMinutes();
    public abstract Integer getSeconds();

}
