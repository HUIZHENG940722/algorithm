package com.ethan.algorithm.niuke.huawei;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * @Author zWX1058539
 * @Description 提取不重复德整数
 * @Date 2022/7/20
 */
public class HJ9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String str = sc.nextLine();
            char[] chars = str.toCharArray();
            int len = chars.length;
            Set<Character> result = new LinkedHashSet<>();
            for (int i = len - 1; i >= 0; i--) {
                result.add(chars[i]);
            }
            for (Character character : result) {
                System.out.print(character);
            }
            System.out.println();
        }
    }
}
