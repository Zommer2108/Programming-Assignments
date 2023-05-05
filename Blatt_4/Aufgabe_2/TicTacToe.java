package tictactoe;

import java.util.Scanner;


		public class TicTacToe {
		    private static final char EMPTY = '-';
		    private static final char PLAYER_X = 'X';
		    private static final char PLAYER_O = 'O';

		    private char[][] board;                           //B
		    private char currentPlayer;

		    public TicTacToe() {
		        board = new char[3][3];
		        for (int i = 0; i < 3; i++) {
		            for (int j = 0; j < 3; j++) {
		                board[i][j] = EMPTY;
		            }
		        }
		        currentPlayer = PLAYER_X;
		    }

		    public void printBoard() {                         // teil B
		        for (int i = 0; i < 3; i++) {
		            for (int j = 0; j < 3; j++) {
		                System.out.print(board[i][j] + " ");
		            }
		            System.out.println();
		        }
		    }

		    public boolean placeMove(int row, int col) {      //Teil C
		        if (board[row][col] == EMPTY) {
		            board[row][col] = currentPlayer;
		            return true;
		        }
		        return false;
		    }

		    public boolean checkWin() {                       //Teil D
		        for (int i = 0; i < 3; i++) {
		            if (board[i][0] == currentPlayer && board[i][1] == currentPlayer && board[i][2] == currentPlayer) {
		                return true;
		            }
		            if (board[0][i] == currentPlayer && board[1][i] == currentPlayer && board[2][i] == currentPlayer) {
		                return true;
		            }
		        }
		        if (board[0][0] == currentPlayer && board[1][1] == currentPlayer && board[2][2] == currentPlayer) {
		            return true;
		        }
		        return board[0][2] == currentPlayer && board[1][1] == currentPlayer && board[2][0] == currentPlayer;
		    }

		    public void playGame() {
		        Scanner scanner = new Scanner(System.in);
		        boolean gameWon = false;
		        int moves = 0;

		        while (!gameWon && moves < 9) {
		            printBoard();
		            System.out.println("Spieler " + currentPlayer + ", bitte geben Sie die Zeile (1-3) und die Spalte (1-3) ein:");
		            int row = scanner.nextInt() - 1;
		            int col = scanner.nextInt() - 1;

		            if (placeMove(row, col)) {
		                gameWon = checkWin();
		                if (!gameWon) {
		                    moves++;
		                    currentPlayer = (currentPlayer == PLAYER_X) ? PLAYER_O : PLAYER_X;
		                }
		            } else {
		                System.out.println("Ungültiger Zug. Bitte versuchen Sie es erneut.");
		            }
		        }

		        printBoard();
		        if (gameWon) {
		            System.out.println("Spieler " + currentPlayer + " hat gewonnen!");
		        } else {
		            System.out.println("Unentschieden!");
		        }
		        scanner.close();
		    }

		    public static void main(String[] args) {
		        TicTacToe ticTacToe = new TicTacToe();
		        ticTacToe.playGame();
		    }
}
