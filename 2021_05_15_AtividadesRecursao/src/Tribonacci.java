
public class Tribonacci {

	public static int tribonacci (int n){
		if (n == 0 || n == 1){
			return 0;
		}else if(n == 2){
			return 1;
		}
		return tribonacci(n-1) + tribonacci(n-2) + tribonacci(n-3);
	}
	
	public static void main(String[] args) {
		
		//System.out.println(tribonacci(5));
		for (int i = 0; i < 6; i++){
			System.out.println(tribonacci(i));
		}

	}
}
