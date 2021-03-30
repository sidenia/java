import java.util.Scanner;

public class userAdds {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in); //alocação dinânimca de memória.
		
		System.out.println("Digite seu nome:\n");
		String nome = ler.nextLine();		////grava a entrada na variável nome, memória reservada na variável ler.
		//System.out.println(nome);   		//saída
		
		System.out.println("Digite seu e-mail:\n");
		String email = ler.nextLine();
		
		System.out.println("Digite seu endereço:\n");
		String endereco = ler.nextLine();
		
		System.out.println("Seus dados são:");
		System.out.println(nome);
		System.out.println(email);
		System.out.println(endereco);
	}

}
