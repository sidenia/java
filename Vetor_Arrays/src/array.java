import java.util.Scanner;

public class array {

	public static void main(String[] args) {
		
		int [] numeros;									//declara um vetor de inteiros    podia declarado direto como : int [] numeros = new int [5];
			
		numeros = new int [5];							//aloca espa�o na mem�ria para 5 posi��es
		Scanner scan = new Scanner(System.in);
		
		for (int i = 0; i < numeros.length; i++) {
			System.out.println("Digite um numero inteiro: ");
			numeros[i] = scan.nextInt();
		}
		scan.close();
		
		for (int i = 0; i < numeros.length; i++) {
			System.out.println("Numero digitado: " + numeros[i]);
		}
	}

}
