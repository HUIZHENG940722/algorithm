package com.ethan.algorithm.leetcode.test;

/**
 * @Author zhenghui
 * @Description 整数反转
 * @Date 2022/7/23
 */
public class test_7 {

    public static int reverse(int x) {
        int rev = 0;
        while (x != 0) {
            int pop = x % 10;
            x /= 10;

        }
        return rev;
    }
}
