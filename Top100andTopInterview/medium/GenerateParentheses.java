package Top100andTopInterview.medium;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

//22번 문제
public class GenerateParentheses {
    public List<String> generateParenthesis(int n) {

        List<String> list = new ArrayList<>();
        backtrack(list, "", 0, 0, n);
        return list;
    }
    public void backtrack(List<String> list, String newString, int open, int close, int n) {
        if(newString.length() == n * 2) {
            list.add(newString);
        }
        if (open < n) {
            backtrack(list, newString + "(", open+1, close, n);
        }
        if (close < open) {
            backtrack(list, newString + ")", open, close+1, n);
        }
    }

}
