package algorithm;

import java.util.Scanner;

public class Codeup1048 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

//        System.out.println(a>>b);
        System.out.println(a * (int) Math.pow(2, b));
        }
    }