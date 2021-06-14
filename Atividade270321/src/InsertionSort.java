
public class InsertionSort {

	public static final int TAMANHO = 1000000;
	public static void main(String[] args) {
	
		int [] vetor = new int[TAMANHO];
		
		for (int i = 0; i < vetor.length; i++) {
		     vetor[i] = (int) (Math.random()* TAMANHO);
		     //System.out.println(vetor[i]);
		    }
		
		//System.out.println("\n ordenado: ");
		
		long tempoInicial = System.currentTimeMillis();
		
		insertionSort(vetor);
		 
		 /*for (int j = 0; j < vetor.length; j++) {
		     System.out.println(vetor[j] + " ");
		 }*/
		 
		 long tempoFinal = System.currentTimeMillis();
		 
		 System.out.println("Executado em = " + (tempoFinal - tempoInicial) + " ms");
		
	}

	private static void insertionSort(int[] vetor) {
	    int j;
	    int aux;
	    int i;

	    for (j = 1; j < vetor.length; j++){
	    	
	      aux = vetor[j];
	      for (i = j - 1; (i >= 0) && (vetor[i] > aux); i--){
	    	  
	         vetor[i + 1] = vetor[i];
	       }
	        vetor[i + 1] = aux;
	    }
	}
}