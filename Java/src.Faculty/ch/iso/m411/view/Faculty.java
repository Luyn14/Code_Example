package ch.iso.m411.view;

public class Faculty {

	public static void main(String[] args) {
		
		// fac(0) = 1
		// fac(n) = n*fac(n-1) for n > 0
		
		int n = 13;
		System.out.println(n + "! = " + facL(n));
		System.out.println(n + "! = " + facR(n));

	}
	
	private static int facL(int n) {
	
		int x = 1;
		for (int i = 1; i <= n; i++) {
			x = x * i;
		}
		
	return x;	
	}
	
	private static int facR(int n) {
		
		if (n == 0) {
			return 1;
		} else {
			// System.out.println(n);
			return n * facR(n-1);
		}
	}

}
	
