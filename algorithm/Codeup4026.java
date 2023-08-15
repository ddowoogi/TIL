package algorithm;
 
import java.util.Scanner;
 
public class Codeup4026 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int[] arr = new int[5];
        
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        
        sc.close();
        
        for(int i=0; i<arr.length; i++){
            int temp;
            for(int j=0; j<arr.length-1; j++){
                if(arr[j]>=arr[j+1]){
                    temp=arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        System.out.println(arr[2]);
    }
}