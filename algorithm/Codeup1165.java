package algorithm;

import java.util.Scanner;

public class Codeup1165 {
	
	private int Timer = 90; // 경기종료시간
	
	public Codeup1165() {
		
	Scanner sc = new Scanner(System.in);
	int playTime = sc.nextInt(); // 현재 경기타임 - 입력
	int Group1 = sc.nextInt(); // 1반 점수 - 입력
    
      if(playTime > 90) {
          System.out.println("경기가 끝났습니다.");
          System.exit(0);
      }
	
	System.out.println("현재 경기 시간을 입력하세요 : " + playTime);
	System.out.println("현재 우리팀의 득점을 입력하세요 : " + Group1);
	
	int returnTime = Timer - playTime; // 남은 시간 계산
	int StrikerPoint = (returnTime/5)+1; // 스트라이커의 점수
	
	// 시간이 5분 미만일때는 스트라이커 점수 1점으로 계산
		if(returnTime < 5 && 0 < returnTime) {
			StrikerPoint = 1;
			// 90분에 투입되도 골을 넣지 못한다.
		} else if(returnTime == 0) {
			StrikerPoint = 0;
		}
	
	System.out.println("우리팀의 최종 득점은 : " + StrikerPoint);
	sc.close();
	}
	
	public static void main(String[] args) {
		new Codeup1165();

	
	}
}
