package ch.iso.m411.test.sort;

import java.util.ArrayList;
import java.util.Collections;

public class Main_Arraylist {

	public static void main(String[] args) {
		
		// Arraysort with ArrayList
		
		ArrayList<Beer> beers = new ArrayList<Beer>();

		beers.add(new Beer("Solothurner Bier", 0.4));
		beers.add(new Beer("Oltner Bier", 0.5));
		beers.add(new Beer("Znüni Bier", 0.3));
		beers.add(new Beer("Znacht Bier", 0.8));
		beers.add(new Beer("Zmittag Bier", 0.6));
		beers.add(new Beer("Zvel Bier", 1.0));

		Collections.sort(beers);

		for (Beer beer : beers) {
			System.out.println(beer.getName() + " " + beer.getAlcoholLevel());
		}

	}

}
