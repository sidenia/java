
public class Fibonacci {

	public static int fibonacci (int n){
		if (n == 0 || n == 1){
			return 1;
		}
		return fibonacci(n-1) + fibonacci(n-2); // vira uma arvore de recursao e perde a eficiencia.
	}
	
	public static void main(String[] args) {
		
		System.out.println(fibonacci(4));

	}
}
