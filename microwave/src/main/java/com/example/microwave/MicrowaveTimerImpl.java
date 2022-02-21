package com.example.microwave;

import com.example.microwave.abstractions.MicrowaveAbstractTimer;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.Calendar;

@Data
@EqualsAndHashCode(callSuper = true)
public class MicrowaveTimerImpl extends MicrowaveAbstractTimer {

    @Override
    public Integer getMinutes() {
        return null;
    }

    @Override
    public Integer getSeconds() {
        return null;
    }

    @Override
    public void startTimer() {

    }

    @Override
    public void addOneMinute() {
        getState().roll(Calendar.MINUTE, 1);
    }

    @Override
    public void addTenSeconds() {
        getState().roll(Calendar.SECOND, 10);
    }

    @Override
    public void setStateToZero() {

    }
}
