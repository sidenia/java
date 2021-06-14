
public class CasaDaSi {

	public static void main(String[] args) {
		Televisao t1, t2;
		
		/*t1 = new Televisao("STI no quarto de mãe");
		t2 = new Televisao("LG no meu quarto");*/
		
		t1 = new Televisao();
		t2 = new Televisao();
		
		t1.defineMarca("STI do quarto de mãe");
		t2.defineMarca("LG do meu quarto");
		
		t1.ligar();
		t2.ligar();
		
		t1.defineCanal(5);
		t2.defineCanal(2);
		

	}

}
