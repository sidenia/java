import java.util.Scanner;

public class TesteLampada {

	public static void main(String[] args) {
		Lampada um = new Lampada(127,"LED",12,true);
		System.out.println(um);
	
		Lampada lampada = new Lampada();
		Scanner scan = new Scanner(System.in);
		
		lampada.setTipo("LED");
		lampada.setTensao(127);
		lampada.setPotencia(12);
		lampada.setStatus(true);

		scan.close();

		System.out.println("Tipo:" + lampada.getTipo());
		System.out.println("Voltagem: " + lampada.getTensao());
		System.out.println("Potencia: " + lampada.getPotencia());
		System.out.println("Status: " + lampada.getStatus());
	}

}
