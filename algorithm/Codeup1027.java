package algorithm;

import java.util.Scanner;
public class Codeup1027 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String value[]=sc.next().split("\\.");

        System.out.println(value[2]+'-'+value[1]+'-'+value[0]);
        
        sc.close();
        
        
    }
    
}
