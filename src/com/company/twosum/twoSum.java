package com.company.twosum;

/**
 * @author lu.cheng01@hand-china.com
 * @description 给定一个整数数组 num 和一个整数目标值 target，请你在该数组中找出 和 为目标值 target  的那两个整数，并返回它们的数组下标。
 * <p>
 * 你可以假设每种输入只会对应一个答案。但是，数组中同一个元素在答案里不能重复出现。
 * <p>
 * 你可以按任意顺序返回答案。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/two-sum
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * @date 2022/3/22 15:12
 * @version:1.0
 */
public class twoSum {
    public static void main(String[] args) {
        System.out.println("test");
    }

    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    result[0] = i;
                    result[1] = j;
                    return result;
                }
            }
        }
        return result;
    }

    public int[] twoSum2(int[] nums, int target) {
        int[] result = new int[2];
        int mid = nums.length / 2;
        for (int i = 0; i < nums.length / 2; i++) {
            if (nums[i] + nums[i + mid] == target) {
                result[0] = i;
                result[1] = i + mid;
                return result;
            }else if(nums[i] + nums[i + mid] < target){

            }
        }
        return result;
    }

}
