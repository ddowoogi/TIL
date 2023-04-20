package algorithm;

import java.util.Scanner;

public class Codeup2016{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String m = sc.next();
		char[] word = new char[m.length()];
    // m 의 크기만큼 배열 생성
		int a = n%3;
    //컴마를 찍어줄 위치
		int count = 0;
		for(int i = 0; i < n; i++) {		
      //char 배열에 m글자를 1개씩 집어넣기	
			word[i] = m.charAt(i);
      //만약 n % 3 == 0 이라면 첫 컴마 생략
			if(a == 0) {
				a+=3;
			}
			if(i == a) {	
        //i가 a랑 같다면 a는 3증가, 그리고 컴마를 찍어줌.
				a += 3;
				System.out.print(',');			
			}
      //숫자 출력
			System.out.print(word[i]);
		}
    }
}