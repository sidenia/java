import java.math.BigInteger;

public class BigFatorial {

	public static void main(String[] args) {
		
		BigInteger numero = new BigInteger("15");
		
		BigInteger f = BigInteger.ONE;
				
		/*abstra��o da classe com n�meros muito grandes
		for (i = 1; i <= numero; i++ )*/
		
		for(BigInteger i = BigInteger.ONE; i.compareTo(numero) != 1; i = i.add(BigInteger.ONE)) {
			//f = f * i;
			f = f.multiply(i);
		}
		
		/*se eu quisesse escrever i = 2 com essa classe seria:
		 * for (BigInteger i = new BigInteger("2") ; i.compareTo(numero) != 1; i = i.add(BigInteger.ONE))
		 * Ele tem como constante apenas o 0, o 1 e o 10. */
		
				
		System.out.println(f);
	}
	
	/* No i.compareTo(numero) quando usando a classe BigInteger se ele devolver um retorno -1 o numero 
	 * � menor que o i que est� sendo comparado, se ele der zero s�o iguais e se ele der 1 o numero � maior que i. 
	 * Por isso o teste � enquanto I comparatdo a NUMERO � diferente de 1 ou seja enquanto i for menor que o n�mero.
	 */
}
