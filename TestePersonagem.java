
public class TestePersonagem {

	public static void main(String[] args) {
		int i; // quando temos uma variavel do tipo primitivo basta declarar
		Personagem p1 = new Personagem(); // uma variavel de uma classe devemos declarar e instanciar 
		Personagem p2 = new Personagem();   //bloco construtor (Tem gente que chama m�todo construtor)
		
		//usando o construtor padr�o da API
		System.out.println("p1:" + p1.getNome() + "\nfor�a: " + p1.getForca());
		System.out.println("p2:" + p2.getNome() + "\nfor�a: " + p2.getForca());
		
		//aten��o as regras de neg�cio - se n�o estiver dentro das regras o valo vai ser 0.
		p1.setFome(10);
		p1.setSono(-3);
		
		p2.setFome(15);
		p2.setForca(-20);
		
		/*while (1) {
			p1.fome++;
		}*/
		
		System.out.println("sono de p1:" + p1.getSono());
		System.out.println("fome de p1:" + p1.getFome());
		
		Personagem p3 = new Personagem ("Thor", 5, 10, 0);
		
		p3.getForca();
		
		//p3.setForca(p3.getForca()-1);  pode fazer assim para deduzir 1 da forla   ou como o debaixo
		int f = p3.getForca();
		
		
				Personagem p4 = new Personagem ("Garfield");
		System.out.println("p4:" + p4.getNome() + "\nfor�a:" + p4.getForca());
	}

}
