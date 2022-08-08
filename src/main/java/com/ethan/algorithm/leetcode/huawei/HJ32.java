package com.ethan.algorithm.leetcode.huawei;

import java.util.Stack;

/**
 * @Author zhenghui
 * @Description 最长有效括号
 * @Date 2022/8/8
 */
public class HJ32 {
    public static void main(String[] args) {
        String s = ")()())";
        int i = longestValidParentheses(s);
        System.out.println(i);
    }

    public static int longestValidParentheses(String s) {
        Stack<Character> stack = new Stack<>();
        char[] chars = s.toCharArray();
        int start = 0, end = 0, len, maxLen = 0;
        boolean isEnd = true;
        for (int i = 0; i < chars.length; i++) {
            char aChar = chars[i];
            if (aChar == '(') {
                if (stack.isEmpty() && isEnd) {
                    start = i;
                    isEnd = false;
                }
                stack.push(aChar);
            } else {
                if (!stack.isEmpty()) {
                    if (stack.peek() == '(') {
                        stack.pop();
                    } else {
                        end = i;
                        len = end - start - stack.size();
                        if (len > maxLen) {
                            maxLen = len;
                        }
                        while (!stack.isEmpty()) {
                            stack.pop();
                        }
                        isEnd = true;
                    }
                } else {
                    end = i;
                    len = end - start;
                    if (len>maxLen) {
                        maxLen = len;
                    }
                    isEnd = true;
                }
            }
        }
        if (!stack.isEmpty() || !isEnd) {
            len = chars.length - start - stack.size();
            if (len > maxLen) {
                maxLen = len;
            }
        }
        return maxLen;
    }
}
