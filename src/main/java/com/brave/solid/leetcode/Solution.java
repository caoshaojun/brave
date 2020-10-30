package com.brave.solid.leetcode;

import java.util.HashMap;

/**
 * @author caoshaojun
 * @version 1.0.0
 * @Description 两数之和，三数之和
 * @createTime 2020年10月29日 14:15:00
 */
public class Solution {
    public static void main(String[] args) {
        int[] nums = new int[]{2, 7, 11, 15};
        int[] re = twoSum(nums, 9);
        System.out.println("暴力破解-第一个数：" + re[0]);
        System.out.println("暴力破解-第二个数：" + re[1]);
        System.out.println();
        int[] re2 = twoSum(nums, 9);
        System.out.println("HASH-第一个数：" + re2[0]);
        System.out.println("HASH-第二个数：" + re2[1]);

    }

    /**
     * 两数之和 [暴力破解]
     * <p>
     * 给定 nums = [2, 7, 11, 15], target = 9
     * <p>
     * 因为 nums[0] + nums[1] = 2 + 7 = 9
     * 所以返回 [0, 1]
     *
     * @param nums
     * @param target
     * @return
     */
    public static int[] twoSum(int[] nums, int target) {
        if (nums.length == 0) {
            return null;
        }
        int[] result = new int[2];
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    result[0] = i;
                    result[1] = j;
                }
            }
        }
        return result;
    }

    /**
     * 两数之和HASH破解
     * @param nums
     * @param target
     * @return
     */
    public static int[] twoSumHash(int[] nums, int target){
        if(nums.length == 0){
            return null;
        }
        int[] result = new int[2];
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0;i<nums.length;i++){
            if(map.containsKey(target-nums[i])){
                result[0] = i;
                result[1] = map.get(target-nums[i]);
                return result;
            }
            map.put(nums[i],i);
        }
        return result;
    }


}
