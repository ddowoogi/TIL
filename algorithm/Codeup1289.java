package algorithm;


import java.util.Scanner;
public class Codeup1289{
    public static void main(String[] args){
        int big = 0;
        Scanner sc = new Scanner(System.in);
        
                int a1 = sc.nextInt();
                int b1 = sc.nextInt();
                int a2 = sc.nextInt();
                int b2 = sc.nextInt();
                int a3 = sc.nextInt();
                int b3 = sc.nextInt();
                
                int Ground_1 = a1 * b1;
                int Ground_2 = a2 * b2;
                int Ground_3 = a3 * b3;
                
                if(Ground_1 > Ground_2 && Ground_1 > Ground_3) {
                    big = Ground_1;
                } else if(Ground_2 > Ground_3 && Ground_2 > Ground_1) {
                    big = Ground_2;
                } else if(Ground_3 > Ground_1 && Ground_3 > Ground_2) {
                    big = Ground_3;
                }
                System.out.println("-- " + big + " --");
                sc.close();
        }
    }