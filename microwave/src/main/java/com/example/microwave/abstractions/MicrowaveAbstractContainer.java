package com.example.microwave.abstractions;

public abstract class MicrowaveAbstractContainer {
    public ChickenState chickenState = ChickenState.ABSENT;
    public ContainerState containerState = ContainerState.CLOSED;


    public abstract boolean isDoorOpened();

    public abstract boolean isDoorClosed();

    /**
     * Закрыть дверь микроволновки
     */
    public abstract void closeDoor();

    /**
     * Открыть дверь микроволновки
     */
    public abstract void openDoor();

    public abstract void cookChicken();

    /**
     * Микроволновка закрыта, внутри пусто
     */
    public abstract void setDefaultState();

    public abstract void putChicken();

    public abstract boolean isChickenInside();

    /**
     * Извлечь курицу
     */
    public abstract void extractChicken();

    public abstract boolean isChickenWellDone();

    public abstract boolean isChickenFired();

    public enum ChickenState {
        ABSENT, FRESH, COOKED
    }

    public enum ContainerState {
        OPENED, CLOSED
    }
}
