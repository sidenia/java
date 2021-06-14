
public class Types {

	public static void main(String[] args) {
		
		//casting - java automatically will cast down so you have to manually cast up.
		
		byte a = 1;
		short b;
		char c;
		int d;
		long e;
		float f;
		double g;
		String h;
		
		// if you try to store a type into another directly you have to cast, and java will aways cast for smaller amount ex: 5.6 into 5.
		int num = (int) 5.6;
		System.out.println(num);
		
		// in this case, java convert the type "byte" automatically into an "int".
		int ex = a; 
		

	}

}
