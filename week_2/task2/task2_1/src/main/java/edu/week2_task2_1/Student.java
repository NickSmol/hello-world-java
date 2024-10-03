package edu.week2_task2_1;

import java.time.LocalDate;
import java.time.Period;

public class Student {

    private String name;
    private LocalDate birthDate;
    private String group;
    private int studentId;
    private double averageScore;

    public Student(String name, LocalDate birthDate, String group, int studentId, double averageScore) {
        this.name = name;
        this.birthDate = birthDate;
        this.group = group;
        this.studentId = studentId;
        this.averageScore = averageScore;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public double getAverageScore() {
        return averageScore;
    }

    public void setAverageScore(double averageScore) {
        this.averageScore = averageScore;
    }

    // Метод для вычисления возраста студента
    public int getAge() {
        LocalDate currentDate = LocalDate.now();
        return Period.between(birthDate, currentDate).getYears();
    }

    // Метод для проверки, является ли студент отличником
    public boolean isExcellentStudent() {
        return averageScore >= 4.8;
    }

    // Метод toString для вывода информации о студенте
    @Override
    public String toString() {
        return  "Имя: " + name + "\n" +
                "Дата рождения(год, месяц, день): " + birthDate + "\n" +
                "Группа: " + group + "\n" +
                "Код студента: " + studentId + "\n" +
                "Средний балл: " + averageScore + "\n" +
                "Возраст: " + getAge();
    }

    public static void main(String[] args) {

        Student student1 = new Student("Смолев Н.", LocalDate.of(2001, 7, 15), "23ИС1б", 18, 4.0);
        Student student2 = new Student("Николаев Д.", LocalDate.of(2001, 8, 10), "23ИС1б", 11, 4.5);
        Student student3 = new Student("Смольянов А.", LocalDate.of(2000, 12, 25), "23ИС1б", 19, 3.6);

        System.out.println("Студент №1");
        System.out.println(student1);
        System.out.println("Отличная успеваемость: " + student1.isExcellentStudent() +"\n");

        System.out.println("Студент №2");
        System.out.println(student2);
        System.out.println("Отличная успеваемость: " + student2.isExcellentStudent() + "\n");

        System.out.println("Студент №3");
        System.out.println(student3);
        System.out.println("Отличная успеваемость: " + student3.isExcellentStudent() + "\n");
    }
}
