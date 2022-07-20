package com.ethan.algorithm.niuke.huawei;

import java.util.Scanner;

/**
 * @Author zWX1058539
 * @Description 进制转换
 * @Date 2022/7/20
 */
public class HJ5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String data = sc.nextLine();
            int i = Integer.parseInt(data.substring(2), 16);
            System.out.println(i);
        }
    }
}
