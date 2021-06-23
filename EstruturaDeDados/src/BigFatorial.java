import java.math.BigInteger;

public class BigFatorial {

	public static void main(String[] args) {
		
		BigInteger numero = new BigInteger("15");
		
		BigInteger f = BigInteger.ONE;
				
		/*abstração da classe com números muito grandes
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
	 * é menor que o i que está sendo comparado, se ele der zero são iguais e se ele der 1 o numero é maior que i. 
	 * Por isso o teste é enquanto I comparatdo a NUMERO é diferente de 1 ou seja enquanto i for menor que o número.
	 */
}
