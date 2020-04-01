
public class BrownBear extends Animal implements Walkable, Swimable{
	private String subSpecies;
	private String[] species = {"Alaskan" , "Asiatic", "European", "Grizzly", "Kodiak", "Siberian"};
	private int maxWalkableDistance = 3;
	private int maxSwimableDistance = 2;
	
	public BrownBear() {
		super();
		subSpecies = "Alaskan";
	}
	public BrownBear(int simID, Location l, String subSpecies) {
		super(simID, l);
		setSubSpecies(subSpecies);
	}
	@Override
	public void swim(int direction) {
		Location l;
		int dir = direction;
		if (direction > maxSwimableDistance) {
		dir = maxSwimableDistance;
		}
		l = new Location(dir , dir);
		System.out.println("The Brown Bear swam from " + location.displayCoordinates());
		location.update(l.getxCoord() + location.getxCoord(),  l.getyCoord() + location.getyCoord());
		System.out.println("The Brown Bear swam to " + location.displayCoordinates());
	}
	@Override
	public void walk(int direction) {
		Location l;
		int dir = direction;
		if (direction > maxWalkableDistance) {
		dir = maxWalkableDistance;
		}
		l = new Location(dir , dir);
		System.out.println("The Brown Bear walked from " + location.displayCoordinates());
		location.update(l.getxCoord() + location.getxCoord(),  l.getyCoord() + location.getyCoord());
		System.out.println("The Brown Bear walked to " + location.displayCoordinates());
	}
	//getters and setters
	/**
	 * @return the subSpecies
	 */
	public String getSubSpecies() {
		return subSpecies;
	}
	/**
	 * @param subSpecies the subSpecies to set
	 */
	public void setSubSpecies(String subSpecies) {
		InvalidSubspeciesException subSpeciesException = new InvalidSubspeciesException("this is an invalid Subspecies, enter a valid species");
		//tries to set Subspecies  	
		try {
		boolean found = false;
		for(int i = 0; i < species.length; i++) {
			if (subSpecies.equals(species[i])) {
				found = true;
				break;
			}
		}
		if (!found) {
			throw subSpeciesException;
		}
		else {
			this.subSpecies = subSpecies;
		}
		}
		catch (InvalidSubspeciesException e) {
			System.out.println(e.getMessage());
		}
	}
}