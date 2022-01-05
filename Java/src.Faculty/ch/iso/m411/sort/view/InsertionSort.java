package ch.iso.m411.sort.view;

public class InsertionSort {
	
	public static void sort(int[] array) {
		sort(array, 0, array.length - 1);
	}
	
	public static void sort(int[] array, int u, int o) {
		for (int i=u+1; i < o+1; i++) {
			int j = i;
			int m = array[i];
			while (j > u && array[j-1] > m) {
				array[j] = array[j-1];
				j--;	
			}
			array[j] = m;
			//for (int l=0; l < array.length; l++) System.out.print(array[l] + " ");
			//System.out.println();
		}		
	}
}
