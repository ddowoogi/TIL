package algorithm;

import java.util.Scanner;

public class Codeup2001{

    static float def_min(int[] a){
        int min_num=a[0];
        for(int i = 0; i<a.length-1; i++){
        	if(min_num > a[i+1]) min_num = a[i+1];
        }
        return min_num;
    }
    
    public static void main(String[] args) {
		
	    Scanner sc = new Scanner(System.in);
        int[] a = new int[3];
        int[] b = new int[2];
        
        for(int i = 0; i<3; i++){
            a[i] = sc.nextInt();
        }
        for(int i = 0; i<2; i++){
            b[i] = sc.nextInt();
        }
        
        float a_min = def_min(a);
        float b_min = def_min(b);
        
        System.out.println(String.format("%.1f",(a_min + b_min)*1.1));
    }
}