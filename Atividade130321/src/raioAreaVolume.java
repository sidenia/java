/*Ler o valor de um raio r, calcular o comprimento da
circunfer�ncia, a �rea do c�rculo e o volume da esfera
correspondentes. Pesquise a classe Math do Java para o uso do
PI.*/
import java.util.Scanner;

public class raioAreaVolume {

	private static final double PI = 3.1415;
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite o valor de um raio: ");
		double raio = scan.nextDouble();
		comprimento(raio);
		area(raio);
		volume(raio);
		System.out.println("Comprimento da circunfer�ncia: " + comprimento(raio));
		System.out.println("�rea do c�rculo: " + area(raio));
		System.out.println("Volume da esfera: " + volume(raio));
	}
	private static double comprimento (double raio) {
		double circunf = 2 * PI * raio;
		return circunf;
	}
	private static double area(double raio) {
		double areaCirculo = PI * raio * raio;
		return areaCirculo;
	}
	private static double volume (double raio) {
		double vol = (double) 4/3 * PI * raio * raio * raio;
		return vol;
	}
}
