package com.ethan.algorithm.leetcode.huawei;

import java.util.Arrays;

/**
 * @Author zhenghui
 * @Description 两数之和
 * @Date 2022/7/23
 */
public class HJ1 {

    public static void main(String[] args) {
        int[] data = new int[]{3, 2, 4};
        int[] ints = twoSum(data, 6);
    }

    public static int[] twoSum(int[] nums, int target) {
        // 1 设置第一个数的下标为i，第二个数的下标为j
        int len = nums.length;
        for (int i = 0; i < len - 1; i++) {
            for (int j = i + 1; j < len; j++) {
                if (nums[i] + nums[j] == target) {
                    int[] results = new int[]{i, j};
                    return results;
                }
            }
        }
        return null;
    }
}
