package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GameTest {

    @Test
    public void whenFirstPlayerStronger() {
        Game game = new Game();
        Player ivan = new Player(1, "Иван", 95);
        Player dmitry = new Player(2, "Дмитрий", 120);

        game.register(ivan);
        game.register(dmitry);
        int actual = game.round("Дмитрий", "Иван");
        int expected = 1;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void whenSecondPlayerStronger() {
        Game game = new Game();
        Player ivan = new Player(1, "Иван", 100);
        Player dmitry = new Player(2, "Дмитрий", 92);

        game.register(ivan);
        game.register(dmitry);
        int actual = game.round("Дмитрий", "Иван");
        int expected = 2;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void whenDraw() {
        Game game = new Game();
        Player ivan = new Player(1, "Иван", 100);
        Player dmitry = new Player(2, "Дмитрий", 100);

        game.register(ivan);
        game.register(dmitry);
        int actual = game.round("Дмитрий", "Иван");
        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }
}
