
public class ListaLigadaComUltimo extends ListaLigada{ // extends � uma exten��o, filha da lista ligada
	
	private No ultimo;
	
	public ListaLigadaComUltimo(){
		super(); //primeiro � da mae, classe super. Chamado o construtor da classe mae.
		this.ultimo = null;
	}
	
	public No getUltimo (){
		return ultimo;
	}

	public void setUltimo(No ultimo){
		this.ultimo = ultimo;
	}
	
	//metodos
	
	@Override	
	public void insereInicio(int info){ //inser��o de in�cio
		No novo = new No(info);
		if (!listaVazia()){
			novo.setProximo(getPrimeiro());
		}
		else{
			this.setUltimo(novo);
		}
		this.setPrimeiro(novo);
	}

	public int removeDoInicio(){
			int intAux = getPrimeiro().getInfo(); 
			setPrimeiro(getPrimeiro().getProximo()); //ou setPrimeiro(primeiro.getProximo()); o primeiro recebe o pr�ximo do n�
			if(listaVazia()){
				this.setUltimo(null);
			}
			
			return intAux;
	}

	@Override
	public void insereFim (int i){
		No novo = new No(i);
		if (this.listaVazia()){
			this.setPrimeiro(novo);
		}
		else{
			this.ultimo.setProximo(novo); //o ultimo deu a m�o para o novo que chegou
		}
		this.setUltimo(novo); //em qualquer um dos casos, o ultimo ser� atualizado.
	}
	
	public int removeFim(){
		int intAux = this.ultimo.getInfo(); //o objeto Info da classe n� sabe como fazer para me dar a info
		if (getPrimeiro() == this.ultimo){//a lista tem um s� elemento
			this.setPrimeiro(null);
			this.setUltimo(null);
		}
		else{
			No aux = getPrimeiro();
			while(aux.getProximo() != this.ultimo){
				aux = aux.getProximo();
			}
			aux.setProximo(null);
			this.setUltimo(aux);
		}
		return intAux;
	}
	
}
