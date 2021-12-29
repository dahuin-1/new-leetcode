package Top100andTopInterview.medium;

public class LongestPalindromicSubstring {

    public String longestPalindrome(String s) {
        String result = "";
        String temp = "";
        if(s.length() < 2) {
            return s;
        }
        for (int i = 0; i < s.length(); i++) {
            temp = getLongestPalindrome(s, i, i); //length = 홀
            if(result.length() < temp.length()) {
                result = temp;
            }
            temp = getLongestPalindrome(s, i, i+1); //length = 짝
            if(result.length() < temp.length()) {
                result = temp;
            }
        }
        return result;
    }

    private String getLongestPalindrome(String s, int l, int r) {
        while (l >= 0 && r < s.length() && s.charAt(l) == s.charAt(r)) {
            l = l - 1;
            r = r + 1;
        }
        return s.substring(l+1, r);
    }
}
