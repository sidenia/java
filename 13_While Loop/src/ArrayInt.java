import java.util.ArrayList;
import java.util.Scanner;

public class ArrayInt {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		
		ArrayList<Integer> lista = new  ArrayList<Integer>();
		
		while (scan.hasNext()) {
			lista.add(scan.nextInt());
		}
		
		System.out.println(a);
		System.out.println(lista);
	}

}
