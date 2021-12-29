package Top100andTopInterview.easy;

import java.util.HashMap;
import java.util.Map;

/*
Given an array nums of size n, return the majority element.
The majority element is the element that appears more than ⌊n / 2⌋ times.
You may assume that the majority element always exists in the array.
 */

public class MajorityElement {
    Map<Integer, Integer> map = new HashMap<>();

    public static void main(String[] args) {
        int[] nums = {2, 2, 1, 1, 1, 2, 2};
        MajorityElement majorityElement = new MajorityElement();
        System.out.println(majorityElement.majorityElement(nums));
    }

    public int majorityElement(int[] nums) {
        int halfN = nums.length / 2;

        for (int num : nums) {
            if (map.containsKey(num)) {
                map.put(num, map.get(num) + 1);
            } else {
                map.put(num, 1);
            }
            if (map.get(num) > halfN) {
                return num;
            }
        }
        return 0;
    }
}
