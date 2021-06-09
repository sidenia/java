//objeto do tipo pilha
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
		this.topo = 0; /* poderia fazer setTopo(0) usando o set no testePilha */
		this.capacidade = capacidade;
	}

	// m�todos //poderia simplificar o c�digo acima da seguinte forma:
	public boolean estaCheia() { // public boolean estaCheio () {
		if (this.topo == this.capacidade) { // return this.topo ==
											// this.capacidade;
			return true; // }
		}
		return false;
	}

	public boolean estaVazia() {
		return this.topo == 0;
	}

	public void push(int i) { // empilha
		this.dados[this.topo] = i; // vetor de dados, recebe na posi��o topo 							// elemento i
		this.topo++; // aumenta o topo
	}

	/*
	 * public void push (int i) { //empilha this.dados[this.topo++] = i; //vetor
	 * de dados, recebe na posi��o topo o elemento i (o ++ � o p�s incremento).
	 * } p�s incremento que ele adiciona apesar do ++ estar antes... facetas do
	 * compilador! tudo na mesma linha mas n�o acontece tudo na mesma hora.Uma
	 * quest�o de sintaxe.
	 */

	public int pull() { // desempilha int pq o vetor � de inteiros
		this.topo--; // primeiro baixa o topo
		return this.dados[this.topo]; // op��o 2 para pull = return
										// this.dados[--this.topo];
	}

	public int tamanho() {
		return this.topo; // como come�amos no topo em zero, o topo � igual ao
							// numero de elementos da pilha.
	}

	public int elementoTopo() {
		return this.dados[this.topo - 1];
	}

	public void empilhaForte(int dado) { // 7
		if (estaVazia()) {
			push(dado); 	//this.dados[this.topo++] = dado;
		} else if (dado <= elementoTopo()){
			push(dado);		//this.dados[this.topo++] = dado;
		}else {
			System.out.println("Pilha Fraca! N�o � poss�vel empilhar n�mero maior que o anterior!");
		}
	}

	@Override // Esconder o to string da classe pai

	public String toString() {
		String sPilha = "Pilha: ";
		if (this.estaVazia()) {
			sPilha = sPilha + "est� vazia";
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
