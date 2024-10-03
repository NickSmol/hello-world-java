package edu.week2_task2_2;

import java.util.Scanner;

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

    public static void main(String[] args) {
        // Создание банковского счета с начальными параметрами
        BankAccount account = new BankAccount("123456789", 1000.0);
        

        // Вывод информации о счете
        System.out.println(account);
        
        //Меню для взаимодействия с банковским счётом
        Scanner scanner = new Scanner(System.in);
        System.out.print("Выберите действие:" + "\n" +
                        "1.Пополнение счёта: " + "\n" +
                        "2.Снятие со счёта: " + "\n");
        int option = scanner.nextInt();
        System.out.print("Введите сумму: ");
        double ammount = scanner.nextDouble();
        if (option == 1){
            account.deposit(ammount);
        }
        else{
            account.withdraw(ammount);
        }
        System.out.println("Баланс: " + account.getBalance());
    }
}
