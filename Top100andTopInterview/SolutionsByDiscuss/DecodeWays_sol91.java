package Top100andTopInterview.SolutionsByDiscuss;

public class DecodeWays_sol91 {
    public static void main(String[] args) {
        DecodeWays_sol91 decodeWays = new DecodeWays_sol91();
        decodeWays.numDecodings("210206");
    }

    public int numDecodings(String s) {
        Integer[] list = new Integer[s.length()];
        return s.length() == 0 ? 0 : numDecodings(0, s, list);
    }

    private int numDecodings(int p, String s, Integer[] list) {
        //int n = s.length();
        if(p == s.length()) return 1;
        if(s.charAt(p) == '0') return 0;
        if(list[p] != null) return list[p];
        int res = numDecodings(p+1, s, list);

        if(p < s.length()-1 && (s.charAt(p) == '1'||s.charAt(p) == '2' && s.charAt(p+1) < '7'))
            res += numDecodings(p+2, s, list);

       // System.out.println(res);
        //System.out.println(mem[p]);
       // System.out.println(list[p] = res);

        return list[p] = res;
    }
}
