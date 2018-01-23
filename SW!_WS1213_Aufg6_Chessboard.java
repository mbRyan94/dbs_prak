class Chessboard {
	public static void main(String[] args) {
		int size = 8;
		boolean toggle = true;

		for (int row = 0; row < size; row++) {


			for (int col = 0; col < size; col++) {
				
				/*if (col % 2 != 0) {

					System.out.print('+');
					System.out.print(" ");
				
				} else {

					System.out.print('-');
					System.out.print(" ");
				}*/
				if (toggle) {
					System.out.print('-');
					System.out.print(" ");
					toggle = false;
				} else {
					System.out.print('+');
					System.out.print(" ");
					toggle = true;
				}

			}

			System.out.println();
			//Wegen symmetrischen Board wechseln. Sonst ist das erste Zeichen immer das selbe.
			if (toggle == true) {
				toggle = false;
			} else {
				toggle = true;
			}

		}

	}
}
