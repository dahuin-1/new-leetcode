package AnotherProblems;

import java.util.*;

public class DecodeWays {

    public static void main(String[] args) {
        DecodeWays decodeWays = new DecodeWays();
        decodeWays.numDecodings("226");
    }

    public int numDecodings(String s) {
        List<Integer> list;
        Stack<Integer> stack = new Stack();
        int x = 0;
        int y = 0;

        if(s.startsWith("0")){
            return 0;
        }
        for (int i = 0; i < s.length(); i++) {
            int num = Integer.parseInt(String.valueOf(s.charAt(i)));
            if (0 < num) {
                stack.push(num);
            } else if (num == 0 && !stack.empty()) {
                if (stack.peek() == 1 || stack.peek() == 2) {
                    stack.pop();
                    list = stack.subList(0,stack.size());
                    x = helper(list);
                    System.out.println("x"+x);
                    stack.clear();
                } else {
                    return 0;
                }
            }
         //   while (Integer.parseInt(temp.toString()) < 27) {

          //  }
            //System.out.println("here"+stack);
        }
       // System.out.println("here"+stack);
        list = stack.subList(0,stack.size());
        y = helper(list);
        System.out.println("y"+y);

      /*  String[] codes; //
        int count = 0;
        int frontOf0 = Integer.parseInt(String.valueOf(s.charAt(s.indexOf("0") - 1)));
        System.out.println(frontOf0);

        if (s.startsWith("0") || !isCover(frontOf0)) {
            System.out.println("here");
            return 0;
        } else {
            //int must = Integer.parseInt(s.substring(frontOf0, s.indexOf("0") + 1));
            String mustHaveStr = s.substring(s.indexOf("0") - 1, s.indexOf("0") + 1);
            System.out.println(mustHaveStr);

            codes = s.split(mustHaveStr);
            for (String code : codes) {
                if (code.contains("0")) {
                    //System.out.println(code + "0here");
                    isCover(code.indexOf("0") - 1);
                }
            }
            // System.out.println(codes);
            //Arrays.toString(s.split(String.valueOf(must))).charAt(i);


            System.out.println(Arrays.toString(codes));

            // System.out.println(must);

            //System.out.println(s.substring(0, s.indexOf("0") - 1));
            //System.out.println(s.substring(s.indexOf("0")+1, s.length()));*/
        System.out.println("return"+x*y);


        return x * y;
    }

    private int helper(List<Integer> list) {
        int count = 0;
        StringBuilder temp = new StringBuilder();
        for (int i = 0; i < list.size(); i++) {
            temp.append(list.get(i));
            count++;
            if (Integer.parseInt(temp.toString()) > 26) {
                count--;
            }
        }
        return count;
    }
}
