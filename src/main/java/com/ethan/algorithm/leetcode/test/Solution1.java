package com.ethan.algorithm.leetcode.test;

import java.util.LinkedList;
import java.util.List;

/**
 * @Author zhenghui
 * @Description 白名单员工
 * @Date 2022/8/16
 */
public class Solution1 {
    public static void main(String[] args) {
        String[] allArray = new String[]{"xiaoming", "xiaoliang", "wanger", "longda"};
        String[] blackArray = new String[]{"wanger", "xiaoming"};
        List<String> whitelist = whitelist(allArray, blackArray);
        System.out.println(whitelist);
    }

    public static List<String> whitelist(String[] allArray, String[] blackArray) {
        List<String> results = new LinkedList<>();
        for (String s : allArray) {
            results.add(s);
        }
        for (String s : blackArray) {
            for (int i = 0; i < results.size(); i++) {
                if (s.equalsIgnoreCase(blackArray[i])) {
                    results.remove(i);
                    break;
                }
            }
        }
        return results;
    }
}
