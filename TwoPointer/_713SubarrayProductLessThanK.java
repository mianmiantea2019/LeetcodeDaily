package TwoPointer;

/**
 * @Author: mianmiantea2019
 * @Date: 2023-07-12
 * @LastEditors: mianmiantea2019
 * @Description: https://leetcode.com/problems/subarray-product-less-than-k/description/
 */

public class _713SubarrayProductLessThanK {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int ans = 0;
        int right = 0;
        int left = 0;
        int product = 1;

        while (right < nums.length) {
            product = product * nums[right];
            while (product >= k && left <= right) {
                product /= nums[left];
                left++;
            }
            ans += right - left + 1;
            right++;
        }
        return ans;
    }
}
