
/*
 * dividi o numero por dois, 
 * anotar o restante (0 ou 1), 
 * pegar o quociente e dividi-lo novamente por dois. 
 * Faça esse mesmo processo até que o quociente final seja 1 
 * (obrigatoriamente, a última conta deverá ser 2 ÷ 2)*/

public class PilhaBinario {
	// objetos
	private int dados[];
	private int topo;
	private int capacidade;

	// construtores
	public PilhaBinario() {
		this(20);
	}

	public PilhaBinario(int capacidade) {
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

	public int pull() { //desempilha
		this.topo--;
		return this.dados[this.topo];
	}

	public int tamanho() { 
		return this.topo; 
	}

	public int elementoTopo() {
		return this.dados[this.topo - 1];
	}
	
	public void converteBinario(int num){ 
		
		while (num > 2){  
			push(num % 2); 
			num = num / 2;
		}
		push(num % 2);
		push(num / 2);
		
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
