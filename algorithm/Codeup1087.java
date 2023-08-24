package algorithm;

import java.util.Scanner;

public class Codeup1087 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		
		int a = sc.nextInt();
		int b = 0;
		
		for(int i = 1; i <= a; i++) {
			b = b+i;
			if (b >= a) {
				break;
			}
		}
		System.out.println(b);
        sc.close();
	}
}