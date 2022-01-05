package ch.iso.m411.view;

public class OwnSort {

	public static void sort(int[] a) {

        for (int i = 0; i < a.length; i++) {
            findLowest(a, i);
        }

    }

    private static void findLowest(int[] a, int start) {

        int h;
        int p = start;
        int m = a[p];

        // search lowest
        for (int i = (start + 1); i < a.length; i++) {
            if (a[i] < m) {
                m = a[i];
                p = i;
            }
        }
        // swap
        h = a[start];
        a[start] = m;
        a[p] = h;

    }

}
