package com.ethan.algorithm.leetcode.test;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @Author zhenghui
 * @Description
 * @Date 2022/7/31
 */
public class Hello {

    public static void main(String[] args) {
        int[] s = new int[]{3, 2, 4, 1};
        ArrayList<ArrayList<Integer>> subsets = subsets(s);
        System.out.println(subsets);
    }

    public static ArrayList<ArrayList<Integer>> subsets(int[] s) {
        Arrays.sort(s);
        ArrayList<ArrayList<Integer>> results = new ArrayList<>();
        ArrayList<Integer> result = new ArrayList<>();
        subsets(s, 0, result, results);
        return results;
    }

    /**
     * @param s
     * @param i       递归层数
     * @param result
     * @param results
     */
    public static void subsets(int[] s, int i, ArrayList<Integer> result, ArrayList<ArrayList<Integer>> results) {
        if (s.length == i) {
            ArrayList<Integer> res = new ArrayList<>(result);
            results.add(res);
        } else {
            result.add(s[i]);
            subsets(s, i + 1, result, results);
            result.remove(result.size()-1);
            subsets(s, i + 1, result, results);
        }
    }

    public ArrayList<ArrayList<Integer>> subsets1(int[] S) {
        for (int i = 0; i < S.length - 1; i++) {
            for (int j = i; j < S.length; j++) {
                if (S[j] < S[i]) {
                    int temp = S[i];
                    S[i] = S[j];
                    S[j] = temp;
                }
            }
        }
        ArrayList<ArrayList<Integer>> result
            = new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> list0 = new
            ArrayList<Integer>();
        result.add(list0);
        for (int i = 0; i < S.length; i++) {
            int length = result.size();
            for (int j = 0; j < length; ++j) {
                if (result.get(j).size() == 0) {
                    ArrayList<Integer> arrayList = new
                        ArrayList<Integer>();
                    arrayList.add(S[i]);
                    result.add(arrayList);
                } else {
                    if (result.get(j).get(result.get(j).size() - 1) <= S[i]) {
                        ArrayList<Integer> arrayList = new
                            ArrayList<Integer>();
                        arrayList.addAll(result.get(j));
                        arrayList.add(S[i]);
                        result.add(arrayList);
                    }
                }
            }
        }
        return result;

    }
}
