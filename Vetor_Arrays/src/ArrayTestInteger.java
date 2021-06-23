import java.util.Scanner;

public class ArrayTestInteger {
	
	public static void main(String[] args) {
	
		int [] numeros =  new int [5];							
		Scanner scan = new Scanner(System.in);
		
		for (int i = 0; i < numeros.length; i++) {
			System.out.println("Type a number (integer): ");
			numeros[i] = scan.nextInt();
		}
		scan.close();
		
		for (int i = 0; i < numeros.length; i++) {
			System.out.println("Number entered: " + numeros[i]);
		}
		
	}
}
