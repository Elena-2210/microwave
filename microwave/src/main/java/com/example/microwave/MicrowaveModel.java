package com.example.microwave;

import com.example.microwave.abstractions.MicrowaveAbstractContainer;
import com.example.microwave.abstractions.MicrowaveAbstractTimer;
import lombok.Data;

@Data
public class MicrowaveModel {

    private MicrowaveAbstractTimer timer = new MicrowaveTimerImpl();
    private MicrowaveAbstractContainer container = new MicrowaveContainerImpl();


    /**
     * Изначальное состояние микроволновки
     */
    public void setDefaultState() {
        timer.setStateToZero();
        container.setDefaultState();
    }
}
