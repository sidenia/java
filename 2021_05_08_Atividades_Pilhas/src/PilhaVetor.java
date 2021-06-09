public class PilhaVetor {

	// objetos
	private int dados[];
	private int topo;
	private int capacidade;

	// construtores
	public PilhaVetor() {
		this(10);
	}

	public PilhaVetor(int capacidade) {
		this.dados = new int[capacidade];
		this.topo = 0; 
		this.capacidade = capacidade;
	}

	// métodos 
	public boolean estaCheia() {
		if (this.topo == this.capacidade) { 
											
			return true; 
		}
		return false;
	}

	public boolean estaVazia() {
		return this.topo == 0;
	}

	public void push(int i) { // empilha
		this.dados[this.topo] = i;
		this.topo++;
	}

	public int pull() { // desempilha
		this.topo--;
		return this.dados[this.topo];
	}

	public int tamanho() {
		return this.topo;
	}

	public int elementoTopo() {
		return this.dados[this.topo - 1];
	}

	public void empilhaForte(int dado) { // 7
		if (estaVazia()) {
			push(dado); 	// ou this.dados[this.topo++] = dado;
		} else if (dado <= elementoTopo()){
			push(dado);		//ou this.dados[this.topo++] = dado;
		}else {
			System.out.println("Pilha Fraca! Não é possível empilhar número maior que o anterior!");
		}
	}

	@Override

	public String toString() {
		String sPilha = "Pilha: ";
		if (this.estaVazia()) {
			sPilha = sPilha + "está vazia";
		} else {
			sPilha = sPilha + "Capacidade:" + this.capacidade + " Tamanho:" + this.tamanho() + "\n";

			// apresentar os elementos do vetor de cima pra baixo
			for (int i = this.topo - 1; i >= 0; i--) {
				sPilha = sPilha + this.dados[i] + " ";
			}
		}
		sPilha = sPilha + "\n";
		return sPilha;
	}
}
