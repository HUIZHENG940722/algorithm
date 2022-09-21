package com.ethan.algorithm.niuke.huawei;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/**
 * @Author zhenghui
 * @Description 计算日期到天数的转换
 * @Date 2022/9/21
 */
public class HJ73 {

    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            // 输入日期
            String year_m_r = sc.nextLine().trim();
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy MM dd");
            Date date = sdf.parse(year_m_r);
            Calendar cal = Calendar.getInstance();
            cal.setTime(date);
            System.out.println(cal.get(Calendar.DAY_OF_YEAR));
        }
    }
}
