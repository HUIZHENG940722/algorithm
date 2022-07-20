package com.ethan.algorithm.niuke.huawei;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @Author zWX1058539
 * @Description 明明德随机数
 * @Date 2022/7/20
 */
public class HJ3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int num = sc.nextInt();
            int[] data = new int[num];
            for (int i = 0; i < num; i++) {
                data[i] = sc.nextInt();
            }
            Arrays.sort(data);
            System.out.println(data[0]);
            for (int i = 1; i < data.length; i++) {
                if (data[i] != data[i - 1]) {
                    System.out.println(data[i]);
                }
            }
        }
    }
}
