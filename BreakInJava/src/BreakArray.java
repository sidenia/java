
public class BreakArray {

	public static void main(String[] args) {
		int [] numbers = {10,20,30,40,50};
		
		for (int i = 0; i < numbers.length; i++){
			if (numbers[i] == 40){
				break;
			}
			System.out.print(numbers[i] + " | ");
		}
	} 

}
