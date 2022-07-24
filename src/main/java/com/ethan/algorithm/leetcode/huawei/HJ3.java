package com.ethan.algorithm.leetcode.huawei;

/**
 * @Author zhenghui
 * @Description 无重复字符的最长字串
 * @Date 2022/7/23
 */
public class HJ3 {

    public static void main(String[] args) {
        String str = "cdd";
        int i = lengthOfLongestSubstring(str);
        System.out.println(i);
    }

    public static int lengthOfLongestSubstring(String s) {
        int i = 0, j = 0;
        int len = s.length();
        int maxLen = 0;
        for (; j < len; j++) {
            String str = s.substring(i, j);
            int index = str.indexOf(s.charAt(j));
            if (index > -1) {
                if (j - i > maxLen) {
                    maxLen = j - i;
                }
                i = i + index + 1;
            } else if (j == len - 1 && j - i + 1 > maxLen) {
                maxLen = j - i + 1;
            }
        }
        return maxLen;
    }
}
