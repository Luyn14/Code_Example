package ch.iso.m411.test.sort;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		
		// Arraysort with Array

		Beer[] beer = new Beer[6];
		beer[0] = new Beer("Solothurner Bier", 0.4);
		beer[1] = new Beer("Oltner Bier", 0.5);
		beer[2] = new Beer("Znüni Bier", 0.3);
		beer[3] = new Beer("Znacht Bier", 0.8);
		beer[4] = new Beer("Zmittag Bier", 0.6);
		beer[5] = new Beer("Zvel Bier", 1.0);

		Arrays.sort(beer);

		for (int i = 0; i < beer.length; i++) {
			System.out.println(beer[i].getName() + " " + beer[i].getAlcoholLevel());

		}

	}
}
