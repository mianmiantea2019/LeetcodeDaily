package Queue;

import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;

/**
 * @Author: mianmiantea2019
 * @Date: 2023-05-11
 * @LastEditors: mianmiantea2019
 * @Description:
 */
public class _2593FindScoreofanArrayAfterMarkingAllElements {
    public long findScore(int[] nums) {
        int n = nums.length;
        boolean[] visited = new boolean[n];
        PriorityQueue<int[]> q = new PriorityQueue<>((a, b) -> a[0] == b[0] ? a[1] - b[1] : a[0] - b[0]);
        for (int i = 0; i < n; ++i) {
            q.offer(new int[] {nums[i], i});
        }

        long ans = 0;
        while (!q.isEmpty()) {
            int[] p = q.poll();
            System.out.println(Arrays.toString(p));
            ans += p[0];
            visited[p[1]] = true;

            for (int j : List.of(p[1] - 1, p[1] + 1)) {
                if (j >= 0 && j < n) { 
                    visited[j] = true;
                }
            }
            while (!q.isEmpty() && visited[q.peek()[1]]) {
                q.poll();
            }
        }
        return ans;
    }
}
