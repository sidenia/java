import java.util.Scanner;

public class Exe01 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		long num = (long) Math.pow(10, 3);
			
		System.out.println(consecutive(num));
		scanner.close();
	}
	
	 public static int consecutive(long num){		 
		 int cont = 0;
		 
		if (num > 0 && num <= Math.pow(10, 12)) {
			 for (int j = 1; j < num; j++) {
				 int soma = 0, i;
				 for (i = j; i < num; i++) {
					 soma += i;
					 if (soma == num) {
						 cont++;
						 break;					 
					 }				
				 }			  
			 }
		}		 
	     return cont;
    }

}
