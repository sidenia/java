import java.util.Scanner;

public class IfElse {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite uma nota:");
		int n = scan.nextInt();
		scan.close();
		//System.out.println(n);
		
		if(n >= 90 && n <= 100) {
			System.out.println("Sua nota é A!");
		} else if(n >= 80 && n < 90) {
			System.out.println("Sua nota é B!");
		} else if(n >= 70 && n < 80) {
			System.out.println("Sua nota é C!");
		} else if(n >= 65 && n < 70) {
			System.out.println("Sua nota é D!");
		} else{
			System.out.println("A nota que você incluiu está fora do range!");
		}
		
	}

}
