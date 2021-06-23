import java.util.Random;

public class Joguinho {

	public static void main(String[] args) {
		PilhaVetor pilha = new PilhaVetor();
		Random gerador = new Random();
		
		do {
			if (gerador.nextInt(2) == 0 ){ //gera um valor randomico entre 0 e 1 para que a operação de empilha ou desempilha possa ocorrer
				if (!pilha.estaVazia()){ //se 0 e a pilha ta cheia, desempilha.
					System.out.println(pilha.pull() + " foi desempilhado!");
				}
			}
			else { //se 1 
				if (!pilha.estaCheia()){  //e a pilha ta vazia, empilha.
					pilha.push(gerador.nextInt(10));
				}
			}
			System.out.println(pilha);
		}while(!pilha.estaVazia());
	}
	
	/* Enquanto a pilha estiver cheia (ou seja, diferente de vazio)
	 * 
	 * o programa vai executar um random que escolherá entre 0 e 1 
	 * se der 0 ele desempilha se a a pilha nao tiver vazia (ou seja, se tiver cheia)
	 * se der 1 ele empilha  (um numero randomico de 0 a 10)  se a pilhanao não tiver cheia
	 * 
	 * vai rodar até zerar a pilha, até o teste do do while ser uma pilha vazia, onde vai para a exec.
	 */
}
