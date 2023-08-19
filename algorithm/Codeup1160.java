package algorithm;

import java.util.Scanner;

public class Codeup1160 {
	
	
	 static int Monday = 1; // 월요일  
	 static int Tuesday = 2; // 화요일 
	 static int Wednesday = 3; // 수요일
	 static int Thursday = 4; // 목요일
	 static int Friday = 5; // 금요일 
	 static int Saturday = 6; // 토요일
	 static int Sunday = 7; // 일요일
	
	public static void main(String[] args) {
		
		String going = "oh my god"; 
		String Notgoing = "enjoy";  
		
		Scanner sc = new Scanner(System.in);
		int day = sc.nextInt();
		
		if(1<=day && day <=7) {
			
			if(day == Monday || day == Wednesday || day == Friday || day == Sunday) {
				System.out.println(going);
			}
		
			if(day == Tuesday || day == Thursday || day == Saturday) {
				System.out.println(Notgoing);
			}
		} else {
			System.out.println("숫자는 1부터 7까지입니다.");
		}
		sc.close();
	}
}