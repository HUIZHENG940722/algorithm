package com.ethan.algorithm.niuke.huawei;

import java.util.Scanner;

/**
 * @Author zWX1058539
 * @Description 取近似值
 * @Date 2022/7/20
 */
public class HJ7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            float f = sc.nextFloat();
            System.out.println(Math.round(f));
        }
    }
}
