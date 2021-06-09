
public class Fatorial {
	public static int fatorial (int n){// 3    2 
		if (n == 0 || n == 1){
			return 1; 
		}
		return n*fatorial(n-1); // 2   1 
	}
	
	public static void main(String[] args) {
		int n = 3;
		System.out.println("Fatorial de " + n + " = " + fatorial(n));
	}

}
