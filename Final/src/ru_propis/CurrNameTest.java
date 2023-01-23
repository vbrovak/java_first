package ru_propis;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class CurrNameTest {
    private CurrName inst = CurrName.RUB;
    static String RUBI = "рублей";
    @Test
    void testZero() {
        assertTrue(RUBI.equals(inst.getEndingMessage("0")));
    }

    @Test
    void testOne() {
        assertTrue("рубль".equals(inst.getEndingMessage("1")));
    }

    @Test
    void testTwoFour() {
        assertTrue("рубля".equals(inst.getEndingMessage("4")));
    }

    @Test
    void testFiveNine() {
        assertTrue(RUBI.equals(inst.getEndingMessage("5")));
    }

    @Test
    void test1119() {
        assertTrue(RUBI.equals(inst.getEndingMessage("19")));
    }
}