package com.ethan.algorithm.niuke.huawei;

import java.util.*;

/**
 * @Author zhenghui
 * @Description 成绩排序
 * @Date 2022/9/20
 */
public class HJ68 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            // 输入要排序的人的个数
            int num = Integer.parseInt(sc.nextLine());
            // 输入排序规则0表示降序；1表示升序。
            int orderBy = Integer.parseInt(sc.nextLine());
            // 输入每个人的名字和成绩
            List<String> list = new ArrayList<>();
            for (int i = 0; i < num; i++) {
                list.add(sc.nextLine().trim());
            }
            Collections.sort(list, new Comparator<String>() {
                @Override
                public int compare(String o1, String o2) {
                    return (Integer.parseInt(o2.trim().split("\\s+")[1])
                        - Integer.parseInt(o1.trim().split("\\s+")[1])) * (orderBy == 0 ? 1 : -1);
                }
            });
            list.forEach(value -> {
                System.out.println(value);
            });
        }
    }
}
