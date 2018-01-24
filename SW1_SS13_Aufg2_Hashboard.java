class Hashboard {
	public static void main(String[] args) {
		int size = 8;
		int increasingMinus = 1;
		int decreasingHash = size;

		for (int row = 0; row < size ; row++) {
			for (int hashCol = decreasingHash; hashCol > 0; hashCol--) {
				System.out.print("#");
			}

			if (row > 0) {
				for (int minCol = 1; minCol < increasingMinus; minCol++) {
					System.out.print("-");
				}
			}
			decreasingHash--;
			increasingMinus++;
			System.out.println();
		}

		
	}
}
