package Top100andTopInterview.medium;

public class ContainerWithMostWater {
    public int maxArea(int[] height) {
        int length = height.length;
        int left = 0; int right = length-1;
        int result = 0;
        while (left < right) {
            for (int i = 0; i < length; i++) {
                result = Math.max(result, Math.min(height[right],height[left]) * (right - left));
                                                                     //세로     *     가로
            }
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }
        return result;
    }
}
