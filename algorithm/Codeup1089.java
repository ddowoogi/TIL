package algorithm;

import java.util.Scanner;

public class Codeup1089 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String[] a = sc.nextLine().split(" ");
		int b = Integer.parseInt(a[2]);
		int c = Integer.parseInt(a[0]);
		int d = Integer.parseInt(a[1]);
		
		for ( int i = 1; i < b; i++) {
			c = c + d;
		}
		System.out.println(c);
        sc.close();
	}
}

