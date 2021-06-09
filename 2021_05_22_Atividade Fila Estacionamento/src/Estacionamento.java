
@SuppressWarnings("hiding")
public class Estacionamento<Carro> {

	private Carro[] vagas;
	private int primeiro;
	private int ultimo;
	private int quantidade;
	private int capacidade;
	
	public Estacionamento() {
		this(4); // está chamando o construtor que tem capacidade
	}
	
	
	@SuppressWarnings("unchecked")
	public Estacionamento (int capacidade) {
		this.vagas = (Carro[]) new Object[capacidade];
		this.capacidade = capacidade;
		this.primeiro = 0;
		this.ultimo = 0;
		this.quantidade = 0;
	}
	
	public boolean estaVazia() {
		return this.quantidade == 0;
	}
	
	public boolean estaCheia() {
		return this.quantidade == this.capacidade;
	}
	
	private int proxima (int posicao) {
		return (posicao + 1) % this.capacidade;
	}
	
	private int anterior (int posicao) {
		return (posicao - 1 + this.capacidade) % this.capacidade; // (4 - 1 + 5) % 5 = 3 | emprestou, paga
	}
	
	public Carro primeiro() {
		return this.vagas[this.primeiro];
	}
	
	public int tamanho() {
		return this.quantidade;
	}
	
	public Carro ultimo() {
		return this.vagas[anterior(this.ultimo)];
	}
	
	public void entrar (Carro carro) {
		this.vagas[this.ultimo] = carro;
		this.ultimo = proxima(this.ultimo);
		this.quantidade++;
		
	}
	
	//  4 3 2 1
	public Carro sair(Carro carro) { // 3
		int i = this.primeiro;
		do {	// 3     ==      vagas [3]
			this.vagas[this.proxima(i)] = this.vagas[this.primeiro]; // primeiro recebe a prox posicao do carro i
			while (this.vagas[i]!= this.vagas[this.primeiro] && this.vagas[i]!= carro){
				sair(vagas[i]);
				//acumulador de voltas
				entrar(vagas[i]);
			}	
			i = proxima(i);
		}while (i != this.ultimo); // enquanto i for diferente do ultimo
		
		this.quantidade--;		
		return carro;
	}

	
	/*public Carro sair(Carro carro) { // 3
		int i = this.primeiro;
		do {	// 3     ==      vagas [3]
			this.vagas[this.proxima(i)] = this.vagas[this.primeiro];
			do{
				sair(vagas[i]);
				//acumulador
				entrar(vagas[i]);
				
			}while (this.vagas[i]!= carro);
			
			i = proxima(i);
		} while (i != this.ultimo); // enquanto i for diferente do ultimo
	 
		this.quantidade--;		
		return carro;
	}*/
	
	
	@Override
	public String toString () {
		String msg = "fila: \n";
		if (this.estaVazia()) {
			msg += "vazia";
		} else {
			int i = this.primeiro;
			do {
				msg += this.vagas[i] + " \n";
				i = proxima(i);
			} while (i != this.ultimo); // quando i for igual ao ultimo, sai do loop
		}
		return msg;
	}
}
