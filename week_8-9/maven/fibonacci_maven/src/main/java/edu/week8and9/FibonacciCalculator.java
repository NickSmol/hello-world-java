package edu.week8and9;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.data.category.DefaultCategoryDataset;

import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FibonacciCalculator {

    // Классическая итеративная реализация
    public long iterativeFibonacci(int n) {
        if (n <= 1) return n;

        long prev1 = 1;
        long prev2 = 0;
        long current = 0;

        for (int i = 2; i <= n; i++) {
            current = prev1 + prev2;
            prev2 = prev1;
            prev1 = current;
        }

        return current;
    }

    // Кеширующая реализация с использованием списка
    public long cachedFibonacci(int n) {
        if (n <= 1) return n;

        List<Long> cache = new ArrayList<>(n + 1);
        cache.add(0L);
        cache.add(1L);

        for (int i = 2; i <= n; i++) {
            cache.add(cache.get(i - 1) + cache.get(i - 2));
        }

        return cache.get(n);
    }

    public void displayChart(int n, boolean isClassic) {
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
    
        String methodName = isClassic ? "Классическая итеративная" : "Кеширующая реализация";
    
        for (int i = 0; i <= n; i++) {
            long startTime = System.nanoTime();
            if (isClassic) {
                iterativeFibonacci(i);
            } else {
                cachedFibonacci(i);
            }
            long endTime = System.nanoTime();
            long elapsedTime = endTime - startTime; // Время выполнения в наносекундах
    
            dataset.addValue(elapsedTime, methodName, "F(" + i + ")");
        }
    
        JFreeChart chart = ChartFactory.createLineChart(
                "Время выполнения Фибоначчи: " + methodName, "n", "Время (нс)",
                dataset, PlotOrientation.VERTICAL, true, true, false
        );
    
        // Настройка графика
        CategoryPlot plot = (CategoryPlot) chart.getPlot();
        plot.setDomainGridlinesVisible(true);
        plot.setRangeGridlinesVisible(true);
    
        // Сохраняем график в файл
        try {
            String directoryPath = "/workspaces/practice_highlevelprog/week_8-9/gradle/";
            String fileName = "fibonacci_time_chart_" + (isClassic ? "classic" : "cache") + ".png";
            File chartFile = new File(directoryPath + fileName);
            ImageIO.write(chart.createBufferedImage(800, 600), "PNG", chartFile);
            System.out.println("График сохранен в файл: " + fileName);
        } catch (IOException e) {
            System.out.println("Ошибка при сохранении графика: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        FibonacciCalculator fib = new FibonacciCalculator();

        // Определение числа для графика
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите число n для вычисления F(n): ");
        int n = scanner.nextInt();

        // Генерация графиков для двух методов
        fib.displayChart(n, true);  // Классическая итеративная реализация
        fib.displayChart(n, false); // Кеширующая реализация

        System.out.println("Программа завершена. Графики сохранены.");

        scanner.close();
    }
}