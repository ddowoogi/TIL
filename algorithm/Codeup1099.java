package algorithm;

import java.util.Scanner;

public class Codeup1099 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[][] board = new int[11][11];
		for (int i=1; i<=10; i++) {
			for (int j=1; j<=10; j++) {
				board[i][j] = sc.nextInt();
			}
		}

		int x = 2;
		int y = 2;
		while (true) {
			if (board[x][y] == 0) {
				board[x][y] = 9;
				y ++;
			}
			if (board[x][y] == 1) {
				y--;
				x++;
			}
			if (board[x][y] == 2) {
				board[x][y] = 9;
				break;
			} else if (board[x][y+1] == 1 && board[x+1][y] == 1) {
				if (board[x][y] == 0)
					board[x][y] = 9;
				break;
			}
		}

		for (int i=1; i<=10; i++) {
			for (int j=1; j<=10; j++) 
				System.out.print(board[i][j] + " ");
			System.out.println();
		}
        sc.close();
	}
}