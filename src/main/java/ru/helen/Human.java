package ru.helen;

/**
 * Дата-класс, описывающий модель человека.
 */
public class Human {
    private String name;
    private String lastName;
    private int age;
    private String city;

    public Human() {
    }

    public Human(String name, String lastName, int age, String city) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.city = city;
    }

    @Override
    public String toString() {
        String data = this.name + " " + this.lastName + ", " +
                this.age + ", " + this.city;
        return data;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }


}

