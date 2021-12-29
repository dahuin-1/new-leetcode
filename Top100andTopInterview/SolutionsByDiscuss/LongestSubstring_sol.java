package Top100andTopInterview.SolutionsByDiscuss;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstring_sol {

    public static void main(String[] args) {
        LongestSubstring_sol lss = new LongestSubstring_sol();
        lss.lengthOfLongestSubstring("pwwkew");
    }

    public int lengthOfLongestSubstring(String s) {
        int i = 0, j = 0, max = 0;
        Set<Character> set = new HashSet<>();
        while (j < s.length()) {
            if (!set.contains(s.charAt(j))) {
                set.add(s.charAt(j++));
                max = Math.max(max, set.size());
            } else {
                set.remove(s.charAt(i++));
            }
        }
        return max;
    }
}
