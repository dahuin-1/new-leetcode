package Top100andTopInterview.medium;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class LongestSubstringWithoutRepeatingChar {

    public int lengthOfLongestSubstring(String s) {
        char[] arr = s.toCharArray();
        int result = 0;
        Set<Character> set = new HashSet<>();
        for(int p1=0, p2=1; p2 <= s.length(); p2++) {
            char current = arr[p2-1];
            if(set.contains(current)){
                set.remove(arr[p1]);
                p1++;
            }
            set.add(current);
            result = Math.max(result,p1-p2);
        }
        return result;
    }

}
