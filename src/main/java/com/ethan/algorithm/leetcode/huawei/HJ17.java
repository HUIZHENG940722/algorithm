package com.ethan.algorithm.leetcode.huawei;

import java.util.*;

/**
 * @Author zhenghui
 * @Description 电话号码的字母组合
 * @Date 2022/8/2
 */
public class HJ17 {
    static Map<Character, List<Character>> meta = new HashMap<>();

    static {
        meta.put('2', List.of('a', 'b', 'c'));
        meta.put('3', List.of('d', 'e', 'f'));
        meta.put('4', List.of('g', 'h', 'i'));
        meta.put('5', List.of('j', 'k', 'l'));
        meta.put('6', List.of('m', 'n', 'o'));
        meta.put('7', List.of('p', 'q', 'r', 's'));
        meta.put('8', List.of('t', 'u', 'v'));
        meta.put('9', List.of('w', 'x', 'y', 'z'));
    }


    public List<String> letterCombinations(String digits) {
        char[] chars = digits.toCharArray();
        StringBuilder sb = new StringBuilder();

        List<String> results = new ArrayList<>();
        if (digits == null || chars.length == 0) {
            return results;
        }
        letterCombinations(chars, 0, sb, results);
        return results;
    }

    public void letterCombinations(char[] chars, int index, StringBuilder result, List<String> results) {
        if (index == chars.length) {
            results.add(result.toString());
        } else {
            char aChar = chars[index];
            List<Character> characters = meta.get(aChar);
            for (Character character : characters) {
                result.append(character);
                letterCombinations(chars, index + 1, result, results);
                result.deleteCharAt(index);
            }
        }
    }
}
