package com.example.microwave;

import com.example.microwave.abstractions.MicrowaveAbstractContainer;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class MicrowaveContainerImpl extends MicrowaveAbstractContainer {

    @Override
    public boolean isDoorOpened() {
        return false;
    }

    @Override
    public boolean isDoorClosed() {
        return false;
    }

    @Override
    public void closeDoor() {
    }

    @Override
    public void openDoor() {
    }

    @Override
    public void setDefaultState() {
    }

    @Override
    public void putChicken() {
    }

    @Override
    public boolean isChickenInside() {
        return false;
    }

    @Override
    public void extractChicken() {

    }

    @Override
    public boolean isChickenWellDone() {
        return false;
    }

    @Override
    public boolean isChickenFired() {
        return false;
    }
}
