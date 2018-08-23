package com.leetcode;

/**
 * 旋转数组
 * <p>
 * 给定一个数组，将数组中的元素向右移动 k 个位置，其中 k 是非负数。
 * <p>
 * 输入: [1,2,3,4,5,6,7] 和 k = 3
 * 输出: [5,6,7,1,2,3,4]
 */
public class Solution0824 {
    public void rotate(int[] nums, int k) {
        if (nums.length == 1) {
            return;
        }
        int temp = 0;
        for (int i = 0; i < k; i++) {
            if (nums.length > 2) {
                for (int j = 0; j < nums.length - 1; j++) {
                    if (j == 0) {
                        temp = nums[j + 1];
                        nums[j + 1] = nums[j];
                    } else if (j != nums.length - 2) {
                        int temp1 = nums[j + 1];
                        nums[j + 1] = temp;
                        temp = temp1;
                    } else {
                        int temp2 = nums[j + 1];
                        nums[j + 1] = temp;
                        nums[0] = temp2;
                    }
                }
            } else {
                int temp3 = nums[1];
                nums[1] = nums[0];
                nums[0] = temp3;
            }
        }
    }

    public void rotate1(int[] nums, int k) {
        if (nums.length == 0 || (k %= nums.length) == 0) return;
        int cnt = 0, start = 0, i = 0;
        while (cnt < nums.length) {
            i = (i + k) % nums.length;
            if (i == start)
                i = ++start;
            else
                swap(nums, i, start);
            cnt++;
        }
    }

    private void swap(int[] a, int i, int j) {
        int t = a[i];
        a[i] = a[j];
        a[j] = t;
    }

    public void rotate2(int[] nums, int k) {
        if (nums.length == 0 || (k %= nums.length) == 0) return;
        for (int i = 0; i < k; i++) {
            int t = nums[nums.length - 1];
            for (int j = nums.length - 1; j > 0; j--) {
                nums[j] = nums[j - 1];
            }
            nums[0] = t;
        }
    }


    public static void main(String[] args) {
        Solution0824 solution = new Solution0824();
        solution.rotate2(new int[]{-1, -100, 3, 99}, 2);
    }
}
