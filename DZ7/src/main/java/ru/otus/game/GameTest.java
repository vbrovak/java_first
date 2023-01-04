package ru.otus.game;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import ru.otus.game.Game;
import static org.junit.Assert.*;

public class GameTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void playGame() {
        Dice dice = new DiceImpl();
        GameWinnerPrinter winnerPrinter = new GameWinnerConsolePrinter();
        Game game = new Game(dice, winnerPrinter);
        game.playGame(new Player("Вася"), new Player("Игорь"));
    }
}