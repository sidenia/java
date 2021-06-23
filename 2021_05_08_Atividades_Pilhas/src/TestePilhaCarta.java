
public class TestePilhaCarta {

	public static void main(String[] args) {
		
		Carta pilhaCartas = new Carta();
		
		pilhaCartas.push(2); //0
		pilhaCartas.push(3); //1
		pilhaCartas.push(4); //2
		pilhaCartas.push(5); //3
		
		System.out.println(pilhaCartas);
		pilhaCartas.desempilhaDeBaixo();
		System.out.println(pilhaCartas);
		pilhaCartas.push(8); //3
		pilhaCartas.desempilhaDeBaixo();
		System.out.println(pilhaCartas);
		
		
	}

}
