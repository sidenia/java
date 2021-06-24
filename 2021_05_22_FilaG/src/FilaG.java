
public class FilaG <Tipo> {

	private Tipo[] dados;
    private int primeiro;
    private int ultimo;
    private int quantidade;
    private int capacidade;
    
    //construtores
    public FilaG () {
    	this(20);
    }
    
    public FilaG (int capacidade) {
    	this.dados = (Tipo[]) new Object [capacidade];
    	this.primeiro = 0;
    	this.ultimo = 0;
    	this.quantidade = 0;
    	this.capacidade = capacidade;
    }
	
    public boolean estaVazia() {
    	return this.quantidade == 0;
    }
    
    public boolean estaCheia() {
    	return this.capacidade == this.quantidade;
    }
    
    public int proxima(int posicao) {
    	return (posicao + 1) % this.capacidade;
    }
    
    public int anterior(int posicao) {
    	return (posicao - 1 + this.capacidade ) % this.capacidade;
    }
    
    public void insere (Tipo dado) {
		this.dados[this.ultimo] = dado;
		this.ultimo = proxima(this.ultimo);
		this.quantidade++;	
	}
    
    public Tipo remove() {
    	Tipo quemSai = this.dados[this.primeiro];
    	this.primeiro = this.proxima(this.primeiro);
    	this.quantidade--;
    	return quemSai;
    }
    
    public Tipo primeiro() {
    	return this.dados[this.primeiro];
    }
    
    public Tipo ultimo() {
    	return this.dados[this.ultimo];
    }
    
    public int posicoesVazias() {
    	return this.capacidade - this.quantidade;
    }
    
    @Override
    
    public String toString(){
    	String f = "Fila: ";
    	
    	if (estaVazia()) {
    		f = f + " esta Vazia!";
    		f = f + " Posições disponíveis: " + posicoesVazias();
    	}else {
    		int i = this.primeiro;
    		do {
    			f = f + " " + this.dados[i];
    			i = proxima(i);
    		}while(i != this.ultimo);
    	}
    	return f;
    }
}
