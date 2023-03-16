package algorithm;

import java.util.Scanner;

public class Codeup1525 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] arr = new int[30][30];
		int[][] arr2 = new int[30][30];
    //10x10 이지만 넉넉하게 30 30
		for(int i = 10; i < 20; i++) {
			for(int j= 10; j < 20; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
    //10부터 19까지 입력받기
    //그대로 복사
		for(int i = 10; i < 20; i++) {
			for(int j= 10; j < 20; j++) {
				arr2[i][j] = arr[i][j];
			}
		}
   
   //플레이어 입력받기
		int n = sc.nextInt();
		int[][] player = new int[n][2];
		for(int i = 0; i < n; i++) {
			for(int j= 0 ; j < 2 ; j++) {
				player[i][j] = sc.nextInt();
			}
		}
		for(int i = 10; i < 20; i++) {
			for(int j= 10; j < 20; j++) {
        //그 칸이 1보다 같거나 크다면
				if(arr[i][j] >= 1) {
          //그 자리는 -2
					arr2[i][j] = -2;
          //그 숫자 만큼 상하좌우 -2
          //올라가다가 -1을 만나면 반복 종료
					for(int k = 1; k <= arr[i][j]; k++) {
						if(arr[i+k][j] == -1) {
							break;
						} else {
							arr2[i+k][j] = -2;
						}
					}
					for(int k = 1; k <= arr[i][j]; k++) {
						if(arr[i-k][j] == -1) {
							break;
						} else {
							arr2[i-k][j] = -2;
						}
					}
					for(int k = 1; k <= arr[i][j]; k++) {
						if(arr[i][j+k] == -1) {
							break;
						} else {
							arr2[i][j+k] = -2;
						}
					}
					for(int k = 1; k <= arr[i][j]; k++) {
						if(arr[i][j-k] == -1) {
							break;
						} else {
							arr2[i][j-k] = -2;
						}
					}
				}
			}
		}
		//플레이어 위치 넣기
		for(int i = 0; i < n; i++) {
      //만약 그 자리가 -2라면 아무것도 안함.
			if(arr2[player[i][0]+9][player[i][1]+9] == -2) {
				
			} else if(arr2[player[i][0]+9][player[i][1]+9] == 0) {
				arr2[player[i][0]+9][player[i][1]+9] = i+1;
			}
		}
		
    //결과창 출력
		for(int i = 10; i < 20; i++) {
			for(int j= 10; j < 20; j++) {
				System.out.printf("%d ", arr2[i][j]);
			}
			System.out.println("");
		}
		
		System.out.println("Character Information");
		
		for(int i = 0; i < n; i++) {
      //플레이어 자리가 -2라면 DEAD
			if(arr2[player[i][0]+9][player[i][1]+9] == -2) {
				System.out.println("player " + (i+1) + " dead");
			} else if(arr2[player[i][0]+9][player[i][1]+9] == i+1) {
        //아니라면 SURVIVE
				System.out.println("player " + (i+1) + " survive");
			}
		}
	}
}
