package algorithm;

import java.util.Scanner;

public class Codeup3011 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt(); // 데이터 개수 입력
		int[] arr = new int[n]; // 데이터를 저장 할 배열 선언
		int temp = 0; // 데이터를 교환할때 임시 저장할 변수
		boolean sortCheck = false; // 데이터 교환이 일어났는지 확인하는 변수
		int result = 0; // 정렬 단계를 저장할 변수
		
		for(int i = 0; i < arr.length; i++) { // 배열에 데이터 입력
			arr[i] = sc.nextInt();
		}
		
		for (int i = (arr.length - 1); i > 0; i--) { // 버블 정렬 구현
			for (int j = 0; j < i; j++) { 
				if (arr[j] > arr[j+1]) { // 인접한 두 데이터중 왼쪽 데이터가 더 클 경우 데이터값을 교환
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
					sortCheck = true; // if문을 한번이라도 거치면 데이터 교환이 일어난것임으로 데이터 교환 변수 true
				}
			}
			if (sortCheck == true) { 
				result++; // 데이터 교환이 일어났을 경우 정렬 단계를 하나 올려줌
				sortCheck = false; // 다시 데이터 교환을 체크하기 위해 false로 전환
			} else { // 데이터 교환이 없을 경우 더이상 for문을 돌릴 이유가 없으므로 break
				break;
			}
		}
		
		System.out.println(result);
		sc.close();
	} // end main()
} // end Main