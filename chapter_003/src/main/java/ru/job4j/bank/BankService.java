package ru.job4j.bank;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

/**
 * Класс реализует функционал работы банка
 *
 * @author Денис Висков
 * @version 1.0
 * @since 06.01.2020
 */
public class BankService {
    /**
     * Карта пользователей системы с привязкой аккаунтов
     */
    private Map<User, List<Account>> users = new HashMap<>();

    /**
     * Метод реализует функционал добавления нового пользователя в систему
     * Осуществляет проверку наличия пользователя в системе
     *
     * @param user - новый пользователь
     */
    public void addUser(User user) {
        if (!this.users.containsKey(user)) {
            this.users.put(user, new ArrayList<>());
        }
    }

    /**
     * Метод реализует функционал добавления счёта пользователю
     * Осуществляет поиск пользователя по данным паспорта
     * Выполняет проверку на наличие данного счёта у пользователя
     *
     * @param passport - паспорт
     * @param account  - счёт
     */
    public void addAccount(String passport, Account account) {
        User user = findByPassport(passport);
        Stream.of(this.users).
                flatMap(e -> Stream.of(e.get(user))).
                filter(e -> !e.contains(account)).
                forEach(e -> e.add(account));
    }

    /**
     * Метод выполняет поиск пользователя по данным его паспорта
     *
     * @param passport - паспорт
     * @return - пользователь
     */
    public User findByPassport(String passport) {
        User user = this.users.keySet().stream().
                filter(e -> e.getPassport().equals(passport)).
                findFirst().get();
        return user;
    }

    /**
     * Метод выполняет поиск счёта по реквезитам
     *
     * @param passport  - паспорт
     * @param requisite - реквизиты
     * @return - счёт
     */
    public Account findByRequisite(String passport, String requisite) {
        User user = findByPassport(passport);
        Account account = Stream.of(this.users).
                flatMap(e -> Stream.of(e.get(user)).
                        flatMap(i -> i.stream())).
                filter(i -> i.getRequisite().equals(requisite)).
                findFirst().get();
        return account;
    }

    /**
     * Метод выполняет перевод средств с одного счёта на другой
     * Выполняет проверку на наличие денежных средств и наличие счёта
     *
     * @param srcPassport   - паспорт пользователя который осуществляет перевод
     * @param srcRequisite  - реквизиты счёта списания
     * @param destPassport  - паспорт пользователя зачисления денежных средств
     * @param destRequisite - реквизиты пользователя зачисления денежных средств
     * @param amount        - сумма перевода
     * @return - true или false
     */
    public boolean transferMoney(String srcPassport, String srcRequisite,
                                 String destPassport, String destRequisite, double amount) {
        boolean rsl = false;
        boolean validation = findByRequisite(srcPassport, srcRequisite) != null
                && findByRequisite(destPassport, destRequisite) != null;
        if (validation) {
            Account first = findByRequisite(srcPassport, srcRequisite);
            Account second = findByRequisite(destPassport, destRequisite);
            rsl = first.transferCash(first, second, amount);
        }
        return rsl;
    }
}
