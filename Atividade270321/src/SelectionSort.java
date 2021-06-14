
public class SelectionSort {

	public static final int TAMANHO = 500000 ;
	public static void main(String[] args) {

		int [] vetor = new int[TAMANHO];
		
		for (int i = 0; i < vetor.length; i++) {
		     vetor[i] = (int) (Math.random()* TAMANHO);
		     //System.out.println(vetor[i]);
		    }
		
		//System.out.println("\nOrdenado: ");
		
		long tempoInicial = System.currentTimeMillis();

		 selectionSort(vetor);
		 
		 /*for (int j = 0; j < vetor.length; j++) {
		     System.out.println(vetor[j] + " ");
		 }*/
		 
		 long tempoFinal = System.currentTimeMillis();
		 
		 System.out.println("Executado em = " + (tempoFinal - tempoInicial) + " ms");
	}
	
		private static void selectionSort(int[] vetor) {
			
			for (int fixo = 0; fixo < vetor.length - 1; fixo++) {
			    int menor = fixo;
	
			    for (int i = menor + 1; i < vetor.length; i++) {
			       if (vetor[i] < vetor[menor]) {
			          menor = i;
			       }
			    }
			    
			    if (menor != fixo) {
			      int t = vetor[fixo];
			      vetor[fixo] = vetor[menor];
			      vetor[menor] = t;
			 }
			    
		}
			
	}
	
}
