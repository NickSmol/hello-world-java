package edu.week3_task2_b;

public class HeronMethod {

    public static double sqrtHeron(double number) {
        double x_n = number / 2.0;
        double x_next;
        double tolerance = 1e-6;

        while (true) {
            x_next = 0.5 * (x_n + number / x_n);

            if (Math.abs(x_next - x_n) < tolerance) {
                break;
            }

            x_n = x_next;
        }

        return x_next;
    }
}

