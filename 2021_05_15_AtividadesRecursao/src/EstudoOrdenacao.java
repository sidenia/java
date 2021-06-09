import java.util.Random;
import java.util.Scanner;

import java.util.Date;

public class EstudoOrdenacao {
    
    //exibir um vetor
    static void exibeVetor (int [] v, String msg) {
        System.out.println("\n" + msg + "\n");
        for (int i=0; i<v.length; i++) {
            System.out.printf("%d ", v[i]);
        }
        System.out.println();
    }
    //preenche um vetor randomicamente
    static void preencheVetor (int v[]) {
        Random r = new Random();
        for (int i=0; i<v.length; i++) {
            v[i] = r.nextInt(v.length * 10); //estudar sintaxe do Random
        }
    }
    //bubble sort
    static void bubbleSort (int v[]) {
        for (int i=1; i<v.length; i++) {
            for (int j=0; j<v.length - i; j++) {
                if (v[j] > v[j+1]) {
                    int aux = v[j];
                    v[j] = v[j+1];
                    v[j+1] = aux;
                }
            }
        }
    }
    //parti��o - divisao
    public static int partition (int A[], int p, int r) {
        int i, j;
        int x = A[r];
        i=p-1;
        for (j=p; j<r; j++) { //j nao seria igual a r-1 ??
            if (A[j] < x) {
                i = i+1;
                int aux = A[i];
                A[i] = A[j];
                A[j] = aux;
            }
        }
        i = i+1;
        int aux = A[i];
        A[i] = A[r];
        A[r] = aux;
        return i;
    }
    //quicksort -conquista
    public static void quickSort (int A[], int p, int r) {
        System.out.println("p = " + p + " r = " + r);
        if (p < r) {
            int q = partition(A, p, r); //posicao do pivot
            System.out.println("q = " + q);
            quickSort(A, p, q-1);  //chamada recursiva do inicio p ate o pivot -1
            quickSort(A, q+1, r);  //chamada recursiva do pivot +1 ate o final r 
        }
    }
    //main
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        char continua;
        do {
            System.out.print("digite o tamanho do vetor: ");
            int n = entrada.nextInt();
            int v[] = new int[n];
            //preencheVetor (v);
            //exibeVetor(v, "vetor gerado");
            //long inicio = new Date().getTime();
            //bubbleSort(v);
            //long fim = new Date().getTime();
            //System.out.println("\ntempo de ordenacao do Bubble para o tamanho " + n + " = " + (fim-inicio) + "ms\n");
            //exibeVetor(v, "vetor ordenado pelo Bubble");
            
            preencheVetor(v);
            exibeVetor(v, "novo vetor\n");
            
            //inicio contagem
            long inicio = new Date().getTime();
            quickSort(v, 0, n-1); // A,p,r
            long fim = new Date().getTime();
            System.out.println("\ntempo de ordenacao do Quick para o tamanho " + n + " = " + (fim-inicio) + "ms\n");
            exibeVetor(v, "vetor ordenado pelo Quick");

            //--> leitura do char
            System.out.print("\nexecuta novamente? (s/n) ");
            entrada.nextLine();
            continua = entrada.nextLine().toLowerCase().charAt(0);
        } while (continua == 's');
        entrada.close();
    }
}
