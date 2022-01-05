package ch.iso.m411.view;

public class Main {

    public static void main(String[] args) {

        int[] a = new int [10];
        a[0] = 9;
        a[1] = 12;
        a[2] = 22;
        a[3] = 23;
        a[4] = 35;
        a[5] = 5;
        a[6] = 71;
        a[7] = 51;
        a[8] = 67;
        a[9] = 1;

        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }

        System.out.println();
        System.out.println("===========================");

        OwnSort.sort(a);

        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }

        System.out.println();

    }

}