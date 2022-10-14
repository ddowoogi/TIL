package algorithm;

import java.util.Scanner;
public class Codeup1025 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String[] value=sc.next().split("");
        
        System.out.println(Integer.parseInt(value[0])*10000);
        System.out.println(Integer.parseInt(value[1])*1000);
        System.out.println(Integer.parseInt(value[2])*100);
        System.out.println(Integer.parseInt(value[3])*10);
        System.out.println(Integer.parseInt(value[4]));

        sc.close();
    }
    
}
