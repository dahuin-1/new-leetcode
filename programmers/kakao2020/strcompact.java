package programmers.kakao2020;

import java.util.ArrayList;
import java.util.HashMap;

public class strcompact {

    public static void main(String[] args) {
        strcompact sc = new strcompact();
        sc.solution("aabbaccc");
    }

    public int solution(String s) {
        HashMap<String, Integer> map = new HashMap<>();
        String[] temps = s.split("");
        int num;
        for(String temp : temps) {
            if(map.containsKey(temp)){
                num = map.get(temp) + 1;
                map.put(temp, num);
            }else{
                map.put(temp, 1);
            }
        }
        for (int i = 0 ; i < map.size(); i++) {
            System.out.println(map.get(i));
        }
        Object[] list = map.values().toArray();
        for (int i = 0; i < list.length; i++) {
            //System.out.println(list[i]);
        }
        int answer = 0;
        return answer;
    }
}
