
public class Conditional {

	public static void main(String[] args) {
		
		//example 1
		int a;
		//a = (7 > 3)? 7 : 3 ;
	
		if (7 > 3){
			a = 7;
		}else{
			a = 3;
		}
		System.out.println(a);
		
		//example 2
		
		String b = "Hello";
		
		double result = b.equals("hello") ? 1 : 0;
		System.out.println(b);
		System.out.println(result);
		
	}

}
