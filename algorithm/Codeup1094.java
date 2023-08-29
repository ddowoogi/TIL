package algorithm;

import java.util.Scanner;

public class Codeup1094 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int[] k = new int[n];

		for (int i=0; i<n; i++)
			k[i] = sc.nextInt();

		for (int i=n-1; i>=0; i--)
			System.out.print(k[i] + " ");
            sc.close();
	}
}