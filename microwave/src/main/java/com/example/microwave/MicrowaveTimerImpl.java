package com.example.microwave;

import com.example.microwave.abstractions.MicrowaveAbstractTimer;
import lombok.Data;

import java.util.Calendar;

@Data
public class MicrowaveTimerImpl extends MicrowaveAbstractTimer {

    @Override
    public Integer getMinutes() {
        return getState().get(Calendar.MINUTE);
    }

    @Override
    public Integer getSeconds() {
        return getState().get(Calendar.SECOND);
    }

    @Override
    public void setStateToZero() {

    }
}
