package algorithm;

import java.util.Scanner;

public class Codeup1407 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.nextLine();
		for (int i = 0; i < a.length(); i++) {
			if(a.charAt(i) != ' ') {
				System.out.print(a.charAt(i));
			}
		}
		sc.close();
	}
}