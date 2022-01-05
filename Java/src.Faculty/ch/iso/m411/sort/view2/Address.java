package ch.iso.m411.sort.view2;

public class Address implements Comparable<Address>{

	private int zip;
	private String place;
	
	public Address(int zip, String place) {
		super();
		this.setZip(zip);
		this.setPlace(place);
	}

	public int getZip() {
		return zip;
	}

	public void setZip(int zip) {
		this.zip = zip;
	}

	public String getPlace() {
		return place;
	}

	public void setPlace(String place) {
		this.place = place;
	}

	@Override
	public int compareTo(Address o) {
		if (this.getZip() == o.getZip()) {
		return 0;
		} else if (this.getZip() > o.getZip()) {
			return 1;
		} else {
			return -1;
		}
		
		// return this.getPlace().compareTo(o.getPlace());
	}
	
}
