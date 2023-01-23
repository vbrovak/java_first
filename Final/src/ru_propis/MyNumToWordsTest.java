package ru_propis;


import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class MyNumToWordsTest {

    private final MyNumToWords myNumToWords;
    private final LibConvertClass lib;

    public MyNumToWordsTest() {
        this.myNumToWords  = new MyNumToWords();
        this.lib = new LibConvertClass();
    }

    @ParameterizedTest
    @ValueSource(strings = {"001", "010", "1", "2", "3", "5", "10" , "11", "15", "20" , "22",  "200", "3000",
                            "013", "910", "9821", "67782", "45653", "7895", "3455" , "2344", "66233", "2344" , "2002",  "207330", "3057500",
                            "9", "17", "401", "2004", "3020035", "210001552", "910220033", "90033397", "67722000",  "6333022", "1333444",
                            "3001", "50406", "629123", "1935323", "95323861", "252726676", "92352341", "999999999"})
   @DisplayName("Проверка на корректность преобразования")
    void checkConvert(String input) {
        assertTrue(myNumToWords.getPropStr(input).equals(lib.getPropLibStr(Integer.valueOf(input)))); }
}