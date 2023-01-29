package ru_propis;

public interface Validator {
    default boolean validate(String val) { return true;}
    default boolean validate(String[] val) { return true;}
    default boolean validate(Integer val) { return true;}

}
