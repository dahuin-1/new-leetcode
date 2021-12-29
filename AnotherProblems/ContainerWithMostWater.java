package AnotherProblems;

public class ContainerWithMostWater {

    public static void main(String[] args) {
        ContainerWithMostWater containerWithMostWater = new ContainerWithMostWater();
        int[] height = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        //[1,8,6,2,5,4,8,3,7]
        System.out.println(containerWithMostWater.maxArea(height));
    }


    public int maxArea(int[] height) {
        int result = 0;
        int max = 0;
        for (int i = 0; i < height.length - 1; i++) {
            int k = i + 1;
            while (k < height.length) {
                int left = height[i];
                int right = height[k];
                /*result = dp(left, right, k-i);
                if (max < result) {
                    max = result;
                }*/
                result = Math.max(dp(left, right, k-i), result);
                k++;
            }
        }
        return result;
    }

    public int dp(int left, int right, int num) {
        int y = Math.min(left, right);
        int x = num;
        return x * y;
    }

}
