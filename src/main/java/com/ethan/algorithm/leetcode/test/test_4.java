package com.ethan.algorithm.leetcode.test;

/**
 * @Author zWX1058539
 * @Description 寻找两个正序数组的中位数
 * @Date 2022/7/8
 */
public class test_4 {
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int len1 = nums1.length;
        int len2 = nums2.length;
        int len = len1 + len2;
        int[] num = new int[len];
        int i = 0, j = 0, index = 0;
        while (i < len1 && j < len2) {
            if (nums1[i] <= nums2[j]) {
                num[index++] = nums1[i++];
            } else {
                num[index++] = nums2[j++];
            }
        }
        while (i < len1) {
            num[index++] = nums1[i++];
        }
        while (j < len2) {
            num[index++] = nums2[j++];
        }
        if (len % 2 == 0) {
            return (num[len / 2] + num[len / 2 - 1]) / 2.0;
        } else {
            return num[len / 2];
        }
    }

    public static void main(String[] args) {
        int[] nums1 = new int[]{1, 2};
        int[] nums2 = new int[]{3, 4};
        double medianSortedArrays = findMedianSortedArrays(nums1, nums2);
        System.out.println(medianSortedArrays);
    }
}
