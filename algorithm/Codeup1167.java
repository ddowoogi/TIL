package algorithm;

import java.util.Scanner;
public class Codeup1167{
    public static void main(String[] args){
    
    Scanner sc = new Scanner(System.in);

    int x=sc.nextInt();
    int y=sc.nextInt();
    int z=sc.nextInt();
    
    if(x<=y&&x<=z){
        if(y<z){
            System.out.println(y);
        }
        else{
            System.out.println(z);
        }
    }
    else if(y<=x&&y<=z){
        if(x<z){
            System.out.println(x);
        }
        else{
            System.out.println(z);
        }
    }
    else if(z<=x&&z<=y){
        if(x<y){
            System.out.println(x);
        }
        else{
            System.out.println(y);
        }
    }
        sc.close();
}
}