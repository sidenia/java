
public class StringCatchJustNumbers {

	public static void main(String[] args) {
		String s = "idade: 30";
		s = s.replaceAll("\\D+","");   //regular expression
		System.out.println(s);

		
		String p = "Ano: 2020";
		System.out.println(p);
		p = p.replaceAll("\\D+", "");
		System.out.println(p);
		
		int numero = Integer.parseInt(p);
		System.out.println(numero);
		System.out.println(numero + 1);

	}

}
