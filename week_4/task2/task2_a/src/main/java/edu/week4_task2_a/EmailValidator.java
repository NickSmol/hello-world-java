package edu.week4_task2_a;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailValidator {

    // Регулярное выражение для проверки формата email
    private static final String EMAIL_REGEX = "^[\\w.%+-]+@[\\w.-]+\\.[a-zA-Z]{2,6}$";

    // Метод для проверки валидности email
    public static boolean isValidEmail(String email) {
        // Создаём шаблон для регулярного выражения
        Pattern pattern = Pattern.compile(EMAIL_REGEX);
        // Проверяем email с помощью регулярного выражения
        Matcher matcher = pattern.matcher(email);
        // Возвращаем результат проверки
        return matcher.matches();
    }
}