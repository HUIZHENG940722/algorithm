package com.ethan.algorithm.niuke.huawei;

import java.util.Scanner;

/**
 * @Author zWX1058539
 * @Description 质数因子
 * @Date 2022/7/20
 */
public class HJ6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int i = sc.nextInt();
            int y = 2;
            while (i >= y * y) {
                if (i % y == 0) {
                    System.out.print(y + " ");
                    i /= y;
                } else {
                    y++;
                }
            }
            if (i >= 2) {
                System.out.print(i + " ");
            }
        }
    }
}
