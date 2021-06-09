
public class TesteListaLigada {

	public static void main(String[] args) {
		ListaLigada ll = new ListaLigada(); //L L
		System.out.println(ll);
		
		ll.insereNoInicio(10);
		ll.insereNoInicio(20);
		ll.insereNoInicio(30);

		System.out.println(ll);
		
		if(!ll.estaVazia()){
			System.out.println(ll.remocaoDoInicio() + " foi removido do inicio!");
			System.out.println(ll);
		}
		
		ll.insereNoFim(5);
		System.out.println(ll);
	}

}

//lista ligada com opera��o de in�cio parece uma pilha
//opera��es de in�cio caracteriza uma pilha.