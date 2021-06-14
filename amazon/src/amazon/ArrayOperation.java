package amazon;

import java.util.Scanner;

public class ArrayOperation {
	
			public static int[] replaceValues( int arr[] ){
				Scanner scan = new Scanner(System.in);
				
				int i , j , len = arr.length;
				
				System.out.println("digite um valor de array");
				int dados [] = new int [len];
				scan.close();
				if( len % 2 == 0 )
				{
					for( i = 0 ; i <= len ; i ++ )
						arr[i] = 0;
				}
				else
				{
					for( j = 0 ; j <= len ; j ++ )
					arr[j] = 1;
				}
				return arr;
			}

	}
