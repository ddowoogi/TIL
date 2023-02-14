package algorithm;

import java.util.Scanner;

public class Codeup1226 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
		int[] arr = new int[7];     //로또번호 배열
		int n;                      //주희번호
		int correct = 0;
		int bonus_correct = 0;
		String s = "";
		
		for(int i=0;i<7;i++){       //로또번호 7개 입력
		    arr[i] = sc.nextInt();
		}
		
		for(int i=0;i<6;i++){
		    n = sc.nextInt();     //주희번호 6번 입력(for문)
		    for(int j=0;j<7;j++){
		        if(arr[j]==n){      //로또번호 = 주희번호
		            if(j==6) bonus_correct++;   //마지막로또번호 = 주희번호  보너스카운트+1 
		            else correct++;     //아니면 맞은 카운트+1
		        }
		    }
		}

		if(correct<=2) s = "0";             //당첨 조건
		else if(correct==3) s = "5";
		else if(correct==4) s = "4";
		else if(correct==5&&bonus_correct==0) s = "3";
		else if(correct==5&&bonus_correct==1) s = "2";
		else if(correct==6) s = "1";
        System.out.printf(""+s);
        
        sc.close();
    }
   
}
