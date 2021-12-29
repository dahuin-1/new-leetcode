package Top100andTopInterview.medium;

import java.util.ArrayList;
import java.util.List;

public class Subsets {

    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> resultList = new ArrayList<>();
        backtracking(resultList, new ArrayList<>(), nums, 0);
        return resultList;
    }

    private void backtracking(List<List<Integer>> resultList, List<Integer> tempList, int[] nums, int start) {

            resultList.add(new ArrayList<>(tempList));

        for (int i = start; i < nums.length; i++) {
            tempList.add(nums[i]);
            backtracking(resultList, tempList, nums, start + 1);
            tempList.remove(tempList.size()-1);
        }
    }

}



