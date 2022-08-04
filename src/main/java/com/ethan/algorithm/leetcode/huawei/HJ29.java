package com.ethan.algorithm.leetcode.huawei;

/**
 * @Author zhenghui
 * @Description 两数相除
 * @Date 2022/8/4
 */
public class HJ29 {
    public static void main(String[] args) {
        int divide = divide(-2147483648, -1);
        System.out.println(divide);
    }

    public static int divide(int dividend, int divisor) {
        long dividendL = Long.parseLong(Integer.toString(dividend));
        long divisorL = Long.parseLong(Integer.toString(divisor));
        int f = 1;
        if ((dividend < 0 && divisor > 0) || (dividend > 0 && divisor < 0)) {
            f = -1;
        }
        int result = 0;
        if (dividendL < 0) {
            dividendL = -dividendL;
        }
        if (divisorL < 0) {
            divisorL = -divisorL;
        }
        if (divisorL == 1) {
            return dividendL * f > Integer.MAX_VALUE || dividendL * f < Integer.MIN_VALUE ? (int) (Math.pow(2, 31) - 1) : (int) (f * dividendL);
        }
        for (long i = 0; i < dividendL && i + divisorL - 1 < dividendL; i = i + divisorL) {
            result++;
        }
        return result * f > Integer.MAX_VALUE || result * f < Integer.MIN_VALUE ? (int) (Math.pow(2, 31) - 1) : (f * result);
    }
}
