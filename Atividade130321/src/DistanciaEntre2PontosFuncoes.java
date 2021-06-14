import java.util.Scanner;
public class DistanciaEntre2PontosFuncoes {

	public static void main(String[] args) {
		dados();
	}
	
	private static void dados () {
		Scanner scan = new Scanner (System.in);
		System.out.println("Vamos calcular a dist�ncia entre dois pontos!");
		System.out.println("Digite um valor para x1:");
		double x1 = scan.nextDouble();
		System.out.println("Digite um valor para x2:");
		double x2 = scan.nextDouble();
		System.out.println("Digite um valor para y1:");
		double y1 = scan.nextDouble();
		System.out.println("Digite um valor para y2:");
		double y2 = scan.nextDouble();
		
		scan.close();
		double dis = distancia(x1, x2, y1, y2);
		System.out.println("O resultado da dist�I ncia entre os dois pontos �: " + dis);
		
		/*poderia tamb�m ser escrito assim:
		 * scan.close();
		 * System.out.println("O resultado da dist�ncia entre os dois pontos �: " + distancia(x1, x2, y1, y2));*/
		
		return;
	}
	
	private static double distancia (double xUm, double xDois, double yUm, double yDois) {
		double resultado = Math.sqrt((xUm - xDois) * (xUm - xDois)  +  (yUm - yDois) * (yUm - yDois));
		return resultado;
	}
}
