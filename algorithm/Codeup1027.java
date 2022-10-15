package algorithm;

import java.util.Scanner;
public class Codeup1027 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String[] value=sc.nextLine().split("\\.");

        System.out.println(Integer.parseInt(value[2])+"-"+Integer.parseInt(value[1])+"-"+Integer.parseInt(value[0]));
        sc.close();
    }
    
}
