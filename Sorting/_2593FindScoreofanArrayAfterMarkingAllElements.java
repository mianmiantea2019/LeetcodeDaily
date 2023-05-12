package Sorting;
import java.util.Arrays;

/**
 * @Author: mianmiantea2019
 * @Date: 2023-05-11
 * @LastEditors: mianmiantea2019
 * @Description:
 */
public class _2593FindScoreofanArrayAfterMarkingAllElements {
        public long findScore(int[] nums) {
            int n = nums.length;
            Integer[] ids = new Integer[n];
            for (int i = 0; i < n; ++i) ids[i] = i;

          Arrays.sort(ids, (Integer i, Integer j) -> nums[i] - nums[j]);
            long ans = 0;
            boolean[] vis = new boolean[n + 2]; 
            for (int i : ids)
                if (!vis[i + 1]) { 
                    System.out.println(vis[i + 1]);

                    vis[i] = vis[i + 2] = true;
                    ans += nums[i];
                }
            return ans;
    }
}
