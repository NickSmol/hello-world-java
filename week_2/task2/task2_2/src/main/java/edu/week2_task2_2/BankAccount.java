package edu.week2_task2_2;

public class BankAccount {

    // Поля класса
    private String accountNumber;
    private double balance;

    // Конструктор с параметрами
    public BankAccount(String accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }

    // Метод для внесения средств на счет
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Успешное пополнение счёта на сумму: " + amount);
        } else {
            System.out.println("Сумма для пополнения не может быть отрицательной.");
        }
    }

    // Метод для снятия средств со счета
    public void withdraw(double amount) {
        if (amount > 0) {
            if (amount <= balance) {
                balance -= amount;
                System.out.println("Успешно снято: " + amount);
            } else {
                System.out.println("Ошибка: Недостаточно средств на счёте.");
            }
        } else {
            System.out.println("Сумма для снятия не может быть отрицательной.");
        }
    }

    // Метод для получения текущего баланса
    public double getBalance() {
        return balance;
    }

    // Метод для вывода информации о счете
    @Override
    public String toString() {
        return "Добро пожаловать!" + "\n" +
                "Номер счёта: " + accountNumber + "\n" +
                "Баланс: " + balance + "\n";
    }
}
