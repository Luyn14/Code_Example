package ch.iso.m226b.model;

import java.util.ArrayList;

public class DataStoreLeft implements IDataStore {

	@Override
	public ArrayList<String> load() {

		ArrayList<String> data = new ArrayList<String>();
		
		data.add("Erster Eintrag (Left)");
		data.add("Zweiter Eintrag (Left)");
		data.add("Dritter Eintrag (Left)");
		data.add("Vierter Eintrag (Left)");
		
		return data;
	}

	@Override
	public void save(ArrayList<String> data) {
		// TODO Auto-generated method stub

	}

}
