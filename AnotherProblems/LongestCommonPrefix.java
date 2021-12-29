package AnotherProblems;

public class LongestCommonPrefix {

    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) return "";
        String pre = strs[0]; //flower
        for (int i = 1; i < strs.length; i++) //flow,flight
            while(!strs[i].startsWith(pre)) //flow.startswith(flower)
                pre = pre.substring(0,pre.length()-1); //
        return pre;
    }
}
