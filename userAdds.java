import java.util.Scanner;

public class userAdds {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in); //aloca��o din�nimca de mem�ria.
		
		System.out.println("Digite seu nome:\n");
		String nome = ler.nextLine();		////grava a entrada na vari�vel nome, mem�ria reservada na vari�vel ler.
		//System.out.println(nome);   		//sa�da
		
		System.out.println("Digite seu e-mail:\n");
		String email = ler.nextLine();
		
		System.out.println("Digite seu endere�o:\n");
		String endereco = ler.nextLine();
		
		System.out.println("Seus dados s�o:");
		System.out.println(nome);
		System.out.println(email);
		System.out.println(endereco);
	}

}
