package algorithm;

import java.util.Scanner;

public class Codeup1492 {
	public static void Main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int[] b = new int[a];
		for (int i = 0; i < b.length; i++) {
			b[i]=sc.nextInt();
		}
		for (int i = 0; i < b.length; i++) {
			if(i != b.length-1) {
				b[i+1]+=b[i];
			}
			System.out.print(b[i]+" ");
		}
	}
}