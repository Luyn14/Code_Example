package ch.iso.m411.view;

public class Fibonacci {

	public static void main(String[] args) {
		// fib(0) = 0
		// fib(1) = 1
		// fib(n) = fib(n-2) + fib(n-1) for n > 1
		
		System.out.println(fibL(7));
		
		System.out.println(fibR(7));

	}

	// L = Loop
    private static int fibL(int n) {

        if (n == 0) {
            return 0;

        } else if (n == 1) {
            return 1;
        } else {

            int a = 0; // fib(n-2)
            int b = 1; // fib(n-1)
            int i = 2;

            while (i <= n) { // 2 to n
                int aa = b; // fib(n-1)
                int bb = a + b; // fib(n)

                a = aa;
                b = bb;

                i++;
            }
            return b;
        }
    }

	private static int fibR(int n) {
		
		if (n == 0) {
			return 0;
		} else if (n == 1) {
			return 1; 
		} else { 
			return fibR(n-2) + fibR(n-1);
		}
		
	}
	

}
