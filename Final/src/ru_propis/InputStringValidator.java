package ru_propis;

public class InputStringValidator implements Validator {
    @Override
    public boolean validate(String[] val) {
        return (val.length == 2);
    }

    public InputStringValidator() {
    }
}
