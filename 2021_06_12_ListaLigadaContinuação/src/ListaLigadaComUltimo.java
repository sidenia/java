
public class ListaLigadaComUltimo{
	private No primeiro;
	private No ultimo;
	
	public ListaLigadaComUltimo(){
		this.primeiro = null;
		this.ultimo = null;
	}

	public No getPrimeiro(){
		return primeiro;
	}
	
	public No getUltimo (){
		return ultimo;
	}
	
	public void setPrimeiro (No no){
		this.primeiro = no;
	}
	
	public void setUltimo(No ultimo){
		this.ultimo = ultimo;
	}
	
	//metodos
	public boolean listaVazia(){
		return this.primeiro == null;
	}
	
	public void insereInicio(int info){ //inserção de início
		No novo = new No(info);
		if (!listaVazia()){
			novo.setProximo(this.primeiro);
		}
		else{
			this.setUltimo(novo);
		}
		this.setPrimeiro(novo);
	}

	public int removeDoInicio(){
			int intAux = this.primeiro.getInfo(); 
			this.primeiro = this.primeiro.getProximo(); //ou setPrimeiro(primeiro.getProximo()); o primeiro recebe o próximo do nó
			if(listaVazia()){
				this.setUltimo(null);
			}
			
			return intAux;
	}

	/*public void insereNoFim (int info){
		No novo = new No(info);
		if (this.listaVazia()){
			this.primeiro = novo;
		}
		else{
			No aux = this.primeiro;
			while (aux.getProximo() != null){
				aux = aux.getProximo();
			}
			aux.setProximo(novo);
		}
	}*/
	//ja temos o ponteiro do ultimo então nao precisamos usar o while ali no anterior.
	
	public void insereFim (int i){
		No novo = new No(i);
		if (this.listaVazia()){
			this.setPrimeiro(novo);
		}
		else{
			this.ultimo.setProximo(novo); //o ultimo deu a mão para o novo que chegou
		}
		this.setUltimo(novo); //em qualquer um dos casos, o ultimo será atualizado.
	}
	
	public int removeFim(){
		int intAux = this.ultimo.getInfo(); //o objeto Info da classe nó sabe como fazer para me dar a info
		if (this.primeiro == this.ultimo){//a lista tem um só elemento
			this.setPrimeiro(null);
			this.setUltimo(null);
		}
		else{
			No aux = this.primeiro;
			while(aux.getProximo() != this.ultimo){
				aux = aux.getProximo();
			}
			aux.setProximo(null);
			this.setUltimo(aux);
		}
		return intAux;
	}
	
	
	@Override
	
	public String toString() {
		String s = "Lista: ";
		if (listaVazia()){
			s = s + "está vazia!";
		}
		else{
			No aux = this.primeiro;
			while(aux != null){
				s = s + aux + " -> ";
				aux = aux.getProximo();
			}
			s+= "//";
		}
		return s;
	}
	
	/*
	 novo.setProximo(this.primeiro);
	 this.setPrimeiro(novo);*/
	
}
