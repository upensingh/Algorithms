package Arrays;
/**
 * @author upendrasingh
 * Given a list of daily stock prices, find the maximum profit that can be made
 * by buying and selling a unit of that stock. 
 */
class BuySellStockOnce {
	public static void main(String[] args) {
	   int[] pr = {1,2,3,4,5,6};
		assert(maxProfit(pr)==5);
		
		int[] pr2 = {5,4,3,2,1};
		assert(maxProfit(pr2) == 0);
		
		int[] pr3 = {4,5,6,7,1,2,8,9};
		assert(maxProfit(pr3) == 8);
		
		int[] pr4 = null;
		assert(maxProfit(pr4) == 0);
		
		int[] pr5 = {4,3,6,8,2,20};
		assert(maxProfit(pr5) == 18);
	}

	public static int maxProfit(int[] prices) {
	   if(prices == null){
	      return 0;
	   }
		int minSoFar = prices[0];
		int maxProfit = 0;
		for(int e:prices) {
		   minSoFar = Math.min(minSoFar, e);
		   int thisProfit = e - minSoFar;
		   maxProfit = Math.max(maxProfit, thisProfit);
		}
		return maxProfit;
	}
}
