//Coleção de inteiros, de double, 
//pilha de tipo genérico pra aceitar qualquer tipo de dado qualquer = <> operador diamante

public class PilhaVetorG <T> { //T é apelido para o meu tipo

	//declaração de objetos
	private T[] dados;
	private int topo;
	private int capacidade;
	
	//Bloco construtor
	
	public PilhaVetorG (){
		this(10);
	}

	public PilhaVetorG(int capacidade){
		this.dados = (T[]) new Object [capacidade]; //Classe Object pai de todos os tipos () é um casting dizendo q será informado qq tipo para o vetor
		this.topo = 0;
		this.capacidade = capacidade;
	}
	
	//métodos		
	
		public boolean estaCheia() {     		 
			return this.topo == this.capacidade;  
			}
		
		public boolean estaVazia (){
			return this.topo == 0;
		}
		 
		public void push (T i) { 			//empilha
			this.dados[this.topo] = i; 		
			this.topo++; 					
		}
		
		public T pull (){ 				//desempilha 
			this.topo--; 					
			return this.dados[this.topo]; 
		}
		
		public int tamanho (){
			return this.topo; //como começamos no topo em zero, o topo é igual ao numero de elementos da pilha.
		}
		
		public T elementoTopo (){
			return this.dados[this.topo-1];
		}
		
		@Override //esconder o to string da classe pai
		//to string
		
		public String toString () {
			String sPilha = "Pilha: ";
			if (this.estaVazia()){
				sPilha = sPilha + "está vazia";
			}
			else {
				sPilha = sPilha + "Capacidade:" + this.capacidade + " Tamanho:" + this.tamanho() + "\n";
				
				//apresentar os elementos do vetor de cima pra baixo
				for (int i = this.topo-1; i >= 0; i--){
					sPilha = sPilha + this.dados[i] + " ";
				}	
			}
			sPilha = sPilha + "\n";
			return sPilha;
		}	
	
}
