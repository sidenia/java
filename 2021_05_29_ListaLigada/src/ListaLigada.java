
public class ListaLigada {
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
	public boolean estaVazia(){
		return this.primeiro == null;
	}
	
	public void insereNoInicio(int info){ //inserção de início
		No novo = new No(info);
		if (!estaVazia()){
			novo.setProximo(this.primeiro);
		}
		this.setPrimeiro(novo);
	}

	public int remocaoDoInicio(){
			int intAux = this.primeiro.getInfo(); 
			this.primeiro = this.primeiro.getProximo(); //ou setPrimeiro(primeiro.getProximo()); o primeiro recebe o próximo do nó
			return intAux;
	}

	public void insereNoFim (int info){
		No novo = new No();
		if (this.estaVazia()){
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
	
	
	@Override
	
	public String toString() {
		String s = "Lista: ";
		if (estaVazia()){
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
