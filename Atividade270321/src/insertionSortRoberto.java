import java.util.Scanner;
import java.util.Random;
import java.util.Date;

public class insertionSortRoberto {
	
static void InsertionSort(int v[]) {
	
	   for (int j = 1; j < v.length; ++j) {
	      int x = v[j];
	      int i;
	      for (i = j-1; i >= 0 && v[i] > x; --i) 
	         v[i+1] = v[i];
	      v[i+1] = x;
	   }
}

static void exibeVetor(int v [], String msg) {
	System.out.println("\n"+ msg + "\n");
	for (int i = 0; i< v.length; i++) {
		 System.out.printf("%d  ", v[i]);
	}
	System.out.println();
	
}
	
static void preencheVetor (int v[]) {
	Random r = new Random();
	for (int i=0; i<v.length; i++) {
		v[i] = r.nextInt(v.length * 10);
	}
}

	 public static void main (String[]args) {
		  
		 Scanner entrada = new Scanner (System.in);
		 
		 char continua;
		 do {
			 System.out.print("digite o tamanho do vetor: ");
			 int n = entrada.nextInt();
			 int v[] = new int[n];
			 
			 preencheVetor (v);
			 
			 Date iniDate = new Date();
			 long inicio = iniDate.getTime();
			 
			 InsertionSort(v);
			 
			 Date fimDate = new Date();
			 long fim = fimDate.getTime();
			 
			 System.out.println("\ntempo de ordena??o para o tamanho " + n +" = " + (fim-inicio)+ "ms\n");
			 //exibeVetor(v, "vetor ordenado");
			 
			 System.out.print("\n executa novamente? (s/n)");
			 entrada.nextLine();
			 continua = entrada.nextLine().toLowerCase().charAt(0);
			 
		 }while(continua == 's');
		 
		 entrada.close();
	 }
}
