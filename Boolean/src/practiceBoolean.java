
public class practiceBoolean {

	public static void main(String[] args) {
		//studying boolean variables
		boolean passedDoor = true;
		boolean missedDoor = false;
		boolean passedAllDoors = false;
		int doorCount = 0;
		
		if(passedDoor) {
			System.out.print("We passed the first door!\n");
			doorCount = doorCount + 1;
		}
		if(passedDoor) {
			System.out.print("We passed the second door!\n");
			doorCount = doorCount + 1;
		}
		if(passedDoor) {
			System.out.print("We passed the third door!\n");
			doorCount = doorCount + 1;
		}
		if (doorCount == 3) {
			passedAllDoors = true;
		}
		if (passedAllDoors) {
			System.out.println("Congrats! You won the game!");
		}
		else {
			System.out.println("Sorry, you lost the game!");
		}		
	}

}
