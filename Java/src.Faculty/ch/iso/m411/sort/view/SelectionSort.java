package ch.iso.m411.sort.view;

public class SelectionSort {
	
	public static void sort(int[] array) {
		
		int marker = array.length - 1;
		
		while (marker >= 0) {
			int max = 0;
			for (int i=1; i <= marker; i++) {
				if (array[i] > array[max]) {
					max = i;
				}
			}
			swap(array, marker, max);
			marker--;
			//for (int l=0; l < array.length; l++) System.out.printf("%d ", array[l]);
			//System.out.println();
		}
	}

	private static void swap(int[] array, int idx1, int idx2) {
		int tmp = array[idx1];
		array[idx1] = array[idx2];
		array[idx2] = tmp;
	}
}
