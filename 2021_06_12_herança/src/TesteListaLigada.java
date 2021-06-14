
public class TesteListaLigada {

	public static void main(String[] args) {
		ListaLigadaComUltimo ll = new ListaLigadaComUltimo(); //L L
		System.out.println(ll);
		
		ll.insereInicio(10);
		ll.insereInicio(20);
		ll.insereInicio(30);

		System.out.println(ll);
		
		if(!ll.listaVazia()){
			System.out.println(ll.removeDoInicio() + " foi removido do inicio!");
			System.out.println(ll);
		}
		
		ll.insereFim(5);
		ll.insereFim(35);
		ll.insereFim(25);
		System.out.println(ll);
	
	if(!ll.listaVazia()){
		System.out.println(ll.removeFim() + " foi removido do fim!");
		System.out.println(ll);
	}

	}
}

//lista ligada com operação de início parece uma pilha
//operações de início caracteriza uma pilha.