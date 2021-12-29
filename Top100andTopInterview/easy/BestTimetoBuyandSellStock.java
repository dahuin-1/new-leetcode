package Top100andTopInterview.easy;

public class BestTimetoBuyandSellStock {
    public static void main(String[] args) {
        BestTimetoBuyandSellStock best = new BestTimetoBuyandSellStock();
        int[] prices = new int[]{5, 4, 3, 2, 1};
        System.out.println(best.maxProfit(prices));
    }

    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int min = Integer.MAX_VALUE;

        for (int price : prices) {
            if (price < min) {
                min = price;
            } else if (price > min) {
                maxProfit = Math.max(price - min, maxProfit);
            }
        }
        return maxProfit;
    }
}
