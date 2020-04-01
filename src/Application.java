import java.util.Arrays;
public class Application {

	public static void main(String[] args) {
		System.out.println("*************************************************");
		System.out.println("               Location Tests");
		System.out.println("*************************************************");
		// location test for empty coordinates
		System.out.println("Empty Location Test");
		Location emptyLocation = new Location();
		System.out.println(emptyLocation.displayCoordinates());
		// location test with valid coordinates
		System.out.println("Preferred Location Test");
		Location preferredLocation = new Location(5, 7);
		System.out.println(preferredLocation.displayCoordinates());
		//testing getters and setters
		emptyLocation.setxCoord(5);
		System.out.println("New X coordinate: " + emptyLocation.getxCoord());
		emptyLocation.setyCoord(1);
		System.out.println("New Y coordinate: " + emptyLocation.getyCoord());
		//testing all methods
		emptyLocation.update(9, 3);
		System.out.println("New coordinates" + Arrays.toString(emptyLocation.getCoordinates()));
		// location test with invalid coordinates
		System.out.println("Error Location X Coordinate Test");
		Location errorLocationX = new Location(-5 , 3);
		System.out.println(errorLocationX.displayCoordinates());
		System.out.println("Error Location Y Coordinate Test");
		Location errorLocationY = new Location(6 , -9);
		System.out.println(errorLocationY.displayCoordinates());
		errorLocationX.setxCoord(-3);
		System.out.println("New X coordinate " + errorLocationX.getxCoord());
		errorLocationY.setyCoord(-1);
		System.out.println("New Y coordinate " + errorLocationY.getyCoord());
		
		System.out.println("*************************************************");
		System.out.println("               Animal Tests");
		System.out.println("*************************************************");
		// Animal test for empty constructor
		System.out.println("Empty Animal Test");
		//cannot instantiate the type animal		
		//Animal emptyAnimal = new Animal();
		//You can store a Goldfinch/Brown bear in an animal type 
		Animal emptyGoldfinchAnimal = new Goldfinch();
		//preferred Animal test
		//cannot instantiate the type animal		
		//Animal preferredAnimal = new Animal(1, preferredLocation);
		Animal preferredBrownBearAnimal = new BrownBear(5, preferredLocation, "Grizzly");
		//Testing the getters and setters
		emptyGoldfinchAnimal.setSimID(18);
		System.out.println("New SimID: " + emptyGoldfinchAnimal.getSimID());
		emptyGoldfinchAnimal.setLocation(preferredLocation);
		System.out.println(emptyGoldfinchAnimal.getLocation().displayCoordinates());
		emptyGoldfinchAnimal.setRested(false);
		System.out.println("Is the animal rested? " + emptyGoldfinchAnimal.isRested());
		emptyGoldfinchAnimal.setFull(false);
		System.out.println("Is the animal full? " + emptyGoldfinchAnimal.isFull());
		//Testing the methods
		System.out.println("After eating is the animal full? "  + emptyGoldfinchAnimal.eat());
		System.out.println("After sleeping is the animal rested? "  + emptyGoldfinchAnimal.sleep());
		//Testing the exception invalidSimID
		emptyGoldfinchAnimal.setSimID(-7);
		System.out.println("New SimID " + emptyGoldfinchAnimal.getSimID());
		
		System.out.println("*************************************************");
		System.out.println("               Goldfinch Tests");
		System.out.println("*************************************************");
		//testing constructors for Goldfinch
		//testing empty constructor 
		Goldfinch emptyGoldfinch = new Goldfinch();
		//testing preferred constructor
		Goldfinch preferredGoldfinch = new Goldfinch(12, preferredLocation, 5.9);
		//testing getters and setters
		System.out.println("Goldfinch wingspan is  " + preferredGoldfinch.getWingSpan());
		preferredGoldfinch.setWingSpan(6.8);
		System.out.println("Goldfinch wingspan is now " + preferredGoldfinch.getWingSpan());
		//testing methods for Goldfinch
		preferredGoldfinch.walk(1);
		////testing to make sure it does not walk more than max
		preferredGoldfinch.walk(2);
		preferredGoldfinch.fly(emptyLocation);
		//testing wingSpan Exception
		System.out.println("Goldfinch wingspan is  " + preferredGoldfinch.getWingSpan());
		preferredGoldfinch.setWingSpan(50.7);
		System.out.println("Goldfinch wingspan is now " + preferredGoldfinch.getWingSpan());
		
		System.out.println("*************************************************");
		System.out.println("               BrownBear Tests");
		System.out.println("*************************************************");
		//testing constructors for BrownBear
		//testing empty constructor
		BrownBear emptyBrownBear = new BrownBear();
		//testing preferred constructor
		BrownBear preferredBrownBear = new BrownBear(45, preferredLocation, "Grizzly");
		//testing getters and setters
		System.out.println("BrownBear SubSpecies is  " + preferredBrownBear.getSubSpecies());
		preferredBrownBear.setSubSpecies("European");
		System.out.println("BrownBear SubSpecies is now " + preferredBrownBear.getSubSpecies());
		//testing methods for BrownBear
		preferredBrownBear.swim(2);
		//testing to make sure it does not swim more than max
		preferredBrownBear.swim(5);
		preferredBrownBear.walk(1);
		//testing to make sure it does not walk more than max
		preferredBrownBear.walk(6);
		//testing invalid Subspecies Excpetion
		System.out.println("BrownBear SubSpecies is  " + preferredBrownBear.getSubSpecies());
		preferredBrownBear.setSubSpecies("polar");
		System.out.println("BrownBear SubSpecies is now " + preferredBrownBear.getSubSpecies());
	}//close main method

}// close class
