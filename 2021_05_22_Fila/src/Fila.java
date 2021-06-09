public class Fila {
	
    private int[] dados;
    private int primeiro;
    private int ultimo;
    private int quantidade;
    private int capacidade;

	public Fila () {
		this(6);
	}
	public Fila (int capacidade) {
		this.dados = new int[capacidade];
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
	public void insere (int dado) {
		this.dados[this.ultimo] = dado;
		this.ultimo = proxima(this.ultimo);
		this.quantidade++;	
	}
	public int remove () {
		int quemSai = this.dados[this.primeiro];
		this.primeiro = proxima(this.primeiro);
		this.quantidade--;
		return quemSai;
	}
	public int primeiro () {
		return this.dados[this.primeiro];
	}
	public int ultimo () {
		return this.dados[anterior(this.ultimo)];
		//return this.dados[this.proxima];
	}
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
		
		/* i < this.ultimo não pode porque as vezes o primeiro é 5 posicao e o ultimo na 2
		 * i !this.ultimo não pode porque se a fila ta cheia o prim =  ult
		 * nesse caso while e for não serve por isso o do while é o melhor para resolver 
		 * esse problema. Porque ele imprime o vetor de dados até a prim não ser igual a ultima.
		 * ou seja, até o i!=ultimo .
		 * */
		
		else {
			int i=this.primeiro;
			do {
				s = s + this.dados[i] + " ";
				i = proxima(i);
			} while (i!=this.ultimo);
		}
		return s;
	}
	
	//para mostrar o vetor por baixo dos panos ou seja, para exibir as posicoes vazias.f 
	public String stringVetor () {
		int i;
		String s = "";
		if (this.estaVazia()) {
			for (i=0; i<this.capacidade; i++) {
				s = s + "_ ";
			}
		}
		else if (this.estaCheia()) {
			for (i=0; i<this.capacidade; i++){
				s = s + this.dados[i] + " ";
			}
		}
		else if (this.primeiro < this.ultimo) {
			for (i=0; i<this.primeiro; i++) {
				s = s + "_ ";
			}
			for (i=this.primeiro; i<this.ultimo; i++) {
				s = s + this.dados[i] + " ";
			}
			for (i=this.ultimo; i<this.capacidade; i++) {
				s = s + "_ ";
			}
		}
		else {
			for (i=0; i<this.ultimo; i++){
				s = s + this.dados[i] + " ";
			}
			for (i=this.ultimo; i<this.primeiro; i++) {
				s = s + "_ ";
			}
			for (i=this.primeiro; i<this.capacidade; i++) {
				s = s + this.dados[i] + " ";
			}
		}
		return s;
	}
}