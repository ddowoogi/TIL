package algorithm;

import java.util.Scanner;

public class Codeup1098 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int h = sc.nextInt();
		int w = sc.nextInt();
		int[][] board = new int[h][w];
		
		int n = sc.nextInt();
		for (int i=1; i<=n; i++) {
			int l = sc.nextInt();
			int d = sc.nextInt();
			int x = sc.nextInt();
			int y = sc.nextInt();

			for (int j=0; j<l; j++) {
				if (d == 0) // 가로
					board[x-1][y-1+j] = 1;
				else
					board[x-1+j][y-1] = 1;
			}
		}

		for (int i=0; i<h; i++) {
			for (int j=0; j<w; j++) {
				System.out.print(board[i][j] + " ");
			}
			System.out.println();
		}
		sc.close();
	}
}