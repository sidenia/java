import java.util.Scanner;

public class CelsiusFahrenheit {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		System.out.println("Digite a temperatura em Celsius");
		double celsius = ler.nextDouble();
		double fah = (double) (celsius * 1.8 + 32);
		System.out.println("A temperatura em Fahrenheit é " + fah);
		//System.out.println(fah);
	}

}
