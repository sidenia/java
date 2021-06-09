import java.util.Scanner;

public class TesteNo {

	public static void main(String[] args) {
		No no1 = new No(5);
		System.out.println(no1);
		
		No no2 = new No(8);
		
		no1.setProximo(no2);
		
		System.out.println(no1.getProximo());
		
		
	
		
	}
	
	/*System.out.println("Digite um numero para o vetor: ");
	Scanner scan = new Scanner(System.in);
	int numero = scan.nextInt();
	No no3 = new No(numero);*/

}
