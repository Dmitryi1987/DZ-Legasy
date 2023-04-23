package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TasksTest {
    @Test
    public void MatchesSimpleTaskTrue() {
        SimpleTask simpleTask = new SimpleTask(5, "Позвонить родителям");
        boolean expected = true;
        boolean actual = simpleTask.matches("Позвонить родителям");
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void MatchesSimpleTaskFalse() {
        SimpleTask simpleTask = new SimpleTask(5, "Позвонить родителям");
        boolean expected = false;
        boolean actual = simpleTask.matches("Не звонить");
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void MatchesEpicTrue() {

        Epic epic = new Epic(5, new String[]{"Молоко", "Яйца", "Хлеб"});
        boolean expected = true;
        boolean actual = epic.matches("Хлеб");
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void MathesEpicFalse() {
        Epic epic = new Epic(5, new String[]{"Молоко", "Яйца", "Хлеб"});
        boolean expected = false;
        boolean actual = epic.matches("Капуста");
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void MeetingTrue() {
        Meeting meeting = new Meeting(
                555,
                "Выкатка 3й версии приложения",
                "Приложение НетоБанка",
                "Во вторник после обеда");
        boolean expected = true;
        boolean actual = meeting.matches("Выкатка 3й версии приложения");
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void MeetingTrue2() {
        Meeting meeting = new Meeting(
                555,
                "Выкатка 3й версии приложения",
                "Приложение НетоБанка",
                "Во вторник после обеда");
        boolean expected = true;
        boolean actual = meeting.matches("Приложение НетоБанка");
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void MeetingFalse() {
        Meeting meeting = new Meeting(
                555,
                "Выкатка 3й версии приложения",
                "Приложение НетоБанка",
                "Во вторник после обеда");
        boolean expected = false;
        boolean actual = meeting.matches("Во вторник после обеда");
        Assertions.assertEquals(expected, actual);
    }

}