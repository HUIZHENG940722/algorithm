package com.ethan.algorithm.leetcode.test;

/**
 * @Author zWX1058539
 * @Description 两数之和
 * @Date 2022/7/7
 */
public class test_1 {

    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        int len = nums.length;
        for (int i = 0; i < len - 1; i++) {
            for (int j = i + 1; j < len; j++) {
                if (nums[i] + nums[j] == target) {
                    result[0] = i;
                    result[1] = j;
                }
            }
        }
        return result;
    }
}
