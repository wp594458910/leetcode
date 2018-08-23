package com.leetcode;

import java.util.Arrays;

/**
 * 只出现一次的数字
 * <p>
 * 给定一个非空整数数组，除了某个元素只出现一次以外，其余每个元素均出现两次。找出那个只出现了一次的元素。
 */
public class Solution0823 {
    public int singleNumber(int[] nums) {
        /**
         * 其中 ^ 为异或运算符，将数字转换为2进制后按位进行运算，例如：15的2进制表示为1111, 2的2进制表示为0010，那么15^2的结果为1101返回值为13。
         * a^=b的效果等价于a=a^b。对一个元素连续与另一个元素做两次异或运算后得到的元素还是自己，当对整个数组进行遍历异或运算后最后得到的xor就是所求的唯一的那个。
         */
        int result = 0;
        for (int i = 0; i < nums.length; i++) {
            result ^= nums[i];
        }
        return result;
    }

    public static void main(String[] args) {
        Solution0823 solution = new Solution0823();
        int result = solution.singleNumber(new int[]{2,2,1});
        System.out.println(result);
    }
}
