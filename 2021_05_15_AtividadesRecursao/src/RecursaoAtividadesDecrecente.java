import java.util.Scanner;

public class RecursaoAtividadesDecrecente {

	public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Digite um numero: ");
            int num = sc.nextInt();
            System.out.println(num);
            imprimePar(num);
        }
        
        //System.out.println(soma(4));
    }

	// Exercicio 1
	public static int soma(int n) {

		if (n == 0) {
			return 0;
		} else if (n == 1) {
			return 1;
		} else {
			return n + soma(n - 1);
		}
	}

	// Exercicio 2
	 private static int imprimePar(int num) {
	        if (num == 0) {
	            return 0;
	        }
	        num = num - 2;
	        System.out.println(num);
	        return imprimePar(num);
	 }
}
