package Top100andTopInterview.medium;

import java.util.LinkedList;
import java.util.List;

public class LetterCombinationsOfAPhoneNum {

    public static void main(String[] args) {
        LetterCombinationsOfAPhoneNum lca = new LetterCombinationsOfAPhoneNum();
        System.out.println(lca.letterCombinations("23"));
    }
    public List<String> letterCombinations(String digits) {
        List<String> list = new LinkedList<>();
        if(digits == null || digits.length() == 0){
            return list;
        }
        list.add("");
        char[][] map = {{},{},{'a','b','c'},{'d','e','f'},{'g','h','i'},{'j','k','l'},{'m','n','o'},{'p','q','r','s'},{'t','u','v'},{'w','x','y','z'}};
        for(int i = 0 ; i < digits.length(); i++){
            List<String> nextList = new LinkedList<>();
            int num = digits.charAt(i) - '0';
            for(String s : list) {
                for(int k = 0; k < map[num].length; k++) {
                    nextList.add(s+map[num][k]);
                }
            }
            list = nextList;
        }
        return list;
    }
}
