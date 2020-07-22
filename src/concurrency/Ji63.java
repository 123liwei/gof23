package concurrency;

public class Ji63 {

    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};
        int res = maxProfit(prices);
        System.out.println(res);
    }

    public static int maxProfit(int[] prices) {
        int cost = Integer.MAX_VALUE;
        int res = 0;
        for(int price:prices){
            cost = Math.min(cost,price);
            res = Math.max(res,price-cost);
        }
        return res;
    }
}
