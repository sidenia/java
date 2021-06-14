
public abstract class ListaLigada {
	private No primeiro;

	public ListaLigada(){
		this.primeiro = null;
	}

	public No getPrimeiro(){
		return primeiro;
	}
	
	public void setPrimeiro (No no){
		this.primeiro = no;
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
		this.setPrimeiro(novo);
	}

	public int removeDoInicio(){
			int intAux = this.primeiro.getInfo(); 
			this.primeiro = this.primeiro.getProximo(); //ou setPrimeiro(primeiro.getProximo()); o primeiro recebe o próximo do nó
			return intAux;
	}

	public void insereFim (int info){
		No novo = new No();
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
	}
	
	//public abstract int removeFim();  se tem metodo abstrato precisa informar que a classe é abstrata.
	/*metodo abstrato: forma de uniformizar o código. 
	Significa que Toda classe que for herdar de lista ligada tem que implementar um método 
	de removeFim;
	se não quisermos, ou  mantemos a classe abstrata e coloca um fake ou muda o tipo da classe mae.*/
	
	
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
