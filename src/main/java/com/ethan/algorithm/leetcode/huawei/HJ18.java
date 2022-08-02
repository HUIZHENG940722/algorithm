package com.ethan.algorithm.leetcode.huawei;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Author zhenghui
 * @Description 四数之和
 * @Date 2022/8/2
 */
public class HJ18 {

    public static void main(String[] args) {
        int[] nums = new int[]{-5, -4, -3, -2, 1, 3, 3, 5};
        List<List<Integer>> lists = fourSum(nums, -11);
    }

    public static List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        List<List<Integer>> results = new ArrayList<>();
        int len = nums.length;
        for (int i1 = 0; i1 < len - 3; i1++) {
            if (nums[i1] >= 0 && nums[i1] + nums[i1] > target) {
                break;
            }
            if (i1 != 0 && nums[i1] == nums[i1 - 1]) {
                continue;
            }
            for (int i2 = i1 + 1; i2 < len - 2; i2++) {
                if (nums[i2] >= 0 && nums[i1] + nums[i2] + nums[i2] > target) {
                    break;
                }
                if (i1 + 1 != i2 && nums[i2] == nums[i2 - 1]) {
                    continue;
                }
                for (int i3 = i2 + 1; i3 < len - 1; i3++) {
                    if (nums[i3] >= 0 && nums[i1] + nums[i2] + nums[i3] + nums[i3] > target) {
                        break;
                    }
                    if (i2 + 1 != i3 && nums[i3] == nums[i3 - 1]) {
                        continue;
                    }
                    for (int i4 = i3 + 1; i4 < len; i4++) {
                        if (i3 + 1 != i4 && nums[i4] == nums[i4 - 1]) {
                            continue;
                        }
                        if (nums[i1] + nums[i2] + nums[i3] + nums[i4] == target) {
                            List<Integer> result = List.of(nums[i1], nums[i2], nums[i3], nums[i4]);
                            results.add(result);
                        } else if (nums[i4] >= 0 && nums[i1] + nums[i2] + nums[i3] + nums[i4] > target) {
                            break;
                        }
                    }
                }
            }
        }
        return results;
    }
}
