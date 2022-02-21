package com.example.microwave;

import com.example.microwave.abstractions.MicrowaveAbstractTimer;
import lombok.Data;
import lombok.EqualsAndHashCode;

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

    }

    @Override
    public void addTenSeconds() {

    }

    @Override
    public void setStateToZero() {

    }
}
