
public class TesteFilaG {

	public static void main(String[] args)  throws InterruptedException{
		FilaG<Integer> filaInteiros = new FilaG <>();
		
		/*
		 * filaInteiros.insere(1); filaInteiros.insere(2);
		 * System.out.println(filaInteiros);
		 */
		do {
			int i = 0;
			while (!filaInteiros.estaCheia()) {
				filaInteiros.insere(i++);
				System.out.println(filaInteiros);
				Thread.sleep(200);
			}
			while(!filaInteiros.estaVazia()) {
				filaInteiros.remove();
				i--;
				System.out.println(filaInteiros);
				Thread.sleep(200);
			}
			Thread.sleep(100);
		}while (true);
	}
}

