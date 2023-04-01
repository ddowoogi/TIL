package algorithm;

import java.util.Scanner;

public class Codeup1754{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        double a=sc.nextDouble();
        double b=sc.nextDouble();

        if(a>b){
            System.out.println(a+" "+b);
        }
        else{
            System.out.println(b+" "+a);
        }
        sc.close();

    }
}