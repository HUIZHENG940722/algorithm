package com.ethan.algorithm.niuke.huawei;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * @Author zWX1058539
 * @Description 字符个数统计
 * @Date 2022/7/20
 */
public class HJ10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String str = sc.nextLine().trim();
            int len = str.length();
            Set<Character> result = new HashSet<>();
            for (int i = 0; i < len; i++) {
                result.add(str.charAt(i));
            }
            System.out.println(result.size());
        }
    }
}
