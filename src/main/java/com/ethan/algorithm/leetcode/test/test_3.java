package com.ethan.algorithm.leetcode.test;

/**
 * @Author zWX1058539
 * @Description 无重复字符的最长子串
 * @Date 2022/7/8
 */
public class test_3 {
    public int lengthOfLongestSubstring(String s) {
        // 初始索引前端位置
        int i = 0;
        // 初始索引末尾位置
        int len = s.length();
        if (len <= 1) {
            return len;
        }
        int result = 1;
        for (int j = 1; j < len; j++) {
            String data = s.substring(i, j);
            char c = s.charAt(j);
            int index = data.indexOf(c);
            if (index >= 0) {
                if (j - i > result) {
                    result = j - i;
                }
                i = i + index + 1;
            }
            if (j == len - 1 && index < 0) {
                if (j - i + 1 > result) {
                    result = j - i + 1;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {

    }
}
