package Top100andTopInterview.easy;

public class moveZeroes {
    public static void main(String[] args) {
        moveZeroes moveZeroes = new moveZeroes();
        int[] a = {0, 1, 0, 3, 2};
        moveZeroes.moveZeroes(a);
    }

    public void moveZeroes(int[] nums) {
        int box = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 0) {
                box++;
            }
            else if(box > 0) {
                int temp = nums[i];
                nums[i] = 0;
                nums[i - box] = temp;
            }
        }
    }
}
