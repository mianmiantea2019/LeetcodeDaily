package Sorting;
import java.util.*;

/**
 * @Author: mianmiantea2019
 * @Date: 2023-05-10
 * @LastEditors: mianmiantea2019
 * @Description:
 */
public class _1387SortIntegersbyThePowerValue {
    public int getKth(int lo, int hi, int k) {
        Map<Integer, Integer> powerValues = new HashMap<>();
        for (int num = lo; num <= hi; num++) {
            powerValues.put(num, k(num));
        }
        List<Integer> sortedNums = new ArrayList<>(powerValues.keySet());
        Collections.sort(sortedNums, (a, b) -> {
            int powerDiff = powerValues.get(a) - powerValues.get(b);
            if (powerDiff == 0) {
                return a - b;
            }
            return powerDiff;
        });
        return sortedNums.get(k - 1);
    }

    public int k(int num) {
        int ans = 0;
        while (num != 1) {
            if ((num & 1) == 0) {
                num >>= 1;
            } else {
                num = num * 3 + 1;
            }
            ans++;
        }
        return ans;
    }
}
