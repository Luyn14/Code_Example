package ch.iso.m226b.model;

import java.util.ArrayList;

public class DataStoreRight implements IDataStore {

	@Override
	public ArrayList<String> load() {

		ArrayList<String> data = new ArrayList<String>();
		
		data.add("Erster Eintrag (Right)");
		data.add("Zweiter Eintrag (Right)");
		data.add("Dritter Eintrag (Right)");
		data.add("Vierter Eintrag (Right)");
		
		return data;
	}

	@Override
	public void save(ArrayList<String> data) {
		// TODO Auto-generated method stub

	}

}
