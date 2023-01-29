package ru_propis;


public class InputCurrencyValidator implements Validator {
    @Override
    public boolean validate(String val) {
        try {
            CurrName.valueOf(val).ordinal();
            return true;
        } catch (IllegalArgumentException e) {
            return false;
        }
    }

    public InputCurrencyValidator() {

    }
}