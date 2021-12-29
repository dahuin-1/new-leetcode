package AnotherProblems;

import java.util.ArrayList;

public class PalindromicSubstrings {
    ArrayList<String> arrayList = new ArrayList<>();

    public static void main(String[] args) {
        PalindromicSubstrings ps = new PalindromicSubstrings();
        System.out.println(ps.countSubstrings("abc"));
    }

    public int countSubstrings(String s) {

        for (int i = 0; i < s.length(); i++){
            //ex) aba
            getLongestPalindrome(s, i, i);
            //ex) abba
           getLongestPalindrome(s, i, i+1);
        }
        int result = arrayList.size();
        return result;
    }

    private void getLongestPalindrome(String s, int l, int r) {
        while (l >= 0 && r < s.length() && s.charAt(l) == s.charAt(r)) {
            l = l - 1;
            r = r + 1;
            arrayList.add(s.substring(l + 1, r));
        }
    }


}
