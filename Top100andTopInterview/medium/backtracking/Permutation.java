package Top100andTopInterview.medium.backtracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Permutation {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> returnList = new ArrayList<>();
        Arrays.sort(nums);
        backtrack(returnList, new ArrayList<>(), nums);
        return returnList;
    }

    private void backtrack(List<List<Integer>> returnList, List<Integer> tempList, int[] nums) {
        if (tempList.size() == nums.length) { //내부 리스트 사이즈가 주어진 배열의 길이와 같으면 ex) 주어진 배열 [1,2,3] 내부리스트 [2,1,3]
            returnList.add(new ArrayList<>(tempList)); //리턴리스트에 내부 리스트를 넣음
        } else {
            for (int i = 0; i < nums.length; i++) { //포문을 돈다
                if (tempList.contains(nums[i])) continue; //만약에 내부리스트가 이 숫자를 포함하면 스킵
                tempList.add(nums[i]); //내부리스트에 숫자 넣고
                backtrack(returnList, tempList, nums); //다시 리턴리스트, 내부리스트, 주어진 배열을 가지고 백트래킹
                tempList.remove(tempList.size() - 1); //내부리스트에서 마지막 부터 값 삭제
            }
        }
    }


}
