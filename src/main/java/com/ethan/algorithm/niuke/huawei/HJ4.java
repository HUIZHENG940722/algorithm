package com.ethan.algorithm.niuke.huawei;

import java.util.Scanner;

/**
 * @Author zWX1058539
 * @Description 字符串分隔
 * @Date 2022/7/20
 */
public class HJ4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String str = sc.nextLine().trim();
            int len = str.length();
            for (int i = 0; i < len; i = i + 8) {
                if (len - i >= 8) {
                    System.out.println(str.substring(i, i + 8));
                } else {
                    String data = str.substring(i);
                    StringBuilder sb = new StringBuilder();
                    for (int j = 0; j < 8; j++) {
                        if (j < data.length()) {
                            sb.append(data.charAt(j));
                        } else {
                            sb.append(0);
                        }
                    }
                    System.out.println(sb);
                }
            }
        }
    }
}
