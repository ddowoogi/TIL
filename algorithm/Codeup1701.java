package algorithm;

import java.util.Scanner;
public class Codeup1701{
 public static void main(String[] args) {
   
    Scanner sc = new Scanner(System.in);

    int[] arr = new int[3];

    for(int i=0;i<3;i++){
      arr[i]=sc.nextInt();
        
    }
    System.out.println(arr[2]+" "+arr[1]+" "+arr[0]);
    sc.close();
}
}