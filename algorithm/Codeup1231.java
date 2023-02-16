package algorithm;

import java.util.Scanner;
import java.text.DecimalFormat;
import java.util.ArrayList;

public class Codeup1231 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    ArrayList<Integer> arr = new ArrayList<>();
    String input = scan.nextLine();
    String[] part = input.split("");
    DecimalFormat df = new DecimalFormat("0.00");
    int a = 0;
    for(int i = 0 ; i < part.length ; i++){
      try {
        arr.add(Integer.parseInt(part[i]));
      }
      catch(Exception e) {
        a = i;
      }
    }
    String a1 = "";
    String a2 = "";
    for(int i = 0 ; i < a ; i++ ){
      a1 += part[i]; 
    } 
    for(int i = a+1 ; i < part.length ; i++ ){
      a2 += part[i]; 
    } 
    int input1 = Integer.parseInt(a1);
    int input2 = Integer.parseInt(a2);

    switch(part[a]){
        case "+": 
            System.out.println(input1 + input2);
            break;
        case "-":
            System.out.println(input1 - input2);
            break;
        case "*" :
            System.out.println(input1 * input2);
            break;
        default :
            System.out.println(df.format((double)Math.round(((double)input1*100)/(double)input2)/100));
    }
  }
}