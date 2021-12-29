package Top100andTopInterview.medium;

import java.util.ArrayList;
import java.util.List;
//34번문제
public class FindFirstLastPositionElementSortedArray {
    public static void main(String[] args) {
        FindFirstLastPositionElementSortedArray fflp = new FindFirstLastPositionElementSortedArray();
        int[] nums = {5, 7, 7, 8, 8, 10};
        int[] result = fflp.searchRange(nums, 6);
        System.out.println("----------------------------------");
        if (result != null) {
            for (int i = 0; i < result.length; i++) {
                System.out.println(result[i]);
            }
        }
    }

    public int[] searchRange(int[] nums, int target) {
        int[] result = new int[2];
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                list.add(i);
                if (list.size() > 2) {
                    list.remove(1);
                    list.add(i);
                }
            }
        }
        if (list.isEmpty()) {
            list.add(-1);
            list.add(-1);
        }
        if (list.size() == 1) {
            list.add(list.get(0));
        }
        result[0] = list.get(0);
        result[1] = list.get(list.size() - 1);
        return result;
    }
}
