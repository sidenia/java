
public class PrimEstacionamento {

	private Carro vagas[];
	private int capacidade;
	private int primeiro;
	private int ultimo;
	private int quantidade; // id do carro para associar a numero de voltas
	

	public PrimEstacionamento (){
		this(10); //capacidade de vagas é 10 conforme exercícios
	}
	
	public PrimEstacionamento(int capacidade){
		this.vagas = new Carro[capacidade];
		this.capacidade = capacidade;
		this.primeiro = 0;
		this.ultimo = 0;
		this.quantidade = 0;	
		
	}
	
	public boolean estaVazia() {
		return this.quantidade==0;
	}
	public boolean estaCheia() {
		return this.quantidade==this.capacidade;
	}
	private int proxima (int posicao) {
		return (posicao + 1) % this.capacidade;
	}
	private int anterior (int posicao) {
		return (posicao-1+this.capacidade) % this.capacidade;
	}
	public void insere (Carro carro) {
		this.vagas[this.ultimo] = carro;
		this.ultimo = proxima(this.ultimo);
		this.quantidade++;	
	}
	public Carro remove () {
		Carro quemSai = this.vagas[this.primeiro];
		this.primeiro = proxima(this.primeiro);
		this.quantidade--;
		return quemSai;
	}
	public Carro primeiro () {
		return this.vagas[this.primeiro];
	}
	/*public Carros ultimo () {
		return this.vagas[anterior(this.ultimo)];
		//return this.dados[this.proxima];
	}*/
	public int tamanho () {
		return this.quantidade;
	}
	public int posicoesVazias (){
		return this.capacidade - this.quantidade;
	}
	
	@Override
	public String toString () {
		String s = "fila: ";
		if (this.estaVazia()) {
			s = s + "vazia!";
			s = s + " Posições disponíveis: " + posicoesVazias();
		}		
		
		else {
			int i=this.primeiro;
			do {
				s = s + this.vagas[i] + " ";
				i = proxima(i);
			} while (i!=this.ultimo);
		}
		return s;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	//testar se está vazia a fila; 
    //entrar por um lado e sair por outro (fila).
	//Cada entrada contem um 0 + placa  -  Cada saída contem 1 + placa // 2 -- 2 entrou placa do 2 = xxxxx;
	// imprimir uma mensagem sempre que um carro chegar OU sair. (contador de voltasnoquarteirao)
	//carro tenta entrar, se estacionamento sem vagas, exibir msg avisando e nao deixar  entrar.
	//quando um carro sair, msg : X saiu + numero de voltasnoquarteirao para liberar saida de outros.
}
