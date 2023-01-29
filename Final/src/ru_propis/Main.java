package ru_propis;

public class Main {
    public static void main(String[] args) {
        UserOutput userOutput = new ConsoleUserOutput();
        userOutput.printMessage(" === Программа конвертации суммы из числа в значение прописью включая выбранную валюту ===");

        UserInput userInput = new ConsoleUserInput();
        Money money = userInput.read(new Validator[]{ new InputStringValidator(),
                new InputAmountTypeValidator(), new InputNumValMaxValidator(), new InputCurrencyValidator()
        });

        CurrName instance = CurrName.valueOf(money.getCurCode());
        String currName = instance.getEndingMessage(money.getAmount().toString());

        MyNumToWords myNumToWords = new MyNumToWords();
        userOutput.printMessage(" Программа: "+myNumToWords.getPropStr(money.getAmount().toString())+" "+currName);
        LibConvertClass lib = new LibConvertClass();
        userOutput.printMessage("Библиотека: "+lib.getPropLibStr(money.getAmount())+" "+currName);

    }

}
