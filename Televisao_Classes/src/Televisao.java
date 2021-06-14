
public class Televisao {

	String marca;
	boolean ligado;
	int volume;
	int canal;
	
	public Televisao (){
		ligado = false;
	}
	
	public Televisao(String marca){
		this.marca = marca;
	}
	
	public Televisao(String marca, boolean ligado, int volume, int canal){
		this.marca = marca;
		this.ligado = ligado;
		this.volume = volume;
		this.canal = canal;
	}
	
	public void ligar(){
		ligado = true;
		System.out.println("TV " + marca + " ligada.");
	}
	
	public void desligar(){
		System.out.println("Desligando Tv " + marca);
		ligado = false;
	}
	
	public void defineMarca(String marca){
		this.marca = marca; 					// o mesmo que marca  = marca
		System.out.println("TV - Marca definida: " + marca);
	}
	
	public void defineVolume (int vol){
		if (ligado){
			this.volume = vol;
			System.out.println("TV " + marca + " Volume definido: " + volume);
		}else{
			System.out.println("Por favor ligue a TV!");
		}
	}
	
	public void defineCanal (int canal){
		if(ligado){
			this.canal = canal;
			System.out.println("TV " + marca + " com canal definido para "+ canal);
		}else{
			System.out.println("Por favor ligue a TV!");
		}
	}
	
	public void aumentaVolume(){
		if (ligado){
			this.volume++;
			System.out.println("TV "+ marca + " novo volume: " + volume);
		}else{
			System.out.println("Por favor ligue a TV!");
		}
	}
	
	public void diminuiVolume(){
		if (ligado){
			this.volume--;
			System.out.println("TV "+ marca + " novo volume: " + volume);
		}else{
			System.out.println("Por favor ligue a TV!");
		}
	}
	
	
	public void avancaCanal(){
		if(ligado){
			this.canal = canal+1;
			System.out.println("TV " + marca + " com canal definido para "+ canal);
		}else{
			System.out.println("Por favor ligue a TV!");
		}
	}
	
	public void retrocedeCanal(){
		if(ligado){
			this.canal = canal-1;
			System.out.println("TV " + marca + " com canal definido para "+ canal);
		}else{
			System.out.println("Por favor ligue a TV!");
		}
	}
	
	
	
}
