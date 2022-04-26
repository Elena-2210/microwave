package com.example.microwave.abstractions;

import lombok.Data;

@Data
public abstract class MicrowaveAbstractContainer {

    /**
     * Степень готовности курицы
     */
    private ChickenState chickenState = ChickenState.ABSENT;

    /**
     * Состояние контейнера. Открыта или закрыта дверца
     */
    private ContainerState containerState = ContainerState.CLOSED;

    /**
     * @return false = дверь открыта, true = дверь закрыта
     */
    public abstract boolean isDoorClosed();

    /**
     * Закрыть дверь микроволновки
     */
    public abstract void closeDoor();

    /**
     * Открыть дверь микроволновки
     */
    public abstract void openDoor();


    /**
     * Установить состояние по умолчанию. Микроволновка закрыта, внутри пусто
     */
    public abstract void setDefaultState();

    /**
     * Положить курицу внутрь контейнера
     */
    public abstract void putChicken();

    /**
     * @return Узнать внутри ли курица
     */
    public abstract boolean isChickenInside();

    /**
     * Извлечь курицу
     */
    public abstract void extractChicken();

    /**
     * Проверить хорошо ли курица приготовлена
     * @return true = курица в состоянии хорошей прожарки, false = курица отсутствует в микроволновке, еще не готова или уже сгорела
     */
    public abstract boolean isChickenWellDone();

    /**
     * Проверить сгореал ли курица на работе
     * @return true = курица сгорела на работе, false = курица отсутствует в микроводлновке, еще не готова или хорошо прожарена
     */
    public abstract boolean isChickenFired();

    /**
     * Возможные состояния курицы:
     * 1. Отсутствует в микроволновке.
     * 2. В микроволновке, но не приготовлена.
     * 3. Приготовлена хорошо.
     * 4. Сгорела
     */
    public enum ChickenState {
        ABSENT, FRESH, WELL_DONE, FIRED,
    }

    /**
     * Возможные состояния контейнера:
     * 1. Открыт
     * 2. Закрыт
     */
    public enum ContainerState {
        OPENED, CLOSED
    }
}
