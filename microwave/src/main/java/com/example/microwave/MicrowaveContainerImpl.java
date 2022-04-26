package com.example.microwave;

import com.example.microwave.abstractions.MicrowaveAbstractContainer;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class MicrowaveContainerImpl extends MicrowaveAbstractContainer {

    @Override
    public boolean isDoorClosed() {
        return getContainerState().equals(ContainerState.CLOSED);
    }

    @Override
    public void closeDoor() {
        setContainerState(ContainerState.CLOSED);
    }

    @Override
    public void openDoor() {
        setContainerState(ContainerState.OPENED);
    }

    @Override
    public void setDefaultState() {
        closeDoor();
    }

    @Override
    public void putChicken() {
        if (!isChickenInside()) {
            setChickenState(ChickenState.FRESH);
        }

    }

    @Override
    public boolean isChickenInside() {
        return !getChickenState().equals(ChickenState.ABSENT);
    }

    @Override
    public void extractChicken() {
        if (getContainerState().equals(ContainerState.OPENED)) {
            setChickenState(ChickenState.ABSENT);
        }
    }

    @Override
    public boolean isChickenWellDone() {
        openDoor();
        return getChickenState().equals(ChickenState.WELL_DONE);

    }

    @Override
    public boolean isChickenFired() {
        openDoor();
        return getChickenState().equals(ChickenState.FIRED);
    }
}
