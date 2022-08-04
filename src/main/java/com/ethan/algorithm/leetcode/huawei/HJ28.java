package com.ethan.algorithm.leetcode.huawei;

/**
 * @Author zhenghui
 * @Description 实现strStr()
 * @Date 2022/8/4
 */
public class HJ28 {
    public int strStr(String haystack, String needle) {
        if (needle==null || needle=="") {
            return 0;
        }
        int i = haystack.indexOf(needle);
        return i;
    }
}
