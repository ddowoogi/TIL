package algorithm;
import java.util.Scanner;

public class Codeup1078 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int i=sc.nextInt();
        int k=0;
        for(int j=1;j<=i;j++){
            if(j%2==0){
             k=k+j;
               
            }
        }
        System.out.println(k);
        sc.close();
    }
}
