
public class LogicalOperators {

	public static void main(String[] args) {
		
		//operador de atribui��o =
		
		/*
		 * Operadores de compara��o 
		 * == ( � igual a )   
		 * != (� diferente de ) 
		 * > (� maior) 
		 * >= (maior ou igual) 
		 * < (menor)
		 * <=(menor ou igual)
		 */

		/*
		 * Conectivos L�gicos:
		 * !  (Nega��o ou NOT)
		 * && (E ou AND)
		 * || (OU ou OR)
		 * | OU Inclusivo
		 * ^ OU Exclusivo
		 * */
		
		/*
		 * Un�rios:
		 * ++
		 * --
		 * +
		 * -
		 * !
		 * +=
		 * -=
		 * */
		
		/*
		 * Condicional
		 * ?
		 * :
		 * */
		
		double a = 2.4;
		
		if (a == 2.4) {
			System.out.println("They are equal!");
		}
		if (a > 7) {
			System.out.println("Greater than 7!");
		}
		
		if (a == 2.4 || a == 2.5) {
			System.out.println("Its 2.4 or 2.5!");
		}
		if (a >= 0 && a <= 100) {
			System.out.println("Its on range!");
		}
	}

}
