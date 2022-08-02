package com.ethan.algorithm.leetcode.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * @Author zhenghui
 * @Description Java工程师模拟面试
 * @Date 2022/8/1
 */
public class Hello2 {
    public ArrayList<Interval> merge(ArrayList<Interval> intervals) {
        Collections.sort(intervals, new Comparator<Interval>() {
            @Override
            public int compare(Interval o1, Interval o2) {
                if (o1.start < o2.start) {
                    return -1;
                } else if (o1.start > o2.start) {
                    return 1;
                } else {
                    if (o1.end < o2.end) {
                        return -1;
                    } else if (o1.end > o2.end) {
                        return 1;
                    } else {
                        return 0;
                    }
                }
            }
        });
        ArrayList<Interval> results = new ArrayList<>();
        if (intervals.size() == 0) {
            return results;
        }
        Interval tmp = new Interval(intervals.get(0).start, intervals.get(0).end);
        for (int i = 1; i < intervals.size(); i++) {
            if (tmp.end < intervals.get(i).start) {
                results.add(tmp);
                tmp = intervals.get(i);
            } else if (tmp.end >= intervals.get(i).start) {
                tmp = new Interval(tmp.start, Math.max(intervals.get(i).end, tmp.end));
            }
        }
        results.add(tmp);
        return results;
    }


    public class Interval {
        int start;
        int end;

        Interval() {
            start = 0;
            end = 0;
        }

        Interval(int s, int e) {
            start = s;
            end = e;
        }
    }
}
