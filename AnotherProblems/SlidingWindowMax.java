package AnotherProblems;

public class SlidingWindowMax {
    public static void main(String[] args) {
        int[] a = {2,1,3,4,6,3,8,9,10};
        SlidingWindowMax slidingWindowMax = new SlidingWindowMax();
        slidingWindowMax.maxSlidingWindow(a,4);
    }
    public int[] maxSlidingWindow(int[] nums, int k) {
        final int[] left = new int[nums.length];
        final int[] right = new int[nums.length];

        left[0] = nums[0];
        right[nums.length - 1] = nums[nums.length - 1];

        for(int i = 1; i < nums.length; i++) {
            left[i] = (i % k) == 0 ? nums[i] : Math.max(nums[i], left[i-1]);

            final int j = nums.length - i - 1;
            right[j] = (j % k) == 0 ? nums[i] : Math.max(nums[j], right[j+1]);
        }

        int[] slidingWindow = new int[nums.length - k + 1];
        for (int i = 0, j = 0; i + k <= nums.length; i++) {
            slidingWindow[j++] = Math.max(right[i], left[i + k - 1]);
        }

        return slidingWindow;
    }
}
