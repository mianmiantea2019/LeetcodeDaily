package scanLine;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

/**
 * @Author: mianmiantea2019
 * @Date: 2023-05-03 7:15 PM
 * @LastEditors: mianmiantea2019
 * @Description:
 */

public class _986intervalListIntersections {
    public int[][] intervalIntersection(int[][] firstList, int[][] secondList) {
        int f = 0;
        int s = 0;

        List<int[]> list = new ArrayList<>();

        while(f < firstList.length && s < secondList.length){
            int[] fa = firstList[f];
            int[] sa = secondList[s];

            int start = Math.max(fa[0], sa[0]);
            int end = Math.min(fa[1], sa[1]);

            if(start <= end)  list.add(new int[]{start, end});

            if(fa[1] <sa[1]) f++;
            else s++;
        }

        return list.toArray(new int[list.size()][]);
    }
}
