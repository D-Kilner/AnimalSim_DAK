
public class Goldfinch extends Animal implements Flyable, Walkable {
	private double wingSpan;
	private int maxWalkableDistance = 1;
	
	public Goldfinch() {
		super();
		wingSpan = 9.0;
	}
	// preferred goldfinch constructor
	public Goldfinch(int simID, Location l, double ws) {
		super(simID, l);
		setWingSpan(ws);
	
	}
	@Override
	public void walk(int direction) {
		Location l;
		int dir = direction;
		if (direction > maxWalkableDistance) {
		dir = maxWalkableDistance;
		}
		l = new Location(dir , dir);
		System.out.println("The goldfinch walked from " + location.displayCoordinates());
		location.update(l.getxCoord() + location.getxCoord(),  l.getyCoord() + location.getyCoord());
		System.out.println("The goldfinch walked to " + location.displayCoordinates());
	}
	@Override
	public void fly(Location l) {
		System.out.println("The goldfinch flew from " + location.displayCoordinates());
		location.update(l.getxCoord(), l.getyCoord());
		System.out.println("The goldfinch flew to " + location.displayCoordinates());
	}

	
	
	// getters and setters
	/**
	 * @return the wingSpan
	 */
	public double getWingSpan() {
		return wingSpan;
	}
	/**
	 * @param wingSpan the wingSpan to set
	 */
	public void setWingSpan(double wingSpan) {
		InvalidWingspanException wingSpanException = new InvalidWingspanException("this is an invalid Wingspan, enter a number between 5 and 11 centimeters");
		//tries to set wingSpan  	
		try {
		if (wingSpan < 5 || wingSpan > 11) {
			throw wingSpanException;
		}
		else {
			this.wingSpan = wingSpan;
		}
		}
		catch (InvalidWingspanException e) {
			System.out.println(e.getMessage());
			
		}
	}
	

}
