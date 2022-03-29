package com.alearn;

/**
 * @author lu.cheng01@hand-china.com
 * @description 给定一个数组 prices ，其中prices[i] 表示股票第 i 天的价格。
 * <p>
 * 在每一天，你可能会决定购买和/或出售股票。你在任何时候最多只能持有 一股 股票。你也可以购买它，然后在 同一天 出售。
 * 返回 你能获得的 最大 利润。
 * <p>
 * 作者：力扣 (LeetCode)
 * 链接：https://leetcode-cn.com/leetbook/read/top-interview-questions-easy/x2zsx1/
 * 来源：力扣（LeetCode）
 * 著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
 * @date 2022/3/23 21:03
 * @version:1.0
 */
public class maxProfit {
    public static void main(String[] args) {
        int[] array = {1, 3, 4, 5};
        System.out.println(maxProfit(array));
    }

    public static int maxProfit(int[] prices) {
        int result = 0;
        int p = 0;
        if (prices != null && prices.length > 1) {
            while (p < prices.length - 1) {
                if (prices[p + 1] - prices[p] > 0) {
                    result += (prices[p + 1] - prices[p]);
                }
                p++;
            }
        }
        return result;
    }
}
