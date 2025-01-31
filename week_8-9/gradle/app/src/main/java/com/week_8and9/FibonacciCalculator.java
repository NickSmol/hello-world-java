package com.week_8and9;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.renderer.category.LineAndShapeRenderer;
import org.jfree.data.category.DefaultCategoryDataset;

import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import java.util.Scanner;

public class FibonacciCalculator {

    private long[] cache;

    public FibonacciCalculator(int n) {
        cache = new long[n + 1];
        cache[0] = 0;
        cache[1] = 1;
    }

    public long iterativeFibonacci(int n) {
        if (n <= 1) return n;
        long prev1 = 1, prev2 = 0, current = 0;
        for (int i = 2; i <= n; i++) {
            current = prev1 + prev2;
            prev2 = prev1;
            prev1 = current;
        }
        return current;
    }

    // Заполняем кэш один раз перед тестами
    public void fillCache(int n) {
        for (int i = 2; i <= n; i++) {
            cache[i] = cache[i - 1] + cache[i - 2];
        }
    }

    public long cachedFibonacci(int n) {
        return cache[n];
    }

    private static long measureTime(Runnable method) {
        int runs = 10;
        long totalTime = 0;
        for (int i = 0; i < runs; i++) {
            long start = System.nanoTime();
            method.run();
            long end = System.nanoTime();
            totalTime += (end - start);
        }
        return totalTime / runs;
    }

    public void displayChart(int n) {
        DefaultCategoryDataset datasetClassic = new DefaultCategoryDataset();
        DefaultCategoryDataset datasetCache = new DefaultCategoryDataset();

        FibonacciCalculator fib = new FibonacciCalculator(n);
        fib.fillCache(n); // Заполняем кэш ОДИН раз

        for (int i = 10; i <= n; i++) {
            long classicTime = measureTime(() -> iterativeFibonacci(i));
            long cachedTime = measureTime(() -> fib.cachedFibonacci(i)); // Используем уже готовый кэш

            datasetClassic.addValue(classicTime, "Классическая итеративная", "F(" + i + ")");
            datasetCache.addValue(cachedTime, "Кеширующая реализация", "F(" + i + ")");
        }

        JFreeChart chart = ChartFactory.createLineChart(
                "Сравнение времени выполнения алгоритмов Фибоначчи",
                "n", "Время (нс)",
                datasetClassic, PlotOrientation.VERTICAL, true, true, false
        );

        chart.getCategoryPlot().setDataset(1, datasetCache);
        LineAndShapeRenderer rendererCache = new LineAndShapeRenderer(true, false);
        rendererCache.setSeriesPaint(0, java.awt.Color.RED);
        chart.getCategoryPlot().setRenderer(1, rendererCache);

        LineAndShapeRenderer rendererClassic = new LineAndShapeRenderer(true, false);
        rendererClassic.setSeriesPaint(0, java.awt.Color.BLUE);
        chart.getCategoryPlot().setRenderer(0, rendererClassic);

        try {
            String directoryPath = "/workspaces/practice_highlevelprog/week_8-9/gradle/";
            String fileName = "fibonacci_comparison_chart_with_legend.png";
            File chartFile = new File(directoryPath + fileName);
            ImageIO.write(chart.createBufferedImage(800, 600), "PNG", chartFile);
            System.out.println("График сохранен в файл: " + fileName);
        } catch (IOException e) {
            System.out.println("Ошибка при сохранении графика: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число n для вычисления F(n): ");
        int n = scanner.nextInt();
        scanner.close();

        FibonacciCalculator fib = new FibonacciCalculator(n);
        fib.displayChart(n);

        System.out.println("Программа завершена. График сохранен.");
    }
}
