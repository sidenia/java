import java.util.Random;

public class randomico {
	
	public static final int TAMANHO = 5;
	public static void main(String[] args) {
		Random gerador = new Random();
		
		for (int i = 0; i < TAMANHO; i++) {
			System.out.println(gerador.nextInt(5));
		}
	}

}
