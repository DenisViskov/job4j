package ru.job4j.bank;

import java.util.Objects;

/**
 * Класс реализует модель данных аккаунта
 *
 * @author Денис Висков
 * @version 1.0
 * @since 06.01.2020
 */
public class Account {
    /**
     * Реквизиты
     */
    private String requisite;

    /**
     * Баланс
     */
    private double balance;

    public Account(String requisite, double balance) {
        this.requisite = requisite;
        this.balance = balance;
    }

    public String getRequisite() {
        return requisite;
    }

    public void setRequisite(String requisite) {
        this.requisite = requisite;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Account account = (Account) o;
        return Objects.equals(requisite, account.requisite);
    }

    @Override
    public int hashCode() {
        return Objects.hash(requisite);
    }
}
