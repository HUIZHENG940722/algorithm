package com.ethan.algorithm.niuke.huawei;

import java.util.Scanner;

/**
 * @Author zWX1058539
 * @Description 计算某字符出现次数
 * @Date 2022/7/20
 */
public class HJ2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String str = sc.nextLine().toLowerCase();
            char c = sc.nextLine().toLowerCase().charAt(0);
            int len = str.length();
            int result = 0;
            for (int i = 0; i < len; i++) {
                if (str.charAt(i) == c) {
                    result++;
                }
            }
            System.out.println(result);
        }
    }
}
