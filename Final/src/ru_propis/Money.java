package ru_propis;

class Money {
    private Integer amount;
    private String curCode;

    public Money(Integer amount, String curCode) {
        this.amount = amount;
        this.curCode = curCode;
    }

    public Integer getAmount() {
        return amount;
    }

    public String getCurCode() {
        return curCode;
    }
}