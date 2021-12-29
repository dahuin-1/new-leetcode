package AnotherProblems;

public class LongestPalindromicSubstring {

    public static void main(String[] args) {
        LongestPalindromicSubstring lps = new LongestPalindromicSubstring();
       System.out.println(lps.longestPalindrome("ccc"));
    }

    public String longestPalindrome(String s) {
        String result = "", temp = "";

        if(s.length() < 2){
            return s;
        }

        for (int i = 0; i < s.length(); i++){
            //ex) aba
            temp = getLongestPalindrome(s, i, i);
            if (result.length() < temp.length()) {
                result = temp;
            }
            //ex) abba
            temp = getLongestPalindrome(s, i, i+1);
            if (result.length() < temp.length()) {
                result = temp;
            }
        }
        return result;
    }

    private String getLongestPalindrome(String s, int l, int r) {
        while (l >= 0 && r < s.length() && s.charAt(l) == s.charAt(r)) {
            l = l - 1;
            r = r + 1;
            //if(l < 0 || r > s.length()) {
             //   return "";
           // }
        }
        return s.substring(l+1,r);
    }

}
