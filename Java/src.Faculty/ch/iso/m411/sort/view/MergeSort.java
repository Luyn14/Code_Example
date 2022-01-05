package ch.iso.m411.sort.view;

public class MergeSort {
	
	public static void sort(int[] array) {
		mSort(array, 0, array.length - 1);
	}
	
	private static void mSort(int[] array, int l, int r) {
		int i, j, k;
		int[] b = new int[array.length];
		
		if (r > l) {
			int m = (r + l) / 2;
			
			mSort(array, l, m);
			mSort(array, m+1, r);
			
			for (k=l; k <= m; k++)
				b[k] = array[k];
			for (k=m; k < r; k++)
				b[r + m - k] = array[k + 1];
			
			i = l;
			j = r;
			for (k=l; k <= r; k++)
				if (b[i] < b[j])
					array[k] = b[i++];
				else
					array[k] = b[j--];
		}
	}
	
}
