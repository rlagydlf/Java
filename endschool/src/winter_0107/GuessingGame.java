package winter_0107;

import java.util.Scanner;

public class GuessingGame {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("==========숫자 맞추기 게임==========");
		int ran = (int)(Math.random()*100)+1;
		int num;
		int count = 0;
		do {
		System.out.println("숫자는 무엇일까요? (0~100) : ");
		num = sc.nextInt();
		
		count++;
		if(ran>num) {
			System.out.println("UP");
		}
		else if(ran<num) {
			System.out.println("DOWN");
		}
		}while(ran!=num);
		System.out.println("정답입니다. "+count+"번 걸렸습니다.");
	}
}
