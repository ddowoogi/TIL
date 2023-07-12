package algorithm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Codeup1095 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 부를 횟수
        int n = scanner.nextInt();
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int num = scanner.nextInt();
            list.add(num);
        }

        System.out.println(Collections.min(list));


    }

}
