package algorithm;

import java.util.Scanner;
public class Codeup1045 {
    public static void main(String[] args){

    Scanner sc = new Scanner(System.in);
    int a=sc.nextInt();
    int b=sc.nextInt();

    System.out.printf("%d\n",a+b);
    System.out.printf("%d\n",a-b);
    System.out.printf("%d\n",a*b);
    System.out.printf("%d\n",a/b);
    System.out.printf("%d\n",a%b);
    double A=(double)a;
    System.out.printf(".2f\n",A/b);
    sc.close();


    }
    
}
