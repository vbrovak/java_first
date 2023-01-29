package ru_propis;


public class InputAmountTypeValidator implements Validator {
    @Override
    public boolean validate(String val) {
        try {
            Integer.parseInt(val);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public InputAmountTypeValidator() {
    }
}


