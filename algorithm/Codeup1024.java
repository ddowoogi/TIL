package algorithm;

import java.util.Scanner;

public class Codeup1024 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String a = sc.next();
        int len=a.length();

        for(int i=0;i<len;i++){
          System.out.printf("\'%c\'\n",a.charAt(i));

        }
        sc.close();
    }
 
}