package Top100andTopInterview.SolutionsByDiscuss;

import java.util.Arrays;

public class MajorityElement_sol {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length / 2];
    }
}
