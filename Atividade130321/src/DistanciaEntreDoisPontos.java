import java.util.Scanner;

public class DistanciaEntreDoisPontos {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Vamos calcular a distância entre dois pontos!");
		System.out.println("Digite um valor para x1: ");
		double x1 = scan.nextDouble();
		System.out.println("Digite um valor para x2: ");
		double x2 = scan.nextDouble();
		System.out.println("Digite um valor para y1: ");
		double y1 = scan.nextDouble();
		System.out.println("Digite um valor para y2: ");
		double y2 = scan.nextDouble();
		
		scan.close();
		
		double resultado = Math.sqrt((x1 - x2) * (x1 - x2)  +  (y1 - y2) * (y1 - y2));
		
		System.out.println("O resultado da distância entre os dois pontos é: " + resultado);
	}

}