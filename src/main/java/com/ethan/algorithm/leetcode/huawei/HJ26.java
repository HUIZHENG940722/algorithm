package com.ethan.algorithm.leetcode.huawei;

/**
 * @Author zhenghui
 * @Description 删除有序数组中的重复项
 * @Date 2022/8/7
 */
public class HJ26 {
    public static void main(String[] args) {
        int[] nums = new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int i = removeDuplicates(nums);
        System.out.println(i);
    }

    public static int removeDuplicates(int[] nums) {
        int len = nums.length;
        for (int i = 1; i < len; ) {
            if (nums[i] == nums[i - 1]) {
                int j = i;
                for (; j < len - 1; j++) {
                    nums[j] = nums[j + 1];
                }
                nums[j] = 0;
                len = len - 1;
            } else {
                i++;
            }
        }
        return len;
    }
}
