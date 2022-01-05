package ch.iso.m411.sort.view2;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		
		Address[] adr = new Address[6];
		adr[0] = new Address(4600, "Olten");
		adr[1] = new Address(8000, "Zürich");
		adr[2] = new Address(5707, "Seengen");
		adr[3] = new Address(5000, "Aarau");
		adr[4] = new Address(4500, "Solothurn");
		adr[5] = new Address(4800, "Zofingen");

		// BubbleSort.sort(adr);
		
		Arrays.sort(adr);
		
		for (int i = 0; i < adr.length; i++) {
			System.out.println(adr[i].getZip() + " " + adr[i].getPlace());
		}

	}


}
