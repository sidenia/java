
public class TesteZoologico {
	
	public static void main (String [] args){
		//Animal a = new Animal();  você não pode instanciar direito uma interface.
		Cachorro bidu = new Cachorro();
		Gato bichano = new Gato();
		//Tartaruga carla = new Tartaruga(); classe abastrata nao pode ser instanciada.
		//entao nesse exemplo a classe tartaruja só vai obrigar que voce implemente o que ela tem quando outra classe for ser construida a partir dela, ou seja se ela for virar mae ou filha de alguem, enfim ela vai exigir um parametro para alguem que seja criada a partir dela.
		
		bidu.fazBarulho();
		bichano.fazBarulho();
		
		
		
	}
	
}
