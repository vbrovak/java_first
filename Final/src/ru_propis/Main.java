package ru_propis;

public class Main {
    public static void main(String[] args) {
        UserOutput userOutput = new ConsoleUserOutput();
        userOutput.printMessage(" === Программа конвертации суммы из числа в значение прописью включая выбранную валюту ===");
        userOutput.printMessage("Введите  сумму (целое число от 1 до 999999999) и валюту в формате 'Число пробел Валюта . Валюта: RUB или USD");
        userOutput.printMessage("Примеры : 12345 RUB ; 415546454 USD ");

        UserInput userInput = new ConsoleUserInput();
        String[] parameters = userInput.read();
        String numForProp = parameters[0];
        String currencyCode = parameters[1];

        CurrName instance = CurrName.valueOf(currencyCode);
        String currName = instance.getEndingMessage(numForProp);

        MyNumToWords myNumToWords = new MyNumToWords();
        userOutput.printMessage(" Программа: "+myNumToWords.getPropStr(numForProp)+" "+currName);
        LibConvertClass lib = new LibConvertClass();
        userOutput.printMessage("Библиотека: "+lib.getPropLibStr(Integer.valueOf(numForProp))+" "+currName);
    }
}
