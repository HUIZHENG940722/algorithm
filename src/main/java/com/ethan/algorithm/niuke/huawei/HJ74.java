package com.ethan.algorithm.niuke.huawei;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @Author zhenghui
 * @Description 参数解析
 * @Date 2022/9/21
 */
public class HJ74 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            // 输入参数命令
            String str = sc.nextLine().trim();
            List<String> list = new ArrayList<>();
            // 解析参数命令
            int len = str.length();
            for (int i = 0; i < len; i++) {
                if (str.charAt(i) == '"') {
                    int t = i;
                    i = i + 1;
                    while (i < len && str.charAt(i) != '"') {
                        i++;
                    }
                    list.add(str.substring(t + 1, i));
                } else if (str.charAt(i) != ' ') {
                    int t = i;
                    i = i + 1;
                    while (i < len && str.charAt(i) != ' ') {
                        i++;
                    }
                    list.add(str.substring(t, i));
                }
            }
            System.out.println(list.size());
            for (String s : list) {
                System.out.println(s);
            }
        }
    }
}
