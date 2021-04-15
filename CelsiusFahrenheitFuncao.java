import java.util.Scanner;

public class CelsiusFahrenheitFuncao {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		System.out.println("Digite a temperatura em Celsius");
		double celsius = ler.nextDouble();
		conversao(celsius);
	}
	
	private static double conversao (double temperaturaCelsius){
		double fahr = (temperaturaCelsius * 1.8 + 32);
		System.out.println("A temperatura em Fahrenheit é " + fahr);
		return fahr;
	}
}
