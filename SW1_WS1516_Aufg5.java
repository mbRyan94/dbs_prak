class Dreieck {
public static void main(String [] args) {
final int lines = Integer.parseInt(args[0]);
int decreasingPoints = lines; 

int starsPerLine = 1;
int minusPerLine = 1;
//Schleife um die Zeilen aufzubauen 
for (int row = 1; row <= lines; row++) {
	
	// Punkte ausgeben
	for (int points = decreasingPoints - 1; points > 0; points--) {
		System.out.print('.');
	}
	//Plus direkt nach den Punkten ausgeben
	System.out.print("+");
	decreasingPoints--;
	/*
	if (lines < 3) {
		for (int stars = 1; stars <= starsPerLine; stars++) {
		System.out.print('+');
		}
	starsPerLine += 2;
	System.out.println("");
	System.exit(0);
	}
	*/
	

	//Minus innerhalb des Baums ausgeben
	if (row >=2) {
	for (int minus = 1; minus <= minusPerLine; minus++) {
		
		if (row == lines) {
			break;
		}
		System.out.print('-');

		}
		System.out.print('+');
	minusPerLine += 2;
	}

	//Sterne der letzten Reihe ausgeben
	if (row == lines) {
		int starsLastLine = 2 * (lines - 1) - 1;
		for (int lastStars = 0; lastStars < starsLastLine; lastStars++) {
			System.out.print('+');
		}
	} 

	
	//starsPerLine += 2;
	System.out.println();


}



	}
}
