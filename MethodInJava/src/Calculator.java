import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
		welcome();
		
		//int remake = 0;
		
		//do{
		System.out.println("Which operation do you want to make?\n 1-Sum\n 2-Subtraction\n 3-Multiplication\n 4-Division \nType:" );
		int op = scan.nextInt();
		
		checkOp(op);
		realizaOp(op);
		
		System.out.println("\nDo you want to make a new operation? Type: (1-Yes / 2-No )");
		//remake = scan.nextInt();
		//}while(remake == 1);
		scan.close();
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
		if (op == 1){ //sum
			System.out.println("How many numbers do you want to sum?");
			int Quantity = scan.nextInt();
			int toSum[] = new int [Quantity];
			int totalSum = 0;
			for (int i = 0; i < toSum.length; i++){
				System.out.println("Type the " + (i+1) + "º number:");
				toSum[i] = scan.nextInt();
				totalSum = totalSum + toSum[i];
			}
			System.out.println("Result: " + totalSum);
			
		}else if (op == 2){ //subtraction
			System.out.println("How many numbers do you want to subtract?");
			int Quantity = scan.nextInt();
			int toSub[] = new int [Quantity];
			int subtraction = 0;
			for (int i = 0; i < toSub.length; i++){
				System.out.println("Type the " + (i+1) + "º number:");
				toSub[i] = scan.nextInt();
				if (i == 0) {
					subtraction = toSub[0];
					continue;
				}
				subtraction = subtraction - toSub[i];
			}
			System.out.println("Result: " + subtraction);
			
		}else if (op == 3){ //multiplication
			
		}else if (op == 4){//division
			
		}else{
			System.out.println("You must type a valid entry!");
		}
		scan.close();
	}


}
