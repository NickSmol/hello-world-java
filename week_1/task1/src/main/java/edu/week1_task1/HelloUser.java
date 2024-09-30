import java.util.Scanner;

public class HelloUser {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Запрос имени пользователя
        System.out.print("Введите своё имя: ");
        String userName = scanner.nextLine();

        // Вывод приветствия
        System.out.println("Привет, " + userName + "!");
        
        scanner.close();
    }
}
