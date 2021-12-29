package Top100andTopInterview.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SearchInRotatedSortedArray {
    public static void main(String[] args) {
        SearchInRotatedSortedArray searchInRotatedSortedArray = new SearchInRotatedSortedArray();
        int[] nums = {1,3};
        System.out.println(searchInRotatedSortedArray.search(nums, 1));
    }

    public int search(int[] nums, int target) {
        int length = nums.length;
        String newStr = "";
        for (int i = target; i < length; i++) {
            newStr += nums[i];
        }
        for (int num : nums) {
            if (newStr.length() != length) {
                newStr += num;
            } else {
                break;
            }
        }
        return newStr.indexOf(String.valueOf(target));
    }
}
//왜 틀렸지...?
//[1,3], 3 은 1출력 아닌가..? 왜 0이지