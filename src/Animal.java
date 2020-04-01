import java.util.Random;
public abstract class Animal {
	protected int simID;
	protected Location location;
	protected boolean full;
	protected boolean rested;
	
	//empty animal constructor
	public Animal() {
		simID = 0;
		location = new Location(0, 0);
		full = false;
		rested = true;
				
	}
	//preferred animal constructor
	public Animal(int simID, Location l) { 
		setSimID(simID);
		location = l;
		full = false;
		rested = true;
	}
	// eat constructor tests the if statement to see if they are hungry or full
	public boolean eat() {
		Random r = new Random();
		double fullness = r.nextDouble();
		if (fullness < .5) {
			full = false;
		}
		else {
			full = true;
		}
		return full;
	}
	//sleep constructor tests the if statement to see if they are tired or rested
	public boolean sleep() {
		Random r = new Random();
		double rest = r.nextDouble();
		if (rest < .5) {
			rested = false;
		}
		else {
			rested = true;
		}
		return rested;
	}
	//getters and setters
	/**
	 * @return the simID
	 */
	public int getSimID() {
		return simID;
	}
	/**
	 * @param simID the simID to set
	 */
	public void setSimID(int simID) {
		InvalidSimIDException simIDException = new InvalidSimIDException("this is an invalid SimID, enter a number greater than 0");
		//tries to set ID  	
		try {
		if (simID < 0) {
			throw simIDException;
		}
		else {
			this.simID = simID;
		}
		}
		catch (InvalidSimIDException e) {
			System.out.println(e.getMessage());
			
		}
	}
	/**
	 * @return the location
	 */
	public Location getLocation() {
		return location;
	}
	/**
	 * @param location the location to set
	 */
	public void setLocation(Location location) {
		this.location = location;
	}
	/**
	 * @return the full
	 */
	public boolean isFull() {
		return full;
	}
	/**
	 * @param full the full to set
	 */
	public void setFull(boolean full) {
		this.full = full;
	}
	/**
	 * @return the rested
	 */
	public boolean isRested() {
		return rested;
	}
	/**
	 * @param rested the rested to set
	 */
	public void setRested(boolean rested) {
		this.rested = rested;
	}

	
}
