import java.util.Scanner;

import javax.swing.JOptionPane;

public class TestePilha {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		PilhaVetor pilhaVetor1 = new PilhaVetor();
		pilhaVetor1.push(10); 
		pilhaVetor1.push(20); 
		System.out.println(pilhaVetor1);//atalho: sysout + cntrl + espaço 

		int c = Integer.parseInt(JOptionPane.showInputDialog("Digite a capacidade da pilha: "));
		PilhaVetor pilhaVetor2 = new PilhaVetor(c);
		pilhaVetor2.push(Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro valor: ")));
		System.out.println(pilhaVetor2);
		
		//pilhaVetor2.push(3);
		//pilhaVetor2.push(5);
		//pilhaVetor2.push(7);
		//System.out.println(pilhaVetor2);
		//System.out.println(pilhaVetor2.pull() + "foi desempilhado");
		//System.out.println(pilhaVetor2);
	}

}
