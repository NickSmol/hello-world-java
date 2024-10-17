package edu.week4_task2_b;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class IPv6Validator {

    // Регулярное выражение для проверки полного адреса IPv6
    private static final String IPV6_REGEX = "^([0-9a-fA-F]{1,4}:){7}([0-9a-fA-F]{1,4})$";

    // Метод для проверки валидности IPv6
    public static boolean isValidIPv6(String ipv6Address) {
        // Создаём шаблон для регулярного выражения
        Pattern pattern = Pattern.compile(IPV6_REGEX);
        // Проверяем адрес с помощью регулярного выражения
        Matcher matcher = pattern.matcher(ipv6Address);
        // Возвращаем результат проверки
        return matcher.matches();
    }
}
