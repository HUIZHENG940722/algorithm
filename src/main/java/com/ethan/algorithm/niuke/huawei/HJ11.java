package com.ethan.algorithm.niuke.huawei;

import java.util.Scanner;

/**
 * @Author zWX1058539
 * @Description 数字颠倒
 * @Date 2022/7/20
 */
public class HJ11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String str = sc.nextLine().trim();
            StringBuilder sb = new StringBuilder(str).reverse();
            System.out.println(sb);
        }
    }
}
