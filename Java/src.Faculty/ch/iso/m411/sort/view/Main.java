package ch.iso.m411.sort.view;

public class Main {

	public static void main(String[] args) {
		
		int[] a = new int[10];
		a[0] = 9;
		a[1] = 39;
		a[2] = 12;
		a[3] = 22;
		a[4] = 23;
		a[5] = 35;
		a[6] = 5;
		a[7] = 71;
		a[8] = 51;
		a[9] = 67;

		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
		System.out.println("===========================");

		BubbleSort.sort(a);
		// SelectionSort.sort(a);
		// InsertionSort.sort(a);
		// QuickSort.sort(a);
		// MergeSort.sort(a);
		
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
		
	}

}
