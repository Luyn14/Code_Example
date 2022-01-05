package ch.iso.m411.rekursion_loop;

public class Power {

	public static void main(String[] args) {

		// power(x,0) = 1
		// power(x,X) = x*power(x, y-1) for y > 0

		int x = 2;
		int y = 3;

		System.out.println(x + "^" + y + " = " + powR(x, y));
		System.out.println(x + "^" + y + " = " + powL(x, y));
		System.out.println(x + "^" + y + " = " + Math.pow(x, y));

	}

	private static int powL(int x, int y) {
		if (y == 0) {
			return 1;
		} else {
			int xx = 1;
			if (y > 0) {
				for (int i = 1; i <= y; i++) {
					xx = xx * x;
				}

			}
			return xx;
		}
	}

	private static int powR(int x, int y) {

		if (y == 0) {
			return 1;
		} else {
			return x * powR(x, y - 1);
		}
	}

}
