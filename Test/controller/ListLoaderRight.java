package ch.iso.m226b.controller;

import java.util.ArrayList;
import java.util.Iterator;

import ch.iso.m226b.model.DataStoreRight;
import ch.iso.m226b.model.IDataStore;

public class ListLoaderRight implements Iterator<String> {

	private ArrayList<String> data;
	private int elm;
	
	public ListLoaderRight() {
		this.data = new ArrayList<String>();
		this.elm = 0;
		
		loadData();
	}
	
	private void loadData() {
		IDataStore store = new DataStoreRight();
		this.data=store.load();
	}
	
	@Override
	public boolean hasNext() {
		return (this.elm < this.data.size());
	}

	@Override
	public String next() {
		return this.data.get(this.elm++);
	}

}
