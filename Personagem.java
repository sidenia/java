
public class Personagem {
	//Classe modelo - atributos
	
	private String nome;
	private int fome;
	private int forca;
	private int sono;
	
	/*m�todo construtor - mostra a forma como construir o objeto dentro da mem�ria (atraves dos parametros e se quiser valores pros atributos).
	se voce n�o disser nada a API do java faz o m�todo construtor padr�o. 
	Ele zera tudo ou seja variaveis numericas sao 0, variaveis boleanas sao false
	objetos a referencia sao null*/
	//bloco construtor - � publico nao tem tipo de parametro e tem o nome da classe
	
	
	public Personagem (String nome, int fome, int forca, int sono) {
		this.setNome(nome); //voce pode pegar as regras l� do setters ao inves de fazer this.nome = nome e ter que fazer os ifs de novo com as regars do negocio.
		this.setFome(fome);
		this.setForca(forca);
		this.setSono(sono);
	}
	
	//n�o da para criar dois blocos construtores iguais, com mesmos tipos de variaveis ex: int a, int b  e criar outro bloco com int c e int d.. 
	//ela s� vai enxergar um bloco com 2 ints.. mas nao vai compilar se tem 2 blocos com dois ints... pq ela nao diferencia vari�veis, apenas tipos.
	//sobrecarga de construtor/sobrecarga de m�todos =  criar varios metodos diferentes mudando a quantidade, tipo ou a ordem dos tipos de variareis.
	
	public Personagem (String nome) {
		this.setNome(nome); //voce pode pegar as regras l� do setters
		this.setFome(1);
		this.setForca(1);
		this.setSono(1);
	}
	
	//seta novamente o padr�o da API - tamb�m posso passar valores dentro das chaves, desde que n�o passe parametro entre ().
	public Personagem () {
		this.setNome(nome);
		this.setFome(1);
		this.setForca(1);
		this.setSono(1);
	}
	
	
	
	
	//m�todos de acesso = s�o os famosos get ou getters - precisam do nivel(ex public), do tipo de dado (ex: int)  e (get + nome do atributo)
	public String getNome() {
		return nome;
	}
	
	public int getFome() {
		return fome;
	}
	
	public int getForca() {
		return forca;
	}
	
	public int getSono() {
		return sono;
	}
	
	//m�todos modificadores = s�o os famosos metodos setters - s�o sempre void
	
	public void setNome (String nome) {
		//this fala para pegar o atributo fome desse objeto			
		this.nome = nome;
					//e atribuir a esse parametro fome
	}
	
	public void setFome (int fome) {
		if (fome >= 0 && fome <=8) {
			this.fome = fome;
		}
	}
	
	public void setForca (int forca) {
		if (forca >= -5 && forca < 5){
		this.forca = forca;
		}
	}
	
	public void setSono (int sono) {
		if (sono >= 0 && sono <=10 ) {
			this.sono = sono;
		}
		else if (sono < 0) {
			this.sono = 0;
		}else {
			this.sono = 10;
		}
	}
	
	
	/*prolifera��o de nomes (pesquisar) para evitar o nome das variaveis dentros de setters de dentro dos parametros sao iguais 
	 * ao nome dos atributos. O que diferencia saber qual � o atributo e qual � a vari�vel � o this antes do nome, que referencia 
	 * o atributo. this.sono = atributo / sono sozinho � a variavel local do set.
	*/

	void dormir() {
		this.setSono(this.getSono()-2); // setar o sono, pegando o sono com o get e diminuindo 2
		this.setForca(this.getForca()+1);
	}
}
