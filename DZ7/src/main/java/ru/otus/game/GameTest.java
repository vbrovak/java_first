package ru.otus.game;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import ru.otus.game.Game;

import static org.junit.Assert.*;

public class GameTest {
    private static String IGOR = "Игорь";
    private static String VASYA = "Вася";

    @Test
    public void testPlayGameFirstPlayer() {
        Dice dice = new Dice() {
            int counter = 0;

            @Override
            public int roll() {
                counter++;
                if (counter == 1) {
                    return 6;
                } else {
                    return 1;
                }
            }
        };
        GameWinnerPrinter winnerPrinter = new GameWinnerPrinter() {
            @Override
            public void printWinner(Player winner) {
                String x = winner.getName();
                if (x.equals(VASYA)) {
                    System.out.printf("Победитель: %s%n", VASYA);
                } else {
                    System.err.println("Ошибка ! Имя победителя не " + VASYA + " " + x);
                }
            }
        };
        Game game = new Game(dice, winnerPrinter);
        System.out.println("Проверка 4. Если у первого больше, то должно печататься имя " + VASYA);
        game.playGame(new Player(VASYA), new Player(IGOR));
    }

    @Test
    public void testPlayGameSecondPlayer() {
        Dice dice = new Dice() {
            int counter = 0;

            @Override
            public int roll() {
                counter++;
                if (counter == 1) {
                    return 1;
                } else {
                    return 6;
                }
            }
        };
        GameWinnerPrinter winnerPrinter = new GameWinnerPrinter() {
            @Override
            public void printWinner(Player winner) {
                String x = winner.getName();
                if (IGOR.equals(x)) {
                    System.out.printf("Победитель: %s%n", x);
                } else {
                    System.err.println("Ошибка ! Имя победителя не " + IGOR + " " + x);
                }
            }
        };
        Game game = new Game(dice, winnerPrinter);
        System.out.println("Проверка 5. Если у второго больше, то должно печататься имя " + IGOR);
        game.playGame(new Player(VASYA), new Player(IGOR));
    }

    @Test
    public void testPlayGameDrawn() {
        Dice dice = new Dice() {
            @Override
            public int roll() {
                {
                    return 1;
                }
            }
        };
        GameWinnerPrinter winnerPrinter = new GameWinnerPrinter() {
            @Override
            public void printWinner(Player winner) {
                String x = winner.getName();
                if (IGOR.equals(x) || VASYA.equals(x)) {
                    System.err.printf("Ошибочное сообщение (должно быть : 'Ничья') - Победитель: %s%n", x);
                } else {
                    System.out.println("Ничья");
                }
            }
        };
        Game game = new Game(dice, winnerPrinter);
        System.out.println("Проверка 6. Если количество очков одинаково, то должно печататься Ничья");
        game.playGame(new Player(VASYA), new Player(IGOR));
    }

}
