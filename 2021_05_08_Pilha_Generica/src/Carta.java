
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
	
	public Carta(int capacidade){
		this.capacidade = capacidade;
	}
	
	public Carta(String naipe, String valor){
		this.naipe = naipe;
		this.valor = valor;
	}
	
	//getters 
	public String getNaipe (){
		return naipe;
	}
	public String getValor (){
		return valor;
	}
	
	//setters
	
	public void setNaipe(String naipe){
		this.naipe = naipe;
	}
	public void setValor(String valor){
		this.valor = valor;
	}

	
	//métodos
	
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
		this.dados[this.topo] = i; // vetor de dados, recebe na posição topo o
									// elemento i
		this.topo++; // aumenta o topo
	}
	
	public int pull() { // desempilha int pq o vetor é de inteiros
		this.topo--; // primeiro baixa o topo
		return this.dados[this.topo]; // opção 2 para pull = return
										// this.dados[--this.topo];
	}
	
	@Override
	public String toString() {
		return "Carta [naipe=" + naipe + ", valor=" + valor + "] \n";
		
	}
	
	/*@Override
	public String toString(){
		return "Carta {" + "Naipe=" + naipe + ", Valor=" + valor + '}';
	}*/
	
	
}
