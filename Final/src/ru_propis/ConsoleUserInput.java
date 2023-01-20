package ru_propis;

import java.util.Locale;
import java.util.Scanner;
public  class ConsoleUserInput implements UserInput {
    public String[]  read() {
        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.nextLine().toUpperCase(Locale.ROOT);
        return userInput.split(" ");
    }
}