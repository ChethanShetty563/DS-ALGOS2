package Arrays;

public class StocckBuyandSell {

//    Time Complexity O(n)
//    Auxillary spaceO(1)
    public static int maxProfit(int price[], int n) {

        int profit = 0;

        for(int i=1;i<n;i++) {
            if(price[i] > price[i - 1]) {
                profit += price[i] - price[i-1];
            }
        }
        return profit;
    }

//    Time Complexity O(n^2)
//    Auxillary spaceO(1)
static int maxProfit(int price[], int start, int end)
{

    // If the stocks can't be bought
    if (end <= start)
        return 0;

    // Initialise the profit
    int profit = 0;

    // The day at which the stock
    // must be bought
    for (int i = start; i < end; i++) {

        // The day at which the
        // stock must be sold
        for (int j = i + 1; j <= end; j++) {

            // If buying the stock at ith day and
            // selling it at jth day is profitable
            if (price[j] > price[i]) {

                // Update the current profit
                int curr_profit
                        = price[j] - price[i]
                        + maxProfit(price, start, i - 1)
                        + maxProfit(price, j + 1, end);

                // Update the maximum profit so far
                profit = Math.max(profit, curr_profit);
            }
        }
    }
    return profit;
}



    public static void main(String args[])
    {
        int arr[] = {1, 5, 3, 8, 12}, n = 5;

        System.out.println(maxProfit(arr, n));

    }

}
