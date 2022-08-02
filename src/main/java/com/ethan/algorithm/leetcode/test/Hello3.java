package com.ethan.algorithm.leetcode.test;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @Author zhenghui
 * @Description
 * @Date 2022/8/1
 */
public class Hello3 {
    public int MoreThanHalfNum_Solution(int[] array) {
        Map<Integer, Integer> temp = new HashMap();
        for (int i : array) {
            if (temp.containsKey(i)) {
                temp.put(i, temp.get(i) + 1);
            } else {
                temp.put(i, 1);
            }
        }
        AtomicInteger result = new AtomicInteger(0);
        temp.forEach((key, value)-> {
            if (value>array.length/2) {
                result.set(key);
            }
        });
        return result.get();
    }
}
