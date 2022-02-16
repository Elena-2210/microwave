package ru.tasks.robots;

import lombok.Data;

@Data
public class Robot {
    Robot fred = new Robot("Fred", "ROS");
    Robot tod = new Robot("Tod", "ROS");
    private String name;
    private String operationSystem;
    private int power;


    public Robot(String name, String operationSystem) {
        this.name = name;
        this.operationSystem = operationSystem;
    }

    public static void fightResult(int fredPower, int todPower) {
        if(todPower > fredPower) {
            System.out.println("Тод победил, мощщщщщь");
        }
        else if(todPower < fredPower) {
            System.out.println("Фред победил, силааа");
        } else {
            System.out.println("Победила дружба!");
        }

    }

    public static void main(String[] args) {
        fightResult(140, 140);

    }
    // TODO переименовать по смыслу: не как работает, а что делает. ГОТОВО
    //TODO доработать так что бы победа звисела от силы.
    // Один робот обязательно должен победить а второй проиграть.


}
