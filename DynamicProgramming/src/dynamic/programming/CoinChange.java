package dynamic.programming;

/**
 * 
 * @author annadelprete
 * 
 * Suppose there are 5 types of coins: 50-cent, 25-cent, 10-cent, 5-cent, and 1-cent. We want to make changes with these coins for a given amount of money.
 * For example, if we have 11 cents, then we can make changes with one 10-cent coin and one 1-cent coin, two 5-cent coins and one 1-cent coin, one 5-cent coin and six 1-cent coins, or eleven 1-cent coins. So there are four ways of making changes for 11 cents with the above coins. Note that we count that there is one way of making change for zero cent
 * 
 * Write a program to find the total number of different ways of making changes for any amount of money in cents. Your program should be able to handle up to 7489 cents.
 *
 */

public class CoinChange {

	
	public int findCombinationsCount(int sum, int vals[]) {
        if (sum < 0) {
            return 0;
        }
        if (vals == null || vals.length == 0) {
            return 0;
        }

        int dp[] = new int[sum + 1];
        dp[0] = 1;
        for (int i = 0; i < vals.length; ++i) {
            for (int j = vals[i]; j <= sum; ++j) {
                dp[j] =dp[j] + dp[j - vals[i]];
            }
        }

        return dp[sum];
    }

}
