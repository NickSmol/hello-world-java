package edu.week2_task2_1;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Student student1 = new Student("Смолев Н.", LocalDate.of(2001, 7, 15), "23ИС1б", 18, 4.9);
        Student student2 = new Student("Николаев Д.", LocalDate.of(2001, 8, 10), "23ИС1б", 11, 4.8);
        Student student3 = new Student("Смольянов А.", LocalDate.of(2000, 12, 25), "23ИС1б", 19, 4.0);

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