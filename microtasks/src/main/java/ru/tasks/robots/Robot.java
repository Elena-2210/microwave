package ru.tasks.robots;

import lombok.Data;

import java.util.ArrayList;

@Data
public class Robot {

    private String name;
    private String operationSystem;
    private int power;

    public Robot(String name, String operationSystem, int power) {
        this.name = name;
        this.operationSystem = operationSystem;
        this.power = power;
    }

    public static void main(String[] args) {
        //TODO доработать так что бы победа звисела от силы.
        // Один робот обязательно должен победить а второй проиграть.
        Robot fred = new Robot("Fred", "ROS", 140);
        Robot tod = new Robot("Tod", "ROS", 110);
        fred.powerControl();
        tod.powerControl();

        ArrayList<Object> objects = new ArrayList<>();
        objects
                .stream()
                .filter(o -> o.toString().equals("jdskfhjs"));
    }

    // TODO переименовать по смыслу: не как работает, а что делает.
    public void powerControl() {
        if (getPower() >= 110) {
            System.out.println("Я сильный робот " + getName() + ", я тебя побью!");
        } else {
            System.out.println(getName() + " слишком слаб:(, пожалуйста, пощади!");
        }
    }

}
