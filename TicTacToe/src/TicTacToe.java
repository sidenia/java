import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class TicTacToe {
	
	static ArrayList<Integer> posicaoJogador = new ArrayList<Integer>();
	static ArrayList<Integer> posicaoPc = new ArrayList<Integer>();
	
	public static void main(String[] args) {

		char [][] gameBoard = {{' ','|',' ','|',' '},
							   {'-','+','-','+','-'},
							   {' ','|',' ','|',' '},
							   {'-','+','-','+','-'},
							   {' ','|',' ','|',' '}};
		
		mostrarGameBoard(gameBoard);
		
		while (true) {
			Scanner scan = new Scanner(System.in);
			System.out.println("\nEntre uma posição de 1-9: ");
			int jogadaJogador = scan.nextInt();
			while (posicaoJogador.contains(jogadaJogador) || posicaoPc.contains(posicaoJogador)){
				System.out.println("Essa posição já está ocupada, tente novamente!");
				jogadaJogador = scan.nextInt();
			}
			
			jogar(gameBoard, jogadaJogador, "jogador");
			
			Random sortear = new Random();
			int jogadaPc = sortear.nextInt(9) + 1;
			while (posicaoJogador.contains(jogadaPc) || posicaoPc.contains(jogadaPc)){
				jogadaPc = sortear.nextInt(9)+ 1;
			}
			
			jogar(gameBoard, jogadaPc, "computador");
			
			mostrarGameBoard(gameBoard);
			String resultado = vencedor();
			System.out.println(resultado);
		}
	}
	
	public static void mostrarGameBoard (char [][] gameBoard) {
		for (char[] row : gameBoard) {
			for (char column : row) {
				System.out.print(column);
			}
			System.out.println();
		}
		
	}

	public static void jogar (char [][] gameBoard, int posicao, String jogador) {
		
		char simbolo = ' ';
		
		if(jogador.equals("jogador")) {
			simbolo = 'X';
			posicaoJogador.add(posicao);
		}else if(jogador.equals("computador")) {
			simbolo = 'O';
			posicaoPc.add(posicao);
		}
		
		switch (posicao) {
		case 1: 
			gameBoard [0][0] = simbolo;
			break;
		case 2: 
			gameBoard [0][2] = simbolo;
			break;
		case 3: 
			gameBoard [0][4] = simbolo;
			break;
		case 4: 
			gameBoard [2][0] = simbolo;
			break;
		case 5: 
			gameBoard [2][2] = simbolo;
			break;
		case 6: 
			gameBoard [2][4] = simbolo;
			break;
		case 7: 
			gameBoard [4][0] = simbolo;
			break;
		case 8: 
			gameBoard [4][2] = simbolo;
			break;
		case 9: 
			gameBoard [4][4] = simbolo;
			break;
		}
	}

	public static String vencedor (){
		List topRow = Arrays.asList(1,2,3);
		List midRow = Arrays.asList(4,5,6);
		List botRow = Arrays.asList(7,8,9);
		List lefCol = Arrays.asList(1,4,7);
		List midCol = Arrays.asList(2,5,8);
		List rigCol = Arrays.asList(3,6,9);
		List cross1 = Arrays.asList(1,5,9);
		List cross2 = Arrays.asList(3,5,7);
		
		List<List> condicoesParaVencer = new ArrayList<List>();
	
		condicoesParaVencer.add(topRow);
		condicoesParaVencer.add(midRow);
		condicoesParaVencer.add(botRow);
		condicoesParaVencer.add(lefCol);
		condicoesParaVencer.add(midCol);
		condicoesParaVencer.add(rigCol);
		condicoesParaVencer.add(cross1);
		condicoesParaVencer.add(cross2);
		
		for (List l : condicoesParaVencer){
			if (posicaoJogador.containsAll(l)){
				return "\nVocê ganhou!";
			}else if (posicaoPc.containsAll(l)){
				return "\nO computador ganhou! Sinto muito :(";
			}else if (posicaoJogador.size() + posicaoPc.size() == 9){
				return "\nCAT!";	
			}
		}
		return " ";
	}
}
