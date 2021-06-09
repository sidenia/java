
public class TesteEstacionamento {

	public static void main(String[] args) {
		Carro c1 = new Carro("Gol", "DEV1234");
		Carro c2 = new Carro("Voyage", "POL2398");
		Carro c3 = new Carro("Porsche", "PQU1109");
		Carro c4 = new Carro("HB20", "LAW7296");
		Carro c5 = new Carro("Corsa", "EBZ4040");
		
		Estacionamento<Carro> estacionamento = new Estacionamento<>(10);
		estacionamento.entrar(c1);
		estacionamento.entrar(c2);
		estacionamento.entrar(c3);
		estacionamento.entrar(c4);
		estacionamento.entrar(c5);
		
		System.out.println(estacionamento);
	
	}

}
