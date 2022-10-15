package algorithm;

import java.util.Scanner;
public class Codeup1026 {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);

        String[] value = sc.nextLine().split("\\:");

        System.out.println(Integer.parseInt(value[1]));

        sc.close();
    }
    
}
