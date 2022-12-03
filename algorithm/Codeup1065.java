package algorithm;
import java.util.Scanner;

public class Codeup1065{
    public static void main(String[] args){
    Scanner sc =new Scanner(System.in);
    int [] values =new int[3];
    for(int i=0;i<values.length;i++){
        values[i]=sc.nextInt();
    }

    for(int value:values){
        if(value%2==0){
            System.out.println(value);
        }
    }
    sc.close();
    }
}