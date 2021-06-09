
import java.util.Scanner;

public class entradaSimples {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
				
		System.out.println("Qual seu nome?");
		String nome = scan.next();
		System.out.println("Bem vindo(a) " + nome);

	}
}
