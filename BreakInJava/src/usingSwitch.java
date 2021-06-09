import java.util.Scanner;

public class usingSwitch {

	public static void main(String[] args) {
		
		while (true){
			Scanner scan = new Scanner(System.in);
			System.out.println("Digite um número inteiro: ");
			int i = scan.nextInt();
					
			switch (i) {
				case 0:
					System.out.println("Zero");
					break;
				case 1:
					System.out.println("One");
					break;
				case 2:
					System.out.println("Two");
					break;
				default:
					System.out.println("WTF Man?");
					break;
			}
			System.out.println("");
		}
		
	}

}
