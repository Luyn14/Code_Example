package ch.iso.m411.test.sort;

public class Beer implements Comparable<Beer>{

	private String name;
	private double alcoholLevel;

	public Beer(String name, double alcoholLevel) {
		super();
		this.name = name;
		this.alcoholLevel = alcoholLevel;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getAlcoholLevel() {
		return alcoholLevel;
	}

	public void setAlcoholLevel(double alcoholLevel) {
		this.alcoholLevel = alcoholLevel;
	}
	
	@Override
	public int compareTo(Beer o) {
		if (this.getAlcoholLevel() == o.getAlcoholLevel()) {
		return 0;
		} else if (this.getAlcoholLevel() > o.getAlcoholLevel()) {
			return 1;
		} else {
			return -1;
		}
		
	} 
	

}
