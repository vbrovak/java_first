package ru_propis;

public class Main {
    public static void main(String[] args) {
        boolean flag = false;
       String[] parameters = new String[1];
        UserOutput userOutput = new ConsoleUserOutput();
        userOutput.printMessage(" === Программа конвертации суммы из числа в значение прописью включая выбранную валюту ===");

        UserInput userInput = new ConsoleUserInput();
        Validator valid = new ValidatorData();

        while (!flag)  {
            userOutput.printMessage("Введите  сумму (целое число от 1 до 999999999) и валюту в формате 'Число пробел Валюта . Валюта: RUB или USD");
            userOutput.printMessage("Примеры : 12345 RUB ; 415546454 USD.  0 - прервать работу программы ");
            parameters  = userInput.read();
           if (parameters[0].equals("0"))
           {return;}
           flag = valid.checkAll(parameters);
        }

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
