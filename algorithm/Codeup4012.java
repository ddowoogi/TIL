package algorithm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Student{
	int score;
	int rank;
	public Student(int score) {
		this.score = score;
	}
	public Student(int score, int rank) {
		this.score = score;
		this.rank = rank;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public int getRank() {
		return rank;
	}
	public void setRank(int rank) {
		this.rank = rank;
	}
}

public class Codeup4012 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Student> list = new ArrayList<Student>(); // 입력 순서대로 출력을 담당할 리스트
		ArrayList<Integer> sortList = new ArrayList<Integer>(); // 점수를 정렬할 리스트
		int n = sc.nextInt();
		for(int i = 0; i < n; i++) {
			int temp = sc.nextInt();
			sortList.add(temp);
			list.add(new Student(temp));
		}
		Collections.sort(sortList); // 정렬
		Collections.reverse(sortList);
		
		for(int i = 0; i < n; i++) {
			int rank = sortList.indexOf(list.get(i).getScore()); // 정렬된 리스트에서 입력된 숫자가 몇번째에 위치하는지 검색함
			list.set(i, new Student(list.get(i).getScore(), rank+1)); // 입력된 리스트에 순위를 추가해줌
		}
		
		for(Student x : list) { // 출력
			System.out.println(x.getScore() + " " + x.getRank());
		}
	} // end main()
} // end Main