class Cat {
	String name = "";
	int year;
	int month;
	int day;
	String birthday = "";

	Cat (String name, int day, int month, int year) {
		this.name = name;
		this.day = day;
		this.month = month;
		this.year = year;
		this.birthday = Integer.toString(day) + "." + Integer.toString(month) + "." + Integer.toString(year);
	}

	public void print() {
		System.out.println("Name: " + this.name + "\n" + "Geburtstag: " + this.birthday + "\n");
	}
}

class Miz {
	public static void main(String[] args) {
		Cat mizii = new Cat("Mizii", 24, 06, 1993);
		mizii.print();
	}
}
