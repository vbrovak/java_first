package ru_propis;

public class InputNumValMaxValidator implements Validator {
    @Override
    public boolean validate(Integer val) {
        return val <= 999999999;
        }

    public InputNumValMaxValidator() {
    }
}


