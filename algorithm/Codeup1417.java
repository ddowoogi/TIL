package algorithm;


import java.lang.reflect.Array;
import java.util.Scanner;
public class Codeup1417{
    public static void main(String[] args){
     Scanner sc = new Scanner(System.in);
    
     int arr[] = new int[10];

     for(int i=0;i<arr.length;i++){
        arr[i]=sc.nextInt();
     }
     Array.sort(arr);

     System.out.println(arr[2]);
     sc.close();
    }
}