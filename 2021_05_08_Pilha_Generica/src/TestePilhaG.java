
public class TestePilhaG {

	public static void main(String[] args) {
		PilhaVetorG <Carta> pilhaCartas = new PilhaVetorG<Carta>();
		PilhaVetorG<Integer> pilhaInteiros = new PilhaVetorG<>(); //ele ja entende que o sgund <> é = Integer

		Carta c1 = new Carta ("Copas", "J");
		Carta c2 = new Carta ("Espada", "J");

		pilhaCartas.push(c1);
		pilhaCartas.push(c2);

		pilhaCartas.push(new Carta ("Copas", "A")); //pode empurrar o valor pra pilha sem necessidade de nomear a variável
		
		pilhaInteiros.push(23); //autoboxing (Integer é uma classe empacotadora).
		pilhaInteiros.push(45); // pilhaInteiros.push(new Integer(45)); para lembrar que antigamente tava assim.

		System.out.println(pilhaCartas);
		System.out.println(pilhaInteiros);
	}

}
