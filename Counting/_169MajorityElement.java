package Counting;

/**
 * @Author: mianmiantea2019
 * @Date: 2023-05-22
 * @LastEditors: mianmiantea2019
 * @Description:
 */

//The premise of the Boyer-Moore Voting Algorithm is that it assumes the majority element always exists in the array.
public class _169MajorityElement {
    public int majorityElement(int[] nums) {
        int majority = nums[0];  
        int count = 1;  

        for (int i = 1; i < nums.length; i++) {
            if (count == 0) {
                majority = nums[i];  
                count = 1;  
            } else if (nums[i] == majority) {
                count++;  
            } else {
                count--;  
            }
        }

        return majority;  
    }
}
