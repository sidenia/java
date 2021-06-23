
public class Carta {

	private String naipe;
	private String valor;
	private int dados[];
	private int topo;
	private int capacidade;
	
	//construtores
	public Carta(){
		this(5);
	}

	public Carta(String naipe, String valor){
		this.naipe = naipe;
		this.valor = valor;
	}
	
	public Carta(int capacidade) {
		this.dados = new int[capacidade];
		this.topo = 0; /* poderia fazer setTopo(0) usando o set no testePilha */
		this.capacidade = capacidade;
	}
	//métodos
	
	public boolean estaCheia() { // public boolean estaCheio () {
		if (this.topo == this.capacidade) { // return this.topo == this.capacidade
			return true; // }
		}
		return false;
	}
	public boolean estaVazia() {
		return this.topo == 0;
	}
	public void push(int i) { // empilha
		this.dados[this.topo] = i; // vetor de dados, recebe na posição topo o
									// elemento i
		this.topo++; // aumenta o topo
	}		
	public int pull() { //desempilha do topo
		this.topo--; 
		return this.dados[this.topo]; 								
	}

	public void desempilhaDeBaixo (){
			if (tamanho() > 1) {
				
				this.dados[this.topo - 2] = this.dados[this.topo - 1];
				this.topo--;
			} else {
				System.out.println("Só desempilha, se houver mais de 2 cartas na pilha!");
			}
	}
	
	public int tamanho() { //topo começa em 0 logo topo = tamanho pilha
		return this.topo; 
						
	}
	
	public int elementoTopo() { //elemento que ta no topo
		return this.dados[this.topo - 1];
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
				sPilha = sPilha + this.dados[i] + "\n"; //trocar por " "
			}
		}
		sPilha = sPilha + "\n";
		return sPilha;
		/*return "Carta [naipe=" + naipe + ", valor=" + valor + "] \n" + sPilha;*/
	}
	
	/*@Override
	public String toString(){
		return "Carta {" + "Naipe=" + naipe + ", Valor=" + valor + '}';
	}*/
		
}
