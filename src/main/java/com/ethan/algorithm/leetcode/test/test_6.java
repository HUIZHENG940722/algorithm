package com.ethan.algorithm.leetcode.test;

/**
 * @Author zhenghui
 * @Description Z子形变换
 * @Date 2022/7/23
 */
public class test_6 {

    public static void main(String[] args) {
        String s = "AB";
        int numRows = 1;
        String convert = convert(s, numRows);
        System.out.println(convert);
    }


    public static String convert(String s, int numRows) {
        // 计算行数
        int x = numRows;
        // 计算列数
        int len = s.length();
        int y;
        if (numRows==1) {
            y = len;
        } else {
            y = len / (numRows - 1) / 2 * (numRows - 1);
        }
        char[][] chars = new char[x][y];
        int t1 = 0, t2 = 0;
        int i = 0;
        while (i < len) {
            for (; t1 < numRows - 1 && i < len; t1++, i++) {
                chars[t1][t2] = s.charAt(i);
            }
            for (; t1 > 0 && i < len; t1--, i++) {
                chars[t1][t2] = s.charAt(i);
                t2++;
            }
        }
        StringBuilder sb = new StringBuilder();
        for (char[] aChar : chars) {
            for (char c : aChar) {
                if (c != '\u0000') {
                    sb.append(c);
                }
            }
        }
        return sb.toString();
    }
}
