
public class TesteListaDupla {

	public static void main(String[] args) {
		ListaDupla listaDupla = new ListaDupla();
		
		listaDupla.insereInicio(5);
		listaDupla.insereInicio(10);
		listaDupla.insereInicio(15);
		System.out.println(listaDupla);
		listaDupla.insereFim(1);
		System.out.println(listaDupla);
		listaDupla.removeFim();
		System.out.println(listaDupla);
		System.out.println("-------------");
		listaDupla.insereInicio(20);
		listaDupla.insereFim(1);
		System.out.println(listaDupla);
		System.out.println("-------------");
		listaDupla.removeDoInicio();
		listaDupla.removeFim();
		System.out.println(listaDupla);
	}

}
