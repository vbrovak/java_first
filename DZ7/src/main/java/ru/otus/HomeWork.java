package ru.otus;


import ru.otus.game.Dice;
import ru.otus.game.DiceImpl;

import ru.otus.game.DiceImplTest;
import ru.otus.game.GameTest;


public class HomeWork {
    /*
        Заготовка для ДЗ представляет собой игру в кости.
        При вызове game.playGame(), два игрока кидают кости.
        Выигрывает игрок, у кого результат (1-6) больше

        Написать тесты (минимум 4) на классы DiceImpl и Game.
        Тесты должны найти не менее двух ошибок.

        Информацию о пройденном тесте предлагается выводить в System.out, а об упавшем в System.err
     */
    public static void main(String[] args) {
        DiceImplTest diceImp = new DiceImplTest();
        //одиночная проверка
        diceImp.testRoll();
        //массовая проверка
        diceImp.testRollMass();
        //
        GameTest GameTest = new GameTest();
        GameTest.testPlayGameFirstPlayer();
        GameTest.testPlayGameSecondPlayer();
        GameTest.testPlayGameDrawn();

    }
    
}