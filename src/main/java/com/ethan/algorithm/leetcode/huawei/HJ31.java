package com.ethan.algorithm.leetcode.huawei;

import java.util.Arrays;

/**
 * @Author zhenghui
 * @Description 下一个排列
 * @Date 2022/8/8
 */
public class HJ31 {

    public static void main(String[] args) {
        int[] nums = new int[]{3, 2, 1};
        nextPermutation(nums);
        System.out.println();
    }

    public static void nextPermutation(int[] nums) {
        int len = nums.length;
        int i = len - 2;
        for (; i >= 0; i--) {
            int min = Integer.MAX_VALUE;
            int index = i;
            for (int j = i + 1; j < len; j++) {
                if (nums[i] < nums[j] && nums[j] < min) {
                    min = nums[j];
                    index = j;
                }
            }
            if (index != i) {
                int temp = nums[i];
                nums[i] = nums[index];
                nums[index] = temp;
                break;
            }
        }
        int[] tempNums = new int[len - i - 1];
        for (int j = i + 1, index = 0; j < len; j++) {
            tempNums[index++] = nums[j];
        }
        Arrays.sort(tempNums);
        for (int j = i + 1, index = 0; j < len; j++) {
            nums[j] = tempNums[index++];
        }
    }
}
