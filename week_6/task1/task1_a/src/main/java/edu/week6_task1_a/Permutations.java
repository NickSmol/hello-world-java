package edu.week6_task1_a;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Permutations {

    public List<List<Integer>> perms(List<Integer> nums) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(nums, 0, result);
        return result;
    }

    private void backtrack(List<Integer> nums, int index, List<List<Integer>> result) {
        if (index == nums.size()) {
            result.add(new ArrayList<>(nums)); // добавляем копию текущей перестановки
            return;
        }

        for (int i = index; i < nums.size(); i++) {
            Collections.swap(nums, i, index);
            backtrack(nums, index + 1, result);
            Collections.swap(nums, i, index); 
        }
    }
}

