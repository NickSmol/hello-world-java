package edu.week2_task2_2;

import java.util.Scanner;

public class Main {
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

        scanner.close();
    }
}
