package com.ethan.algorithm.leetcode.test;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] tmp = new int[m];
        for (int i = 0; i < m; i++) {
            tmp[i] = nums1[i];
        }
        int i1 = 0, i2 = 0;
        for (int i = 0; i < m + n; i++) {
            if (i1 >= m && i2 < n) {
                nums1[i] = nums2[i2];
                i2++;
            } else if (i2 >= n && i1 < m) {
                nums1[i] = tmp[i1];
                i1++;
            } else {
                if (tmp[i1] <= nums2[i2]) {
                    nums1[i] = tmp[i1];
                    i1++;
                } else {
                    nums1[i] = nums2[i2];
                    i2++;
                }
            }
        }
    }

    public List<String> binaryTreePaths(TreeNode root) {
        if (root == null) {
            return null;
        }
        return binaryTreePaths("", root);
    }

    private List<String> binaryTreePaths(String str, TreeNode root) {
        List<String> results = new ArrayList<>();
        if (root == null) {
            return null;
        } else if (root.left == null && root.right == null) {
            results.add(str + "->" + root.val);
            return results;
        } else {
            results.addAll(binaryTreePaths(str + "->" + root.val, root.left));
            results.addAll(binaryTreePaths(str + "->" + root.val, root.right));
            return results;
        }
    }


    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
}