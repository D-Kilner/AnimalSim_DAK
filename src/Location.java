/*
 * this was created by Dalton Kilner on March 24th, 2020
 */
public class Location {
	private int xCoord;
	private int yCoord;
	
	// empty location constructor
	public Location() {
		xCoord = 0;
		yCoord = 0;
	}
	// preferred location constructor 
	public Location(int x , int y) {
		validateCoordinates(x, y);	
	}
	// updates the coordinates within the class
	public void update(int x, int y) {
		validateCoordinates(x, y);
	}
	//returns the coordinates obtained in an array with x then y
	public int[] getCoordinates() {
		int[] coordinates = new int[] {xCoord , yCoord};
		return coordinates;
	}
	
	//validates the coordinates given 
	private void validateCoordinates(int x, int y) {
		  InvalidCoordinateException coordException;
	  try {
		if (x < 0) {
			coordException = new InvalidCoordinateException("Invalid X coordinate"); 
			throw coordException;
		}
		else if (y < 0) {
			coordException = new InvalidCoordinateException("Invalid Y coordinate"); 
			throw coordException;
		}
		else {
			xCoord = x;
			yCoord = y;
		}
		}
		catch (InvalidCoordinateException e) {
			System.out.println(e.getMessage());
			
		}
	}
	public String displayCoordinates() {
		StringBuilder coordinates = new StringBuilder();
		coordinates.append("X Coordinate is: " + xCoord);
		coordinates.append("\nY Coordinate is: " + yCoord);
		return coordinates.toString();
	}
	//getters and setters
	/**
	 * @return the xCoord
	 */
	public int getxCoord() {
		return xCoord;
	}
	/**
	 * @param xCoord the xCoord to set
	 */
	public void setxCoord(int xCoord) {
		validateCoordinates(xCoord, yCoord);
	}
	/**
	 * @return the yCoord
	 */
	public int getyCoord() {
		return yCoord;
	}
	/**
	 * @param yCoord the yCoord to set
	 */
	public void setyCoord(int yCoord) {
		validateCoordinates(xCoord, yCoord);
	}
}//closes class
