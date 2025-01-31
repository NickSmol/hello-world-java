package main.java.edu.week8and9;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.chart.ChartUtils;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Fibonacci {

    // Итеративный метод для вычисления чисел Фибоначчи
    public static long classicFibonacciIterative(int n) {
        if (n <= 1) {
            return n;
        }

        long a = 0;  // F(0)
        long b = 1;  // F(1)

        for (int i = 2; i <= n; i++) {
            long temp = a + b;
            a = b;
            b = temp;
        }

        return b;
    }

    // Оптимизированный метод с кешированием (мемоизация)
    public static long optimizedFibonacci(int n, Map<Integer, Long> cache) {
        if (n <= 1) {
            return n;
        }

        if (cache.containsKey(n)) {
            return cache.get(n);
        }

        long result = optimizedFibonacci(n - 1, cache) + optimizedFibonacci(n - 2, cache);
        cache.put(n, result);

        return result;
    }

    // Метод для построения графиков
    public static JFreeChart createChart(DefaultCategoryDataset dataset) {
        return ChartFactory.createBarChart(
                "Сравнение времени выполнения методов Фибоначчи", // Заголовок
                "Метод", // Ось X
                "Время (мс)", // Ось Y
                dataset
        );
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Запрос пользователя для ввода n
        System.out.print("Введите число n для вычисления F(n): ");
        int n = scanner.nextInt();

        // Измерение времени для итеративного метода
        long startClassic = System.currentTimeMillis();
        classicFibonacciIterative(n);
        long endClassic = System.currentTimeMillis();
        long timeClassic = endClassic - startClassic;

        // Измерение времени для оптимизированного метода
        long startOptimized = System.currentTimeMillis();
        Map<Integer, Long> cache = new HashMap<>();
        optimizedFibonacci(n, cache);
        long endOptimized = System.currentTimeMillis();
        long timeOptimized = endOptimized - startOptimized;

        // Создание датасета для графика
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        dataset.addValue(timeClassic, "Итеративный", "Метод");
        dataset.addValue(timeOptimized, "Оптимизированный", "Метод");

        // Создание графика
        JFreeChart chart = createChart(dataset);

        // Сохранение графика в файл
        try {
            // Указываем путь для сохранения графика
            File outputFile = new File("fibonacci_comparison_chart.png");
            ChartUtils.saveChartAsPNG(outputFile, chart, 800, 600);
            System.out.println("График успешно сохранен в файл: " + outputFile.getAbsolutePath());
        } catch (IOException e) {
            System.err.println("Ошибка при сохранении графика: " + e.getMessage());
        }

        // Открытие окна с графиком (необязательно, если только хотите посмотреть график)
        ChartPanel chartPanel = new ChartPanel(chart);
        chartPanel.setPreferredSize(new java.awt.Dimension(800, 600));

        // Добавление панели с графиком в окно
        javax.swing.JFrame frame = new javax.swing.JFrame("График времени выполнения");
        frame.setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(chartPanel);
        frame.pack();
        frame.setVisible(true);

        scanner.close();
    }
}
