package ru_propis;

public class ConsoleUserOutput implements UserOutput {
    @Override
    public void printMessage(String message)
    { System.out.println(message);}
}

