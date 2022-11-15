package ru_collection2;

import java.util.Objects;

public class Accounts {
    protected String fio;
    protected int acc;

    public Accounts(String fio, int acc) {
        this.fio = fio;
        this.acc = acc;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Accounts accounts = (Accounts) o;
        return acc == accounts.acc && Objects.equals(fio, accounts.fio);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fio, acc);
    }
}
