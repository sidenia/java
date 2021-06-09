import java.util.Random;

public class NovoTesteFila {
	
    public static void main(String[] args) {
        Fila f = new Fila(8);
        Random gerador = new Random();
        do {
            if(gerador.nextInt(2)==0) { // (2) gera dois valores rand 0 e 1.
                if (!f.estaCheia()){ 
                	f.insere(gerador.nextInt(10)); // se teste == 0 insere dados
            
                }
            }     
            else {
                if (!f.estaVazia()) {
                    System.out.println(f.remove() + " foi atendido");
                }
            }
            System.out.println(f.stringVetor() + " | " + f);
        } while (!f.estaVazia());
        
    }
}
