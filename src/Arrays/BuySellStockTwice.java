package Arrays;
/**
 * @author upendrasingh
 * Find the maximum profit that can be made by buying and selling
 * a single unit of a stock atmost twice, the second buy must be made after
 * first sale.
 */
class BuySellStockTwice {
	public static void main(String[] args) {
	   double[] pr = {12,11,13,9,12,8,14,13,15};
	   assert(maxProfit(pr) == 10);
	}

	public static double maxProfit (double[] pr) {
		if(pr==null || pr.length==0) {
			return 0;
		}
		double[] firstSellProfits = new double[pr.length];
		double minSoFar = Double.MAX_VALUE;
		double maxProfit = 0.0;
		int i=0;
		for(double e:pr) {
		   minSoFar = Math.min(minSoFar, e);
		   maxProfit = Math.max(maxProfit, e - minSoFar);
		   firstSellProfits[i++] = maxProfit;
		}
		
		double maxSoFar = Double.MIN_VALUE;
		for(int j=pr.length-1; j>0; j--) {
		   maxSoFar = Math.max(maxSoFar, pr[j]);
		   maxProfit = Math.max(maxProfit, maxSoFar - pr[j] + firstSellProfits[j-1]);
		}
		
		return maxProfit;
	}
}
