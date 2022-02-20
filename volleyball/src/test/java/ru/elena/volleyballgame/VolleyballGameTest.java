package ru.elena.volleyballgame;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import static org.junit.jupiter.api.Assertions.*;

class VolleyballGameTest {

    @ParameterizedTest
    @CsvSource({
            "20, 20, false",
            "0, 25, true",
            "25, 25, false",
            "26, 25, false",
            "25, 26, false",
            "46, 48, true"
    })
    void isGameFinished_trueTest(int team1Score, int team2Score, boolean exptectedResult) {
        VolleyballGame volleyballGame = new VolleyballGame();
        Team team1 = new Team();
        Team team2 = new Team();
        volleyballGame.setTeam1(team1);
        volleyballGame.setTeam2(team2);
        team1.setScoreCount(team1Score);
        team2.setScoreCount(team2Score);
        boolean isGameFinishedActual = volleyballGame.isGameFinished(team1, team2);
        boolean isGameFinishedExpected = exptectedResult;

        Assertions.assertEquals(isGameFinishedExpected, isGameFinishedActual);
    }

    @Test
    void getFiveTest() {
        VolleyballGame volleyballGame = new VolleyballGame();
        Integer actual = volleyballGame.getFive();
        Integer expected = 5;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void getDifference() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        VolleyballGame volleyballGame = new VolleyballGame();

        Method getDifferenceMethod = VolleyballGame.class.getDeclaredMethod("getDifference", null);
        getDifferenceMethod.setAccessible(true);
        Object methodResult = getDifferenceMethod.invoke(volleyballGame);
        int actualResult = (int) methodResult;
        int expectedResult = 3;
        Assertions.assertEquals(expectedResult, actualResult);
    }
}