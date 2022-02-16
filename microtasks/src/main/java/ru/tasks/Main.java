package ru.tasks;

import lombok.Data;
import lombok.SneakyThrows;

import java.io.*;

public class Main {

    @SneakyThrows
    public static void main(String[] args) {
        Human human = new Human();

        File file = new File("D:\\src\\libs\\serialized.txt");
//        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(file));
//        objectOutputStream.writeObject(human);
//        objectOutputStream.close();

        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(file));
        Object obj = objectInputStream.readObject();
        Human human1 = (Human) obj;
        System.out.println("human1 = " + human1);
    }

    public static class Human implements Serializable {
        private static final long serialVersionUID = 5794137664009076799L;

//        @JsonProperty("personName")
        String name;

//        @JsonProperty("age")
        int age;
    }
}
