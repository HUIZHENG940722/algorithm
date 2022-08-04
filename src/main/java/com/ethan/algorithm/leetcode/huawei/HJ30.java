package com.ethan.algorithm.leetcode.huawei;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @Author zhenghui
 * @Description 串联所有单词的子串
 * @Date 2022/8/4
 */
public class HJ30 {
    public static void main(String[] args) {
        String s = "wordgoodgoodgoodbestword";
        String[] words = new String[]{"word", "good", "best", "good"};
        List<Integer> substring = findSubstring(s, words);
        System.out.println(substring);
    }

    public static List<Integer> findSubstring(String s, String[] words) {
        List<String> result = new ArrayList<>();
        Set<Integer> results = new HashSet<>();
        findSubstring(s, words, 0, result, results);
        List<Integer> result2 = new ArrayList<>();
        for (Integer integer : results) {
            result2.add(integer);
        }
        return result2;
    }

    /**
     * 所有的单词组合的递归
     *
     * @param target
     * @param words
     * @param index
     * @param result
     * @param results
     */
    private static void findSubstring(String target, String[] words, int index, List<String> result, Set<Integer> results) {
        if (index == words.length) {
            StringBuilder sb = new StringBuilder();
            for (String s : result) {
                sb.append(s);
            }
            int j = 0;
            while (target.contains(sb.toString())) {
                int i = target.indexOf(sb.toString(), j);
                if (i > -1) {
                    results.add(i);
                    j = i + 1;
                } else {
                    break;
                }
            }
        } else {
            for (int j = index; j < words.length; j++) {
                String tmp = words[index];
                words[index] = words[j];
                words[j] = tmp;
                result.add(words[index]);
                findSubstring(target, words, index + 1, result, results);
                tmp = words[index];
                words[index] = words[j];
                words[j] = tmp;
                result.remove(result.size() - 1);
            }
        }
    }
}
