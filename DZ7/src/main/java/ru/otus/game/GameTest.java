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
    public void testPlayGameFirstPlayer() {
        Dice dice = new Dice() {
            int counter = 0;
            @Override
            public int roll() {
                counter++;
                if (counter == 1)
                {return 6;}
                else
                {return 1;}
            }
        };
        GameWinnerPrinter winnerPrinter = new GameWinnerPrinter() {
            @Override
            public void printWinner(Player winner) {
                winner.name = "Вася"; //  winner. this.name = "Вася";
                System.out.printf("Победитель: %s%n", winner.getName());
            }
        };
        Game game = new Game(dice, winnerPrinter);
        System.out.println("Проверка 4. Если у первого больше, то должно печататься имя Вася");
        game.playGame(new Player("Вася"), new Player("Игорь"));
    }

    @Test
    public void testPlayGameSecondPlayer() {
        Dice dice = new Dice() {
            int counter = 0;
            @Override
            public int roll() {
                counter++;
                if (counter == 1)
                {return 1;}
                else
                {return 6;}
            }
        };
        GameWinnerPrinter winnerPrinter = new GameWinnerPrinter() {
            @Override
            public void printWinner(Player winner) {
                winner.name = "Игорь"; //  winner. this.name = "Вася";
                System.out.printf("Победитель: %s%n", winner.getName());
            }
        };
        Game game = new Game(dice, winnerPrinter);
        System.out.println("Проверка 5. Если у второго больше, то должно печататься имя Игорь");
        game.playGame(new Player("Вася"), new Player("Игорь"));
    }

    @Test
    public void testPlayGameDrawn() {
        Dice dice = new Dice() {
            int counter = 0;
            @Override
            public int roll() {
                {return 1;}
            }
        };
        GameWinnerPrinter winnerPrinter = new GameWinnerPrinter() {
            @Override
            public void printWinner(Player winner) {
                winner.name = "Ничья"; //  winner. this.name = "Вася";
                System.out.printf("Победитель: %s%n", winner.getName());
            }
        };
        Game game = new Game(dice, winnerPrinter);
        System.out.println("Проверка 6. Если количество очков одинаково, то должно печататься Ничья");
        game.playGame(new Player("Вася"), new Player("Игорь"));
    }

    }
