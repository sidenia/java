
public class LogicalOperators {

	public static void main(String[] args) {
		
		//operador de atribuição =
		
		/*
		 * Operadores de comparação 
		 * == ( é igual a )   
		 * != (é diferente de ) 
		 * > (é maior) 
		 * >= (maior ou igual) 
		 * < (menor)
		 * <=(menor ou igual)
		 */

		/*
		 * Conectivos Lógicos:
		 * !  (Negação ou NOT)
		 * && (E ou AND)
		 * || (OU ou OR)
		 * | OU Inclusivo
		 * ^ OU Exclusivo
		 * */
		
		/*
		 * Unários:
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
