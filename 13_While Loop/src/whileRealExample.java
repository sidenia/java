import java.util.ArrayList;
import java.util.Scanner;

public class whileRealExample {

	public static void main(String[] args) {
		
		String sentence = "Francisca Sidenia Silva Bezerra";
		Scanner scan = new Scanner(sentence); //reserva um espa�o da mem�ria para a senten�a
		
		ArrayList<String> wordsSeparate = new ArrayList<String>();   //cria um array de string e da o nome de wordsSeparate e aloca um espa�o de memoria.
		
		while (scan.hasNext()) {
			wordsSeparate.add(scan.next());
		}
		
		System.out.println(sentence);
		System.out.println("Array:\n" + wordsSeparate);
		
	}

}
