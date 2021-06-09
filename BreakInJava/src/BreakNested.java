
public class BreakNested {

	public static void main(String[] args) {
		
		for (int i = 0; i < 2; i++){
			
			for (int j = 0; j < 3; j++){
				System.out.println(i + "," + j );
				break;
			}
			System.out.println("");
			
		}
		
	}

}
