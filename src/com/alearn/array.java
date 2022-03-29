package com.alearn;

import sun.management.resources.agent;

/**
 * @author lu.cheng01@hand-china.com
 * @description
 * @date 2022/3/22 17:01
 * @version:1.0
 */
public class array {

    public static void main(String[] args) {
        int[] array = {1,1, 2,3,3, 3, 5};
        System.out.println(removeDuplicates(array));
    }

    /**
     * 删除排序数组中的重复项
     *
     * @param nums
     * @return
     */
    public static int removeDuplicates(int[] nums) {
        int p = 0;
        int q = 0;
        int num;
        if (nums != null && nums.length > 0) {
            while (p < nums.length) {
                if (nums[q] != nums[p]) {
                    if (p - q > 1) {
                        num = nums[q + 1];
                        nums[q + 1] = nums[p];
                        nums[p] = num;
                    }
                    q++;
                    p++;
                } else {
                    p++;
                }
            }
        }
        return q+1;
    }
}
