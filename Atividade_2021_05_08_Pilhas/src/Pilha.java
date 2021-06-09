
public class Pilha {
	private int dados [];
	private int topo;

	
	public Pilha() {
		dados = new int [4];
		topo = 0;
	}
	public void push (int i) {
		this.dados[this.topo] = i;
		this.topo++ ;
	}
	public void empilhaForte () {
		int i;
		int tamanho = dados.length;
		int controle = 0;
		System.out.println("tamanho = " + tamanho );
		
		for ( i = 0; i < tamanho ; i++) {
			System.out.println(dados[i]);
			}
		
		for (i = 0 ; i < tamanho-1 ; i++) {
			
		
		  if(dados[i] <= dados[i+1]) {
			  
			  controle++;
	  }else {
			  controle--;
			  
			   }
		  }
		if(controle == 3) {
			  System.out.println("Esta é uma pilha forte");
		  }else {
			  System.out.println("Esta é uma pilha fraca");
		  }
		}

}
