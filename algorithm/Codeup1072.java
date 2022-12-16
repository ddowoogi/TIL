package algorithm;

import java.util.Scanner;

public class Codeup1072 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in); 
    int iNum = sc.nextInt();
    int arrNum[] = new int[iNum];

    for(int i=0;i<iNum;i++) {
      arrNum[i] = sc.nextInt();
      System.out.println(arrNum[i]);
    }
  }
}