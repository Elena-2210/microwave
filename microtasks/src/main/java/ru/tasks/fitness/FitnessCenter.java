package ru.tasks.fitness;

import lombok.Data;

@Data
public class FitnessCenter {

    private int size;
    private int capacity;

    public FitnessCenter(int size, int capacity) {

        this.size = size;
        this.capacity = capacity;
    }

    public static void main(String[] args) {
        FitnessCenter f = new FitnessCenter(50, 15);
        Human lena = new Human(14, "Lena");
        Human valera = new Human(19, "Valera");
        lena.pass();
        valera.pass();
    }

    @Data
    public static class Human {
        private int age;
        private String name;

        public Human(int age, String name) {
            this.age = age;
            this.name = name;

        }

        public void pass() {
            if (getAge() >= 16) {
                System.out.println(getName() + ", вы можете проходить в зал, хорошей тренировки.");
            } else {
                System.out.println(getName() + ", вход разрешен с 16 лет.");
            }
        }
    }
}
