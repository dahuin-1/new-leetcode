package AnotherProblems;

public class PalindromeNumber {

    public static void main(String[] args) {
        PalindromeNumber palindromeNumber = new PalindromeNumber();
        boolean re = palindromeNumber.isPalindrome(313);
        System.out.println(re);
    }

    public boolean isPalindrome(int x) {
        int temp = x;
        if (temp < 0) return false;
        int rev = 0;
        while (x != 0) {
            int pop = x % 10;
            x /= 10;
            if (rev > Integer.MAX_VALUE / 10 || (rev == Integer.MAX_VALUE / 10 && pop > 7)) return false;
            if (rev < Integer.MIN_VALUE / 10) return false;
            rev = rev * 10 + pop;
        }
       // System.out.println("rev : "+rev);
       // System.out.println("x : "+x);
       // System.out.println("temp :"+temp);
        return temp == rev;
    }
}
