package DFS;

/**
 * @Author: mianmiantea2019
 * @Date: 2023-05-05 8:42 AM
 * @LastEditors: mianmiantea2019
 * @Description:
 */


import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;

class _17LetterCombinationsofaPhoneNumber {
        private char[][] lettersArray = {
            {'a', 'b', 'c'}, {'d', 'e', 'f'}, {'g', 'h', 'i'},
            {'j', 'k', 'l'}, {'m', 'n', 'o'}, {'p', 'q', 'r', 's'},
            {'t', 'u', 'v'}, {'w', 'x', 'y', 'z'}
    };
    private char[] chars;
    private char[] string;
    private static List<String> list;

    public List<String> letterCombinations(String digits) {
        if (digits == null) return null;
        list = new ArrayList<>();
        chars = digits.toCharArray();
        if (chars.length == 0) return list;
        string = new char[chars.length];
        dfs(0);
        return list;
    }

    private void dfs(int idx) {
        if (idx == chars.length) {
            list.add(new String(string));
            return;
        }

        char[] letters = lettersArray[chars[idx] - '2'];
        for (char letter : letters) {
            string[idx] = letter;
            dfs(idx + 1);
        }
    }
        public static void main(String[] args) {
            _17LetterCombinationsofaPhoneNumber solution = new _17LetterCombinationsofaPhoneNumber();
            solution.letterCombinations("96");
            System.out.println(Arrays.toString(list.toArray()));
    }
}
