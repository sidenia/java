import java.util.Scanner;

import javax.swing.JOptionPane;

public class TestePilha2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		//capacidade
		int c = Integer.parseInt(JOptionPane.showInputDialog("Digite a capacidade"));
		PilhaVetor pilhaTeste = new PilhaVetor(c);
		
		//entrada apropriando o valor com função push direto na pilha.
		pilhaTeste.push(Integer.parseInt(JOptionPane.showInputDialog("Digite o 1° elemento da pilha:")));
		System.out.println(pilhaTeste);

		//desempilhando
		pilhaTeste.pull();
		System.out.println("Desempilhando...");
		System.out.println(pilhaTeste);
		
	}

}
