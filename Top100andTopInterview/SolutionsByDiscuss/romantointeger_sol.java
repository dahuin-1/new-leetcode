package Top100andTopInterview.SolutionsByDiscuss;

import java.util.HashMap;
import java.util.Map;

public class romantointeger_sol {

    public int romanToInt(String s) {
        if (s == null || s.length() == 0)
            return -1;
        Map<Character,Integer> mapping = new HashMap<>();
        mapping.put('I',1);
        mapping.put('V',5);
        mapping.put('X',10);
        mapping.put('L',50);
        mapping.put('C',100);
        mapping.put('D',500);
        mapping.put('M',1000);

        //마지막값
        int num = mapping.get(s.charAt(s.length() -1));

        for(int i = s.length()-2; i >= 0; i--){
            if(mapping.get(s.charAt(i)) < mapping.get(s.charAt(i+1))){
                num = num - mapping.get(s.charAt(i));
            }
            else {
                num = num + mapping.get(s.charAt(i));
            }
        }
        return num;
    }
}




