package ru_propis;

import java.util.Locale;
import java.util.Scanner;

public class ConsoleUserInput implements UserInput {
    final Scanner scanner = new Scanner(System.in);
    final UserOutput userOutput = new ConsoleUserOutput();

    public Money read(Validator[] validators) {
        String[] inputs = getMoney(validators);
        return new Money(Integer.valueOf(inputs[0]), inputs[1]);
    }

    private String[] getMoney(Validator[] validators) {
        boolean correctInput = false;
        String[] inputs = new String[0];
        while (!correctInput) {
            printAskMessage();
            String input = scanner.nextLine().toUpperCase(Locale.ROOT);
            if (input.equals("0")) {
                System.exit(0);
            }
            inputs = input.split(" ");

            if (validators[0].validate(inputs)) {
                String amount = inputs[0];
                String curCode = inputs[1];
                if (validators[1].validate(amount)  &&  validators[2].validate(Integer.parseInt(amount))
                        && (validators[3].validate(curCode))) {
                    correctInput = true;
                }
            }
        }
        return inputs;
    }

    private void printAskMessage() {
        userOutput.printMessage("Введите  сумму (целое число от 1 до 999999999) и валюту в формате 'Число пробел Валюта . Валюта: RUB или USD");
        userOutput.printMessage("Примеры : 12345 RUB ; 415546454 USD.  0 - прервать работу программы ");
    }
}