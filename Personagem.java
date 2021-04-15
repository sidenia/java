
public class Personagem {
	//Classe modelo - atributos
	
	private String nome;
	private int fome;
	private int forca;
	private int sono;
	
	/*método construtor - mostra a forma como construir o objeto dentro da memória (atraves dos parametros e se quiser valores pros atributos).
	se voce não disser nada a API do java faz o método construtor padrão. 
	Ele zera tudo ou seja variaveis numericas sao 0, variaveis boleanas sao false
	objetos a referencia sao null*/
	//bloco construtor - é publico nao tem tipo de parametro e tem o nome da classe
	
	
	public Personagem (String nome, int fome, int forca, int sono) {
		this.setNome(nome); //voce pode pegar as regras lá do setters ao inves de fazer this.nome = nome e ter que fazer os ifs de novo com as regars do negocio.
		this.setFome(fome);
		this.setForca(forca);
		this.setSono(sono);
	}
	
	//não da para criar dois blocos construtores iguais, com mesmos tipos de variaveis ex: int a, int b  e criar outro bloco com int c e int d.. 
	//ela só vai enxergar um bloco com 2 ints.. mas nao vai compilar se tem 2 blocos com dois ints... pq ela nao diferencia variáveis, apenas tipos.
	//sobrecarga de construtor/sobrecarga de métodos =  criar varios metodos diferentes mudando a quantidade, tipo ou a ordem dos tipos de variareis.
	
	public Personagem (String nome) {
		this.setNome(nome); //voce pode pegar as regras lá do setters
		this.setFome(1);
		this.setForca(1);
		this.setSono(1);
	}
	
	//seta novamente o padrão da API - também posso passar valores dentro das chaves, desde que não passe parametro entre ().
	public Personagem () {
		this.setNome(nome);
		this.setFome(1);
		this.setForca(1);
		this.setSono(1);
	}
	
	
	
	
	//métodos de acesso = são os famosos get ou getters - precisam do nivel(ex public), do tipo de dado (ex: int)  e (get + nome do atributo)
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
	
	//métodos modificadores = são os famosos metodos setters - são sempre void
	
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
	
	
	/*proliferação de nomes (pesquisar) para evitar o nome das variaveis dentros de setters de dentro dos parametros sao iguais 
	 * ao nome dos atributos. O que diferencia saber qual é o atributo e qual é a variável é o this antes do nome, que referencia 
	 * o atributo. this.sono = atributo / sono sozinho é a variavel local do set.
	*/

	void dormir() {
		this.setSono(this.getSono()-2); // setar o sono, pegando o sono com o get e diminuindo 2
		this.setForca(this.getForca()+1);
	}
}
