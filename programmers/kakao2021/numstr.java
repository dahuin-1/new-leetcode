package programmers.kakao2021;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;

public class numstr {
    public static void main(String[] args) {
        numstr ns = new numstr();
        System.out.println(ns.solution("one4seveneight"));

    }
    public int solution(String s) {
        if(isNumeric(s)){
            return Integer.parseInt(s);
        }
     /*   HashMap<String, Integer> map = new HashMap<>();
        map.put("zero",0);
        map.put("one",1);
        map.put("three",3);
        map.put("four",4);
        map.put("five",5);
        map.put("six",6);
        map.put("seven",7);
        map.put("eight",8);
        map.put("nine",9); */

        while (!isNumeric(s)) {
            s = s.replace("zero", "0");
            s = s.replace("one", "1");
            s = s.replace("two", "2");
            s = s.replace("three", "3");
            s = s.replace("four", "4");
            s = s.replace("five", "5");
            s = s.replace("six", "6");
            s = s.replace("seven", "7");
            s = s.replace("eight", "8");
            s = s.replace("nine", "9");
        }
        int answer = Integer.parseInt(s);
        return answer;
    }
    public static boolean isNumeric(String maybeNumeric) {
        return maybeNumeric != null && maybeNumeric.matches("[0-9]+");
    }

}
