package com.ethan.algorithm.niuke.huawei;

import java.util.Comparator;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

/**
 * @Author zWX1058539
 * @Description 合并记录表
 * @Date 2022/7/20
 */
public class HJ8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<Integer, Integer> map;
        while (sc.hasNext()) {
            int num = Integer.parseInt(sc.nextLine().trim());
            int[] data = new int[num];
            map = new TreeMap<>(new Comparator<Integer>() {
                @Override
                public int compare(Integer o1, Integer o2) {
                    return o1 - o2;
                }
            });

            for (int i = 0; i < num; i++) {
                String key_value = sc.nextLine().trim();
                String[] split = key_value.split("\\s+");
                int key = Integer.parseInt(split[0]);
                int value = Integer.parseInt(split[1]);
                if (map.containsKey(key)) {
                    map.put(key, map.get(key) + value);
                } else {
                    map.put(key, value);
                }
            }
            for (Integer integer : map.keySet()) {
                System.out.println(integer + " " + map.get(integer));
            }
        }
    }
}
