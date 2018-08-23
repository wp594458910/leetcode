package com.leetcode;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * 题目：存在重复
 * <p>
 * 给定一个整数数组，判断是否存在重复元素。
 * <p>
 * 如果任何值在数组中出现至少两次，函数返回 true。如果数组中每个元素都不相同，则返回 false。
 */
public class Solution0822 {
    public boolean containsDuplicate(int[] nums) {
        boolean result = false;
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                result = true;
            }
        }
        return result;
    }

    public boolean containsDuplicate1(int[] nums) {
        boolean result = false;
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (set.contains(nums[i])) {
                result = true;
            } else {
                set.add(nums[i]);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Solution0822 solution = new Solution0822();
        boolean result = solution.containsDuplicate(new int[]{1, 1, 1, 3, 3, 4, 3, 2, 4, 2});
        System.out.println(result);
    }
}
