package algorithm;
import java.util.Scanner;

public class Codeup1019 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int y=sc.nextInt();
        int m=sc.nextInt();
        int d=sc.nextInt();

        System.out.printf("%d.%02d.%02d",y,m,d);
        sc.close();
    }
    
}
