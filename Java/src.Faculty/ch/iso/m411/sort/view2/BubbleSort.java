package ch.iso.m411.sort.view2;

public class BubbleSort {

	public static void sort(Address[] array) {
		boolean swapped;
		
		do {
			swapped = false;
			
			for (int i=0; i < array.length - 1; i++) {
				if (array[i].getZip() > array[i + 1].getZip()) {
					swap(array, i, i + 1);
					swapped = true;
				}
				//for (int l=0; l < array.length; l++) System.out.printf("%d ", array[l]);
				//System.out.println();
			}
			//System.out.println("---");
		} while (swapped);
	}
	
	private static void swap(Address[] array, int idx1, int idx2) {
		Address tmp = array[idx1];
		array[idx1] = array[idx2];
		array[idx2] = tmp;
	}
}
