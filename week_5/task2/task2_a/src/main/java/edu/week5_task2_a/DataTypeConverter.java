package edu.week5_task2_a;

public class DataTypeConverter {

    public Object convert(String input, String targetType) throws IllegalArgumentException {
        switch (targetType.toLowerCase()) {
            case "int":
                return convertToInteger(input);
            case "double":
                return convertToDouble(input);
            case "bool":
                return convertToBoolean(input);
            case "str":
                return input;
            default:
                throw new IllegalArgumentException("Недопустимый тип данных: " + targetType);
        }
    }

    private Integer convertToInteger(String input) throws IllegalArgumentException {
        try {
            return Integer.parseInt(input);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("Невозможно преобразовать в Integer: " + input);
        }
    }

    private Double convertToDouble(String input) throws IllegalArgumentException {
        try {
            return Double.parseDouble(input);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("Невозможно преобразовать в Double: " + input);
        }
    }

    private Boolean convertToBoolean(String input) throws IllegalArgumentException {
        if (input.equalsIgnoreCase("true") || input.equalsIgnoreCase("false")) {
            return Boolean.parseBoolean(input);
        } else {
            throw new IllegalArgumentException("Невозможно преобразовать в Boolean: " + input);
        }
    }
}
