package test;


import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import ru_propis.InputAmountTypeValidator;
import ru_propis.InputCurrencyValidator;
import ru_propis.InputNumValMaxValidator;
import ru_propis.InputStringValidator;

import static org.junit.jupiter.api.Assertions.*;

class ValidatorTest {

    @ParameterizedTest
    @ValueSource(strings = {"","1111", "aeseeyssfdfs RUB", "333,312 RUB", "2342.33 RUB","1234 RUB"})
    @DisplayName("Проверка на заполненность строки нв 2 поля в массиве")
    void InputStringValidator(String input) {
        InputStringValidator inputStr = new InputStringValidator();
        String[] myArray = input.split(" ");
        assertTrue(inputStr.validate(myArray));
    }

   @ParameterizedTest
    @ValueSource(strings = {"1111 RUB", "aeseeyssfdfs RUB", "333,312 RUB", "2342.33 RUB","1234 RUB"})
    @DisplayName("Проверка что первое значение - корректная цифра")
    void InputAmountTypeValidatorTest(String input) {
       InputAmountTypeValidator inputStr = new InputAmountTypeValidator();
       String[] myArray = input.split(" ");
       assertTrue(inputStr.validate(myArray[0]));
    }

    @ParameterizedTest
    @ValueSource(strings = {"1111 RUB", "01231212 RUB", "1999999999 RUB"})
    @DisplayName("Проверка что первое значение меньше миллиарда")
    void InputNumValMaxValidatorTest(String input) {
        InputNumValMaxValidator inputStr = new InputNumValMaxValidator();
        String[] myArray = input.split(" ");
        assertTrue(inputStr.validate(Integer.valueOf(myArray[0])));
    }

    @ParameterizedTest
    @ValueSource(strings = {"1111 RUB", "233333 JAP", "333 USD", "2342 EURO","1234 RUB"})
    @DisplayName("Проверка что допустимая валюта")
    void InputCurrencyValidatorTest(String input) {
        InputCurrencyValidator inputStr = new InputCurrencyValidator();
        String[] myArray = input.split(" ");
        assertTrue(inputStr.validate(myArray[1]));
    }

}

