package dynamicProgramming;

/**
 * @Author: mianmiantea2019
 * @Date: 2023-05-05 7:35 AM
 * @LastEditors: mianmiantea2019
 * @Description:
 */
import java.util.*;

public class _22GenerateParentheses {
    public List<String> generateParenthesis(int n) {
      List<String> ans = new ArrayList<>(); 
      if (n < 0) return ans;
      dfs(0, n, n, new char[n << 1], ans);
      return ans;

    }
      private void dfs( int idx, int leftRemain, int rightRemain, char[] string, List<String> ans) {
        if (idx == string.length){ 
            ans.add(new String(string));
            return;
        }
        if (leftRemain > 0){
            string[idx] = '(';
            dfs(idx+1, leftRemain - 1, rightRemain, string, ans);
        }
        if (rightRemain > 0 && leftRemain != rightRemain){
            string[idx] = ')';
            dfs(idx+1, leftRemain, rightRemain-1, string, ans);
        }
      }
      
    public static void main(String[] args) {
        _22GenerateParentheses o = new _22GenerateParentheses();
        System.out.println(o.generateParenthesis(3));
    }
    }

