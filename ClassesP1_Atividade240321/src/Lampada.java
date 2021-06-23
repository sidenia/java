
public class Lampada {

	int tensao;
	String tipo;
	int potencia;
	boolean status;
	
	//bloco construtor
	
	public Lampada () {
		
	}
	
	public Lampada (int tensao, String tipo, int potencia, boolean status) {
		this.setTensao(tensao);   //ao invés de fazer novamente " this.tensao = tensao; " como já tem nos setters é só chamar dentro dos parenteses.
		this.setTipo(tipo);
		this.setPotencia(potencia);
		this.setStatus(status);
	}
	
	/*o normal seria fazer assim, porém o ideal é fazer como acima reaproveitando as funções setters.
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
	
	//setters - métodos modificadores -  regras de negócio
	
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
	
	//Método toString
	
	public String toString() {
		String retorno = "";
		
		retorno = retorno + "Objeto lâmpada:\n"; 
		retorno = retorno + "\tTipo: " + this.tipo + "\n"; 
		retorno = retorno + "\tVoltagem: " + this.tensao + "\n"; 
		retorno = retorno + "\tPotência: " + this.potencia + "\n"; 
		
		if (this.status == true) {
			retorno = retorno + "\tStatus: ligado\n";
		} else {
		retorno = retorno + "\tStatus: desligado\n";
		}
	
		return retorno; 
	}
	
	//método acender 
	
	public void Acender () {
		setStatus(true);
	}
	
	//método apagar
	public void Apagar () {
		setStatus(false);
	}
	
	//método verifica
	public void VerificaStatus () {
		getStatus();
	}
}
