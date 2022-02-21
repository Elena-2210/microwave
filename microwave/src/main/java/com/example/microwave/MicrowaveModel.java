package com.example.microwave;

import com.example.microwave.abstractions.MicrowaveAbstractContainer;
import com.example.microwave.abstractions.MicrowaveAbstractTimer;
import lombok.Data;
import lombok.Getter;

@Getter
public class MicrowaveModel {

    private final MicrowaveAbstractTimer timer = new MicrowaveTimerImpl();
    private final MicrowaveAbstractContainer container = new MicrowaveContainerImpl();


    /**
     * Изначальное состояние микроволновки
     */
    public void setDefaultState() {
        timer.setStateToZero();
        container.setDefaultState();
    }
}
