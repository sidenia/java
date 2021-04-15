
public class Loop {

	public static void main(String[] args) {

		/*loop infinito
		 * while (true) {
			System.out.println("a");
		}*/

		int i = 0;
		int a = 2;
		
		//while - Ele primeiro checa a condição e se atendida ele executa a ação até sair do loop.
		while (i < 5) {
			System.out.println("i is less than 5: " + i);
			i++;
		}
		
		System.out.println("\n");
		
		//for
		for(int j = 0; j <5; j++) {
			System.out.println("j is less than 5: " + j);
		}
		
		System.out.println("\n");
		
		//do while. Ele faz a primeira a ação e repete até que a condição seja atingida.
		do {
			System.out.println("Eu sou a Si");	
		}while (a < 2);
	}
}
