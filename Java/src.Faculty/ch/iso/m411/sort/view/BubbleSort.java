package ch.iso.m411.sort.view;

public class BubbleSort {

	public static void sort(int[] array) {
		boolean swapped;
		
		do {
			swapped = false;
			
			for (int i=0; i < array.length - 1; i++) {
				if (array[i] > array[i + 1]) {
					swap(array, i, i + 1);
					swapped = true;
				}
				//for (int l=0; l < array.length; l++) System.out.printf("%d ", array[l]);
				//System.out.println();
			}
			//System.out.println("---");
		} while (swapped);
	}
	
	private static void swap(int[] array, int idx1, int idx2) {
		int tmp = array[idx1];
		array[idx1] = array[idx2];
		array[idx2] = tmp;
	}
}
