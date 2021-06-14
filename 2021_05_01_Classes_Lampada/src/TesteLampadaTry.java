import java.util.Scanner;

public class TesteLampadaTry {

	public static void main(String[] args) {
		/*Lampada um = new Lampada(127,"LED",12,true);
		System.out.println(um);*/
	
		Lampada lampada = new Lampada();
		try (Scanner scan = new Scanner(System.in)){
			
			System.out.println("Digite o tipo da Lampada: ");
			String tipo = scan.next();
			lampada.setTipo(tipo);
			
			System.out.println("Digite a tensão/voltagem: ");
			int tensao = scan.nextInt();
			lampada.setTensao(tensao);
			
			System.out.println("Digite a potencia: ");
			int potencia = scan.nextInt();
			lampada.setPotencia(potencia);
			
			System.out.println("Digite o status da Lampada agora (ligada/desligada): ");
			String status = scan.next();
			if (status.equals("ligada")) {
				lampada.setStatus(true);
			}else {
				lampada.setStatus(false);
			}
			
		//scan.close();
		}
		
		System.out.println("Tipo:" + lampada.getTipo());
		System.out.println("Voltagem: " + lampada.getTensao());
		System.out.println("Potencia: " + lampada.getPotencia());
		System.out.println("Status: " + lampada.getStatus());
	}

}
