
public class Main {

	public static void main(String[] args) {
		hello();
		hi("Hi");
		age();
		year(2021);
		String[] si = {"Sidenia"};
	}

	//metodos fora do main
	private static void hello () {
		System.out.println("Hello World");
	}
	
	private static void hi (String s) {
		System.out.println(s);
	}
	
	private static void age () {
		System.out.println(30);
	}
	
	private static int year (int ano) {
		System.out.println(ano);
		return ano;
	}
	
	public static void name(String [] s) {
		System.out.println(s[0]);
	}
}
