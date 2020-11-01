package com.brave.solid.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author caoshaojun
 * @version 1.0.0
 * @Description 三数之和
 * @createTime 2020年11月01日 23:59:00
 */
public class ThreeSum {
    public static void main(String[] args) {
        int[] num = new int[]{-1, 0, 1, 2, -1, -4};
        List<List<Integer>> re = solution(num);
    }

    public static List<List<Integer>> solution(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            // 第一个数都大于零，直接退出
            if (nums[i] > 0) {
                break;
            }
            // 避免重复的数字
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            int j = nums.length - 1;
            int target = 0 - nums[i];
            int k = i + 1;
            while (k < j) {
                if (nums[k] + nums[j] == target) {
                    List<Integer> item = Arrays.asList(nums[i], nums[k], nums[j]);
                    result.add(item);
                    while (k < j && nums[k] == nums[k + 1]) {
                        k++;
                    }
                    while (k < j && nums[j] == nums[j - 1]) {
                        j--;
                    }
                    k++;
                    j--;
                } else if (nums[k] + nums[j] < target) {
                    k++;
                } else {
                    j--;
                }
            }
        }
        return result;
    }
}
