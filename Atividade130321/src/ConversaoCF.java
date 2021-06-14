import java.util.Scanner;

public class ConversaoCF {
	public static void main(String [] args) {
	Scanner ler = new Scanner(System.in);
	System.out.println("Digite a temperatura em Celsius:");
	double celsius = ler.nextDouble();
	conversao(celsius);
	System.out.println("A temperatura em Fahrenheit é "+ conversao(celsius));
	}
	
	private static double conversao (double celsius) {
		double fahr = (celsius * 1.8 + 32);
		return fahr;
	}
}
