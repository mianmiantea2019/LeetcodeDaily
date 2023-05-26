package Stack;

/**
 * @Author: mianmiantea2019
 * @Date: 2023-05-25
 * @LastEditors: mianmiantea2019
 * @Description:
 */
public class _227BasicCalculatorII {
    public int calculate(String s) {
        int sum = 0;
        int tempSum = 0;
        int num = 0;
        char lastSign = '+';

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (Character.isDigit(c))
                num = num * 10 + c - '0';

            if (i == s.length() - 1 || !Character.isDigit(c) && c != ' ') {
                if (lastSign == '+') {
                    sum += tempSum;
                    tempSum = num;
                } else if (lastSign == '-') {
                    sum += tempSum;
                    tempSum = -num;
                } else if (lastSign == '*') {
                    tempSum *= num;
                } else if (lastSign == '/') {
                    tempSum /= num;
                }

                lastSign = c;
                num = 0;
            }
        }
        sum += tempSum;
        return sum;
    }
}
