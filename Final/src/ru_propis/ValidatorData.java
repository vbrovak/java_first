package ru_propis;

public class ValidatorData implements Validator {

    public boolean isNotEmpty(String[] val) {
        return val.length > 1;
    }

    public boolean twoPartsStrValidator(String[] val) {
        return val.length == 2;
    }

    public boolean isNumberValidator(String[] val) {
        try {
            Integer.parseInt(val[0]);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public boolean maxValueValidator(String[] val) {
        return Double.valueOf(val[0]) <= 999999999;
    }

    public boolean curCodeValidator(String[] val) {
        try {
            CurrName.valueOf(val[1]).ordinal();
            return true;
        } catch (IllegalArgumentException e) {
            return false;
        }
    }

    public boolean checkAll(String[] val) {
        if (isNotEmpty(val) && twoPartsStrValidator(val) && isNumberValidator(val) &&
                maxValueValidator(val) && curCodeValidator(val)) {
            return true;
        } else return false;
    }


}
