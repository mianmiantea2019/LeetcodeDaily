package HashTable;

import java.util.HashSet;
import java.util.Set;

/**
 * @Author: mianmiantea2019
 * @Date: 2023-06-20
 * @LastEditors: mianmiantea2019
 * @Description:
 */
public class _2442CountNumberofDistinctIntegersAfterReverseOperation {
    public int countDistinctIntegers(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
            set.add(reverse(num));
        }
        System.out.println(set);
        return set.size();
    }

    public int reverse(int num) {
        int result = 0;
        while (num > 0) {
            result = 10 * result + num % 10;
            num /= 10;
        }
        return result;
    }
}
