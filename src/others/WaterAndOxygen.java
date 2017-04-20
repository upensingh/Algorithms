package others;

class WaterAndOxygen {
	static final double relativeError = 1e-9;

	public static void main(String[] args) {

	}

	public static double maxDays(int remainH20, int remainO2, int costH2O, int costO2) {
		double daysH2O = remainH20/costH2O;
		double daysO2 = remainO2/costO2;

		if(Double.compare(daysH2O, daysO2) < 0) {
			return daysO2;
		}
	}
}