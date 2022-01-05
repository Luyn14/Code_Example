package ch.iso.m411.greedy;

public class Potatogreedy {

	public static void main(String[] args) {
		int p7kg = 0;
		int p5kg = 0;
		int p2kg = 0;
		int p1kg = 0;

		int value = 37;
		
		int value_saved = value;

		if (value > 0) {
			while (value >= 7) {
				value = value - 7;
				p7kg++;
			}
			while (value >= 5) {
				value = value - 5;
				p5kg++;
			}
			while (value >= 2) {
				value = value - 2;
				p2kg++;
			}
			while (value >= 1) {
				value = value - 1;
				p1kg++;
			}

		}
		System.out.println("Gewicht: " + value_saved + "kg");
		if (p7kg > 0) System.out.println("7er: " + p7kg);
		if (p5kg > 0) System.out.println("5er: " + p5kg);
		if (p2kg > 0) System.out.println("2er: " + p2kg);
		if (p1kg > 0) System.out.println("1er: " + p1kg);
	}

}
