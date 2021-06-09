import java.util.Scanner;

public class BreakTest {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Insira o tamanho do vetor:");
		int tamanho = Integer.parseInt(scan.next()); //usa-se o parseInt apenas quando for necessario converter um valor para inteiro, ex: String to int.
		int vetor [] = new int[tamanho];
		
		System.out.println("Digite os " + tamanho + " elementos do vetor: ");
		for (int i = 0; i < vetor.length; i++){
			vetor[i] = scan.nextInt();
		}
		
		System.out.println("Elementos inseridos:");
		for (int i = 0; i < vetor.length; i++){
			System.out.print(vetor[i] + " | ");
		}

	}
}
