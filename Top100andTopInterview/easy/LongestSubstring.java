package Top100andTopInterview.easy;

public class LongestSubstring {
    public static void main(String[] args) {
        LongestSubstring ls = new LongestSubstring();
        System.out.println(ls.lengthOfLongestSubstring("babad"));
    }

    public int lengthOfLongestSubstring(String s) {
        String[] list = new String[s.length()];
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            for (int k = i; k < s.length(); k++) {
                if (!stringBuilder.toString().contains(String.valueOf(s.charAt(k)))) {
                    stringBuilder.append(s.charAt(k));
                } else {
                    break;
                }
            }
            list[i] = String.valueOf(stringBuilder);
            stringBuilder = new StringBuilder();
        }
        int max = 0;
        for (String value : list) {
            System.out.println(value);
            if (max < value.length()) {
                max = value.length();
            }
        }
        return max;
    }

}
