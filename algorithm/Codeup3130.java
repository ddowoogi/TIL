package algorithm;

import java.util.*;

public class Codeup3130 {
	public static void main(String[] args) throws Exception {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int tall[]=new int[n];
		for(int i=0;i<n;i++) {
			tall[i]=sc.nextInt();
		}
		long answer=0;
		
		for(int i=0;i<n-1;i++) {
			for(int j=i+1;j<n;j++) {
				if(tall[i]>tall[j])
					answer++;
				else
					break;
						
			}
		}
		System.out.println(answer);
		
	}
		
}