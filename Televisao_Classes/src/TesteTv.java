
public class TesteTv {

	public static void main(String[] args) {
		
		Televisao tv = new Televisao();
		tv.defineMarca("LG");
		tv.ligar();
		tv.defineVolume(10);
		tv.defineCanal(4);
		tv.avancaCanal();
		tv.retrocedeCanal();
		tv.aumentaVolume();
		tv.diminuiVolume();
		tv.desligar();
	}

}
