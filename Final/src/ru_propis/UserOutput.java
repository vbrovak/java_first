package ru_propis;

public interface UserOutput {
    default void printMessage(String message) {
    }
    default void printMessageErr(String message) {
    }
}
