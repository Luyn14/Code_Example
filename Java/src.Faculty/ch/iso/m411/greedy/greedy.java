package ch.iso.m411.greedy;

public class greedy {
	
	// Mr. Krabs Lieblingsprogramm 
	// I LIKE MONEY

	public static void main(String[] args) {
		int c50er = 0;
		int c20er = 0;
		int c10er = 0;
		int c5er = 0;
		int c2er = 0;
		int c1er = 0;
		
		int value = 97;
		
		if(value > 0) {
				while(value >= 50) {
					value = value - 50;
					c50er++;
				}
				while(value >= 20) {
					value = value - 20;
					c20er++;
				}
				while(value >= 10) {
					value = value - 10;
					c10er++;
				}
				while(value >= 5) {
					value = value - 5;
					c5er++;
				}
				while(value >= 2) {
					value = value - 2;
					c2er++;
				}
				while(value >= 1) {
					value = value - 1;
					c1er++;
				}
			}
		if (c50er > 0) System.out.println("50er: " + c50er);
		if (c20er > 0) System.out.println("20er: " + c20er);
		if (c10er > 0) System.out.println("10er: " + c10er);
		if (c5er > 0) System.out.println("5er: " + c5er);
		if (c2er > 0) System.out.println("2er: " + c2er);
		if (c1er > 0) System.out.println("1er: " + c1er);
		System.out.println("Why did you build a second Crusty Crab next to your other one?");
		System.out.println("I LIKE MONEY");
		System.out.println("  - Mr.Krabs");
		
	}
}
