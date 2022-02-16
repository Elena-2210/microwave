package ru.elena.volleyballgame;

import com.github.javafaker.Faker;
import lombok.Getter;
import lombok.Setter;

/**
 * класс, описывающий характеристики и поведение команд
 */
@Getter
@Setter
public class Team {

    private String teamName;
    private int scoreCount = 0;

    /**
     * присваивает имя команде при ее создании
     */
    public Team() {
        teamName = createTeamName();
    }

    /**
     *
     * @return случайное имя команды на основе названия города
     */
    private  String createTeamName() {
        return new Faker().address().cityName();
    }

}
