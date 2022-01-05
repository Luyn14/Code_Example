package ch.iso.m226b.model;

import java.util.ArrayList;

public interface IDataStore {
	
	/**ç
	 * 
	 * load List 
	 * 
	 * @return ArrayList<String>
	 */
	
	public ArrayList<String> load();
	
	/**
	 * save list
	 * 
	 * @param ArrayListy<String>
	 */
	
	public void save(ArrayList<String> data);

}
