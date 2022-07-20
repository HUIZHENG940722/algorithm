package com.ethan.algorithm.leetcode.test;

/**
 * @Author zWX1058539
 * @Description 最长回文子串
 * @Date 2022/7/8
 */
public class test_5 {

    public String longestPalindrome(String s) {
        int length = s.length();
        int maxLen = 1;
        String result = null;
        for (int i = 0; i < length; i++) {
            int max = Math.min(i + 1, length - i);
            if (max <= maxLen) {
                continue;
            } else {
                int len = longestPalindrome(s, i);
                if (maxLen < len) {
                    maxLen = len;
                    if (len % 2 == 0) {
                        result = s.substring(i + 1 - len / 2, i + len / 2 + 1);
                    } else {
                        result = s.substring(i + 1 - len / 2, i + len / 2);
                    }
                }
            }
        }
        return result;
    }

    /**
     * 索引位置开始的回文子串长度
     *
     * @param s
     * @param index
     * @return
     */
    private int longestPalindrome(String s, int index) {
        // 1 单回文子串
        int i = index, j = index;
        int result = 0;
        while (i >= 0 && j < s.length()) {
            if (s.charAt(i) == s.charAt(j)) {
                i--;
                j++;
            } else {
                result = j - i - 1;
                break;
            }
        }
        // 2 双回文子串
        int i1 = index, j1 = index + 1;
        while (i1 >= 0 && j1 < s.length()) {
            if (s.charAt(i1) == s.charAt(j1)) {
                i1--;
                j1++;
            } else {
                result = j1 - i1 - 1;
                break;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        test_5 test_5 = new test_5();
        String s = "babad";
        String s1 = test_5.longestPalindrome(s);
        System.out.println(s1);
    }
}
