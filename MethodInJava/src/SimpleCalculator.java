import java.util.Scanner;

public class SimpleCalculator {
	

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
		welcome();
		
		System.out.println("Which operation do you want to make?\n 1-Sum\n 2-Subtraction\n 3-Multiplication\n 4-Division \nType:" );
		int op = scan.nextInt();
		
		checkOp(op);
		realizaOp(op);
			
	}
	
	public static void welcome(){
		System.out.println("Welcom to my calculator");
	}
	
	public static void checkOp (int op){
		switch (op){
		case 1:
			System.out.println("Ok! Let's make a sum!");
			break;
		case 2:
			System.out.println("Ok! Let's make a subtraction!");
			break;
		case 3:
			System.out.println("Ok! Let's make a multiplication!");
			break;
		case 4:
			System.out.println("Ok! Let's make a division!");
			break;
		default:
			System.out.println("Invalid entry, please rerun the program!");
			break;
		}
	}
	
	public static void realizaOp (int op){
		Scanner scan = new Scanner(System.in);
		if (op == 1){
			System.out.println("Type the first number:");
			int a = scan.nextInt();
			System.out.println("Type the second number:");
			int b = scan.nextInt();
			sum(a, b);
		}else if (op == 2){
			System.out.println("Type the first number:");
			int a = scan.nextInt();
			System.out.println("Type the second number:");
			int b = scan.nextInt();
			sub(a, b);
		}else if (op == 3){
			System.out.println("Type the first number:");
			int a = scan.nextInt();
			System.out.println("Type the second number:");
			int b = scan.nextInt();
			multiply(a, b);
		}else if (op == 4){
			System.out.println("Type the first number:");
			int a = scan.nextInt();
			System.out.println("Type the second number:");
			int b = scan.nextInt();
			divide(a, b);
		}else{
			System.out.println("You must type a valid entry!");
		}
		scan.close();
	}
	
	public static void sum (int a, int b){
		System.out.print("Result:");
		System.out.println(a + b);
	}
	
	public static void sub (int a, int b){
		System.out.print("Result:");
		System.out.println(a - b);
	}
	
	public static void multiply (int a, int b){
		System.out.print("Result:");
		System.out.println(a * b);
	}
	
	public static void divide (int a, int b){
		System.out.print("Result:");
		System.out.println(a / b);
	}
}
