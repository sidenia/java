
public class vetor {

	public static void main(String[] args) {
		//declara um vetor de inteiros
		int [] numeros;
		
		//aloca espaço na memória para 5 posições
		numeros = new int [5];
		
		numeros[0] = 1;
		numeros[1] = 2;
		numeros[2] = 3;
		numeros[3] = 4;
		numeros[4] = 5;
		
		System.out.println("Elemento no index 0:" +numeros[0]);
		System.out.println("Elemento no index 1:" +numeros[1]);
		System.out.println("Elemento no index 2:" +numeros[2]);
		System.out.println("Elemento no index 3:" +numeros[3]);
		System.out.println("Elemento no index 4:" +numeros[4]);
	}

}
