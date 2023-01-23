package ru_propis;

public interface Validator {
    public boolean maxValueValidator(String[] val);
    public boolean isNumberValidator(String[] val);
    public boolean curCodeValidator(String[] val);
    public boolean twoPartsStrValidator(String[] val);
    public boolean isNotEmpty(String[] val);
    public boolean checkAll(String[] val);

}
