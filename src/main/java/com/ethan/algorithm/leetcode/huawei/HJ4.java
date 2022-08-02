package com.ethan.algorithm.leetcode.huawei;

/**
 * @Author zhenghui
 * @Description 寻找两个正序数组的中位数
 * @Date 2022/7/24
 */
public class HJ4 {

    public static void main(String[] args) {
        int[] nums1 = new int[]{1, 3};
        int[] nums2 = new int[]{2};
        findMedianSortedArrays(nums1, nums2);
    }

    /**
     * @param nums1
     * @param nums2
     * @return
     */
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int len1 = nums1.length;
        int len2 = nums2.length;
        int len = len1 + len2;
        int i = 0, j = 0, index = 0;
        int[] nums = new int[len];
        for (; i < len1 && j < len2; index++) {
            if (nums1[i] <= nums2[j]) {
                nums[index] = nums1[i++];
            } else {
                nums[index] = nums2[j++];
            }
        }
        for (; i < len1; ) {
            nums[index++] = nums1[i++];
        }
        for (; j < len2; ) {
            nums[index++] = nums2[j++];
        }
        if (len % 2 == 0) {
            return (nums[len / 2 - 1] + nums[len / 2]) / 2.0;
        } else {
            return nums[len / 2];
        }
    }
}
