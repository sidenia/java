
public class Lampada {

	int tensao;
	String tipo;
	int potencia;
	boolean status;
	
	//bloco construtor
	
	public Lampada () {
		
	}
	
	public Lampada (int tensao, String tipo, int potencia, boolean status) {
		this.setTensao(tensao);   //ao inv�s de fazer novamente " this.tensao = tensao; " como j� tem nos setters � s� chamar dentro dos parenteses.
		this.setTipo(tipo);
		this.setPotencia(potencia);
		this.setStatus(status);
	}
	
	/*o normal seria fazer assim, por�m o ideal � fazer como acima reaproveitando as fun��es setters.
	 * public Lampada (int tensao, String tipo, int potencia, boolean status) {
		this.tensao = tensao;
		this.tipo = tipo;
		this.potencia = potencia;
		this.status = status;
	}*/
	
	
	//getters
	public int getTensao() {
		return tensao;
	}
	
	public String getTipo () {
		return tipo;
	}
	
	public int getPotencia () {
		return potencia;
	}
	
	public boolean getStatus () {
		return status;
	}
	
	//setters - m�todos modificadores -  regras de neg�cio
	
	public void setTensao (int tensao) {
		this.tensao = tensao;
	}
	
	public void setTipo (String tipo) {
		this.tipo = tipo;
	}
	
	public void setPotencia (int potencia) {
		this.potencia = potencia;
	}
	public void setStatus (boolean status) {
		this.status = status;
	}
	
	//M�todo toString
	
	public String toString() {
		String retorno = "";
		
		retorno = retorno + "Objeto l�mpada:\n"; 
		retorno = retorno + "\tTipo: " + this.tipo + "\n"; 
		retorno = retorno + "\tVoltagem: " + this.tensao + "\n"; 
		retorno = retorno + "\tPot�ncia: " + this.potencia + "\n"; 
		
		if (this.status == true) {
			retorno = retorno + "\tStatus: ligado\n";
		} else {
		retorno = retorno + "\tStatus: desligado\n";
		}
	
		return retorno; 
	}
	
	//m�todo acender 
	
	public void Acender () {
		setStatus(true);
	}
	
	//m�todo apagar
	public void Apagar () {
		setStatus(false);
	}
	
	//m�todo verifica
	public void VerificaStatus () {
		getStatus();
	}
}
