package ru_propis;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class ValidatorDataTest {

    @ParameterizedTest
    @ValueSource(strings = {"", "111", "333 RUB1", "2,9"})
    @DisplayName("Проверка на заполненность строки с данными")
    void isNotEmpty(String input) {
        Validator valid = new ValidatorData();
        String[] myArray = input.split(" ");
        assertTrue(valid.isNotEmpty(myArray));
    }

    @ParameterizedTest
    @ValueSource(strings = {"", "111", "333 RUB1", "2,9","2 9 333"})
    @DisplayName("Проверка, что в массиве 2 значения")
    void twoPartsStrValidator(String input) {
      Validator valid = new ValidatorData();
        String[] myArray = input.split(" ");
        assertTrue(valid.twoPartsStrValidator(myArray));
    }
    @ParameterizedTest
    @ValueSource(strings = {"1111 RUB", "aeseeyssfdfs RUB", "333,312 RUB", "2342.33 RUB","1234 RUB"})
    @DisplayName("Проверка что первое значение - корректная цифра")
    void isNumberValidator(String input) {
        Validator valid = new ValidatorData();
        String[] myArray = input.split(" ");
        assertTrue(valid.isNumberValidator(myArray));
    }

    @ParameterizedTest
    @ValueSource(strings = {"1111 RUB", "01231212 RUB", "1999999999 RUB"})
    @DisplayName("Проверка что первое значение меньше миллиона")
    void maxValueValidator(String input) {
        Validator valid = new ValidatorData();
        String[] myArray = input.split(" ");
        assertTrue(valid.maxValueValidator(myArray));
    }

    @ParameterizedTest
    @ValueSource(strings = {"1111 RUB", "0121212 EURO", "19999 USD", "3344 JAP"})
    @DisplayName("Проверка, что второй элемент - вариант валюты, входящей в enumerate")
    void curCodeValidator(String input) {
        Validator valid = new ValidatorData();
        String[] myArray = input.split(" ");
        assertTrue(valid.curCodeValidator(myArray));
    }

}