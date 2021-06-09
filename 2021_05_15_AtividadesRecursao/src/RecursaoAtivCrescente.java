
public class RecursaoAtivCrescente {
	private static int i = 0;
	 
	public static void main(String[] args) {
	      
	    System.out.println(imprimPar(4));
	}	
static int imprimPar(int num) {

    if (num == 0) {
       //System.out.println(num);
        return num + i;
    }
    else {
        System.out.println(num - num + i) ;
        i += 2;
        return imprimPar(num - 2) ;
    }
}

}
