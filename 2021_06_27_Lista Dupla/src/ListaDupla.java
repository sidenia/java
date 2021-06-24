
public class ListaDupla {
	private NoDuplo primeiro;
	private NoDuplo ultimo;
	
	//construtor
	public ListaDupla (){
		this.primeiro = null;
		this.ultimo = null;
	}
	
	//gets
	
	public NoDuplo getPrimeiro(){
		return primeiro;
	}
	
	public NoDuplo getUltimo(){
		return ultimo;
	}
	
	//sets
	
	public void setPrimeiro(NoDuplo primeiro){
		this.primeiro = primeiro;
	}
	
	public void setUltimo (NoDuplo ultimo){
		this.ultimo = ultimo;
	}
	
	//metodos
	
	public boolean listaVazia(){
		return this.primeiro == null;
	}
	
	public void insereInicio(int info){ //inserção de início
		NoDuplo novo = new NoDuplo(info);
		if (!listaVazia()){
			novo.setProximo(this.primeiro);//o próximo do novo será o q era primeiro
			novo.setAnterior(null);//desnecessario mas por clareza...deixei aqui
			this.primeiro.setAnterior(novo); //chave do sucesso kkkk isso que faz a ligação dupla
		}
		else{
			this.setUltimo(novo);
		}
		this.setPrimeiro(novo);
	}
	
	public void insereFim (int i){
		NoDuplo novo = new NoDuplo(i);
		if (this.listaVazia()){
			this.setPrimeiro(novo);
		}	
		else{
			novo.setAnterior(this.ultimo);
			this.ultimo.setProximo(novo); //o ultimo deu a mão para o novo que chegou
			
		}
		this.setUltimo(novo); //em qq um dos casos, o ultimo será atualizado para o novo.
	}
	
	public int removeDoInicio(){
		int intAux = this.primeiro.getInfo(); 
		this.primeiro = this.primeiro.getProximo(); //ou setPrimeiro(primeiro.getProximo()); o primeiro recebe o próximo do nó
		if(listaVazia()){
			this.setUltimo(null);
		}
		return intAux;
	}
	
	public int removeFim(){
		int intAux = this.ultimo.getInfo();
		this.ultimo = this.ultimo.getAnterior();
		if (this.ultimo == this.primeiro){  //ultimo igual ao primeiro então
			this.setPrimeiro(null);			//primeiro = null
			this.setUltimo(null);			//ultimo = null
		}
		else{
			this.ultimo.setProximo(null); //o item removido, ou seja, o prox do novo ultimo = null
			System.out.println("Removido do fim: " + intAux); //item removido
	        System.out.println("Novo ultimo: " + this.ultimo.getInfo()); //novo ultimo
		}
		return intAux; //retorna info do novo ultimo...
	}

	@Override
	
	public String toString() {
		String s = "Lista: ";
		if (listaVazia()){
			s = s + "está vazia!";
		}
		else{
			NoDuplo aux = this.primeiro;
			while(aux != null){
				s = s + aux + " -> ";
				aux = aux.getProximo();
			}
			s+= "//";
		}
		return s;
	}
	
	
}
