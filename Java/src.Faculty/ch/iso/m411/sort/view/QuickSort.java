package ch.iso.m411.sort.view;

public class QuickSort {
	
	public static void sort(int[] array) {
		qSort(array, 0, array.length - 1);
	}
	
	private static void qSort(int[] array, int u, int o) {
		int p = (u + o) / 2;
		
		if (o > u) {
			int pn = partition(array, u, o, p);
			
			qSort(array, u, pn - 1);
			qSort(array, pn + 1, o);
		}
	}
	
	public static void sort(int[] array, int m) {
		qSort(array, 0, array.length - 1, m);
	}
	
	private static void qSort(int[] array, int u, int o, int m) {
		int p = (u + o) / 2;
		if ( (o - u) < m) {
			InsertionSort.sort(array, u, o);
		} else {
			int pn = partition(array, u, o, p);
				
			qSort(array, u, pn - 1, m);
			qSort(array, pn + 1, o, m);
		}
	}
			
	private static int partition(int[] array, int u, int o, int p) {
		int pn = u;
		int pv = array[p];
		
		swap(array, p, o);
		
		for (int i=u; i < o; i++)
			if (array[i] <= pv)
				swap(array, pn++, i);
		
		swap(array, o, pn);
		
		return pn;
	}
	
	private static void swap(int[] array, int idx1, int idx2) {
		int tmp = array[idx1];
		array[idx1] = array[idx2];
		array[idx2] = tmp;
	}
}
