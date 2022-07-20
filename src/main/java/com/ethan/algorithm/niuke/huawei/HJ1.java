package com.ethan.algorithm.niuke.huawei;

import java.util.Scanner;

/**
 * @Author zWX1058539
 * @Description 字符串最后一个单词的长度
 * @Date 2022/7/20
 */
public class HJ1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String str = sc.nextLine();
            String[] split = str.trim().split("\\s+");
            System.out.println(split[split.length - 1].length());
        }
    }
}
