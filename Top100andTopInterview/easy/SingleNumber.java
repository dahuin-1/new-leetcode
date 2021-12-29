package Top100andTopInterview.easy;

import java.util.HashMap;

public class SingleNumber {
    public static void main(String[] args) {
        SingleNumber singleNumber = new SingleNumber();
        int[] nums = {4,1,2,1,2};
        int result = singleNumber.singleNumber(nums);
        System.out.println(result);
    }
    public int singleNumber(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int num : nums){
           if(map.containsKey(num)){
               map.remove(map.get(num));
           }else {
               map.put(num, num);
           }
        }
        return (int)map.values().toArray()[0];
    }
}
