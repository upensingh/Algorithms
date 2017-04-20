package bitsAndPieces;

class Parity {
	public static void main(String[] args) {
		assert(parity(1) == 1);
		assert(parity(15) == 0);
		assert(parity(0) == 0);
		assert(parity(Long.MAX_VALUE) == 1);
		assert(parity(Long.MIN_VALUE) == 1);
		assert(parity(Long.MAX_VALUE-1) == 0);
	}

	public static long parity(long x) {
		x ^= x>>32;
		x ^= x>>16;
		x ^= x>>8;
		x ^= x>>4;
		x ^= x>>2;
		x ^= x>>1;

		return x & 1;
	}
}