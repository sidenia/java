import java.util.Scanner;

public class TestePilha3 {

	public static void main(String[] args) {
		// COM entrada de usuário por Scanner
		Scanner scan = new Scanner (System.in);

		//capacidade
		
		System.out.println("Digite a capacidade da pilha:");
		int cap = scan.nextInt();
		PilhaVetor pilhaTeste = new PilhaVetor(cap);
		
		//entrada de dados na pilha
		
		System.out.println("Digite um elemento para a pilha: ");
		pilhaTeste.push(scan.nextInt());		
		System.out.println(pilhaTeste);
		scan.close();
		
		//desempilhando
		System.out.println("Desempilhando...");
		pilhaTeste.pull();
		System.out.println(pilhaTeste);
	}

}
