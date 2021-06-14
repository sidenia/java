
public class ConvertionStringInt {

	public static void main(String[] args) {
		
		// String To integer
		String s = "99";
		
		/* 
		//concatena apenas
		System.out.println(s + 1);
		//converte e soma
		System.out.println(Integer.parseInt(s) + 1);
		*/
		
		int n = Integer.parseInt(s);
		System.out.println(n + 1);
		
		
		//integer to String
		int numero = 5;
		String posicao = Integer.toString(numero);
		System.out.println(posicao);
	}

}
