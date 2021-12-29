package Top100andTopInterview.easy;

import java.util.Stack;

public class validParenthesesByStack {
    public static void main(String[] args) {
        validParenthesesByStack v = new validParenthesesByStack();

        System.out.println( v.isValid("([])"));
    }
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<Character>();
        for(char c : s.toCharArray()){
          if(c == '[')
              stack.push(']');
          else if(c == '{')
              stack.push('}');
          else if(c == '(')
              stack.push(')');
          else if(stack.isEmpty() || c != stack.pop())
              return false;
        }
        return stack.isEmpty();
    }
}
