package Top100andTopInterview.easy;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        Map<Integer,Integer> map = new HashMap<>();
        //k,v get(k) -> v
        //value, index
        for (int i = 0; i < nums.length; i++) {
            int tempTarget = target - nums[i]; //key(=num)
            if(map.containsKey(tempTarget)){
                result[0] = i;
                result[1] = map.get(tempTarget); //index
            }
            map.put(i,nums[i]);
        }
        return result;
    }
}
