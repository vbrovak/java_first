package ru.otus.game;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import ru.otus.game.DiceImpl;

import static org.junit.Assert.*;

public class DiceImplTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void testRoll() {
        int diceI = new DiceImpl().roll();
        if (diceI < 1) {
            System.err.println("Проверка 1. Выпало: " + diceI + ". Значение броска должно быть больше 0 (Интервал 1-6)");
        } else {
            System.out.println("Проверка 1 пройдена");
        }
        if (diceI > 6) {
            System.err.println("Проверка 2. Выпало: " + diceI + ". Значение броска должно быть не более 6 (Интервал 1-6)");
        } else {
            System.out.println("Проверка 2 пройдена");
        }
    }

    @Test
    public void testRollMass() {
        boolean errorFound = false;
        int start = 1;
        int diceI = new DiceImpl().roll();
        while ((diceI > 0) & (diceI < 7) & (errorFound = false) & (start < 100000)) {
            start = start++;
            if (diceI < 1 || diceI > 6) {
                errorFound = true;
            }
        }
        if (errorFound = true) {
            System.err.println("Проверка 3. Ошибка нагрузочного тестирования на итерации "
                    + start + ".Выпало: " + diceI + ". Значение броска должно быть в интервале (Интервал 1-6)");
        } else {
            System.out.println("Проверка 3 пройдена;");
        }
    }


}