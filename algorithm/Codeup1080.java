package algorithm;

import java.util.Scanner;


public class Codeup1080 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sum = 0;
        for(int i=1; i<=num; i++){
            sum = sum + i;
            if(sum >= num){
                System.out.print(i);
                break;
            }
        }
        sc.close();
    }
}