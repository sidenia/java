
public class NestedForLoops {

	public static void main(String[] args) {
		
	
		int len = 3;
		for (int i = 0; i < len; i++){
			System.out.println("I'll learn Java!");
		}
		
		System.out.println("------------------------------");
		
		//VETOR
		
		String [] vetorCores = {"red", "green","blue"};
		
		for (int j = 0; j < vetorCores.length; j++){
			System.out.println(vetorCores[j]);
		}
		
		System.out.println("------------------------------");
		
		//MATRIZ 
		
		String [][] matrizCores = {
									{"red", "green","blue"},
									{"black", "white","grey"},
									{"yellow", "ciano","magenta"}
		};
		
		for (int row = 0; row < matrizCores.length; row++){
			for(int column = 0; column < matrizCores.length; column++){
				System.out.print("|" + matrizCores[row][column]);
			}
			System.out.println("");
		}
		
		System.out.println("------------------------------");
		
		for (int i = 0; i < 3; i++){
			for (int j = 0; j <3; j++){
				System.out.println("i: " + i + ", j: " + j);
			}
			System.out.println("");
		}
		
	}

}
