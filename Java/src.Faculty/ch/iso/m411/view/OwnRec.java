package ch.iso.m411.view;

public class OwnRec {
		
		public static void main(String[] args) {
			
			int n = 3;
			System.out.println(sumR(n));
			System.out.println(sumL(n));
			
		}

		private static double sumL(double n) {
				
			double x = 1;
				for (double i = 2; i <= n; i++) {
					x = x + 1/i;
				}
				
			return x;	
			}
		
		private static double sumR(double n) {
			
			if (n == 1) {
				return 1;
			} else {	
				return sumR(n-1) + (1/n);
			}
			
		}
		

}
	
