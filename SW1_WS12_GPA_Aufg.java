class Scanner {
	public static void main(String args[]) {
		java.util.Scanner in = new java.util.Scanner(System.in);

		boolean getGrades = true;
		int counter = 0;
		float gpa = 0;

		while (getGrades) {
			int input = in.nextInt();
			
			if (input < 0 || input > 5) {
				continue;
			} else if (input == 0) {
				gpa = gpa / counter;
				getGrades = false;
				
				//break;

			}
			counter++;
			gpa += input;
			System.out.println("Note: " + input);
		}
	System.out.printf("Durchschnitt: %.2f%n", gpa);	
	}
}
