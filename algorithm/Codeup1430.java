package algorithm;

import java.util.Scanner;

public class Codeup1430 {   



	public static void main(String[] args) {

	//값을 입력받음
		Scanner sc = new Scanner(System.in);
		
	
		
		int k = sc.nextInt();
		int [] arr = new int[k];
		
		for(int i = 0; i < k; i++){
			arr[i] = sc.nextInt();
	}
	
	
		int t = sc.nextInt();
		int [] arr2 = new int[t];
		
		for(int i = 0; i < t; i++){
			arr2[i] = sc.nextInt();
	}
	
		
		int [] out = new int[arr2.length];
		
		for(int i = 0; i < arr2.length; i++) {
			for(int j = 0 ; j <arr.length; j++) {
				if(arr2[i] == arr[j]) {
				out[i] = 1;
			} 
			}
				
			
		}
		
				
		for(int i = 0; i < out.length; i++) { 
			System.out.printf("%d ",out[i]);
			
		} 
        sc.close();
		
 }
		
}