package ru.elena.volleyballgame;

import lombok.Getter;
import lombok.Setter;

/**
 * Класс отвечает за логику игры в волейбол
 */
@Setter
@Getter
public class VolleyballGame {
    private Team team1;
    private Team team2;
    private Team winner;
    private Team loser;

    /**
     * Метод формирует этапы игры
     */
    public static void volleyballTournament() {
        VolleyballGame volleyballGame = new VolleyballGame();
        volleyballGame.prepareTeams();
        volleyballGame.announceGame();
        volleyballGame.startGame();
        volleyballGame.determineWinnerAndLoser();
        volleyballGame.announceResults();
        volleyballGame.getFive();
    }

    public Integer getFive() {
        return 5;
    }

    /**
     * Выводит итог игры
     */
    public void announceResults() {
        System.out.println(winner.getTeamName() + " победили со счетом " + winner.getScoreCount() + " : " + loser.getScoreCount());
    }

    /**
     * Ведется счет игры пока игра не закончится
     */
    public void startGame() {
        while (!isGameFinished(team1, team2)) {
            this.increaseScore(whichTeamWinsScore(team1, team2));
            this.printCurrentScore();
        }
    }

    /**
     * определяет команды победителя и проигравшего
     */
    public void determineWinnerAndLoser() {
        if (isGameFinished(team1, team2)) {
            winner = team1.getScoreCount() < team2.getScoreCount() ? team2 : team1;
            loser = team1.getScoreCount() > team2.getScoreCount() ? team2 : team1;
        }
    }

    /**
     * Вывод текущего счета игры
     */
    public void printCurrentScore() {
        System.out.println(team1.getTeamName() + " " + team1.getScoreCount() + " : " + team2.getScoreCount() + " " + team2.getTeamName());
    }

    /**
     * @param team1 команда 1
     * @param team2 команда 2
     * @return команду, которая выиграла очко
     */
    public Team whichTeamWinsScore(Team team1, Team team2) {
        // random
        if (Math.random() < 0.5) return team1;
        else return team2;
    }

    /**
     * Ведет счет конкретной команды
     *
     * @param team команда
     */
    public void increaseScore(Team team) {
        team.setScoreCount(team.getScoreCount() + 1);

    }

    /**
     * @param team1 команда 1
     * @param team2 команда 2
     * @return true - если игра завершилась, false - если игра продолжается
     */
    public boolean isGameFinished(Team team1, Team team2) {
        return (team1.getScoreCount() >= 25 || team2.getScoreCount() >= 25) && getDifference() >= 2;
    }

    /**
     * @return разницу очков
     */
    private int getDifference() {
        return Math.abs(team1.getScoreCount() - team2.getScoreCount());
    }

    /**
     * создаем команды
     */
    public void prepareTeams() {
        this.team1 = new Team();
        this.team2 = new Team();
    }

    /**
     * анонс игры
     */
    public void announceGame() {
        System.out.println("Волейбол!");
        System.out.println("Встречаются команды: " + team1.getTeamName() + " и " + team2.getTeamName());
        System.out.println("Игра началсь!");

    }


}
