package edu.week6_task1_a;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Permutations permutations = new Permutations();

        // Ввод списка чисел
        System.out.print("Введите числа через пробел: ");
        String input = scanner.nextLine();
        String[] tokens = input.split(" ");
        List<Integer> nums = new ArrayList<>();
        for (String token : tokens) {
            nums.add(Integer.parseInt(token));
        }

        List<List<Integer>> result = permutations.perms(nums);

        System.out.println("Все возможные перестановки:");
        for (List<Integer> permutation : result) {
            System.out.println(permutation);
        }
    }
}
