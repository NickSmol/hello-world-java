package edu.week2_task1_2;

public class Octagon {

    private double innerRadius;

    // Конструктор по умолчанию
    public Octagon() {
        this.innerRadius = 0.0;
    }

    // Конструктор с параметром для установки радиуса
    public Octagon(double innerRadius) {
        this.innerRadius = innerRadius;
    }

    // Геттер для innerRadius
    public double getInnerRadius() {
        return innerRadius;
    }

    // Сеттер для innerRadius
    public void setInnerRadius(double innerRadius) {
        this.innerRadius = innerRadius;
    }

    // Метод для вычисления площади восьмиугольника
    public double calculateArea() {
        return 2 * (1 + Math.sqrt(2)) * Math.pow(innerRadius, 2);
    }

    // Метод для вычисления периметра восьмиугольника
    public double calculatePerimeter() {
        double side = innerRadius * Math.sqrt(2 - Math.sqrt(2));
        return 8 * side;
    }
}