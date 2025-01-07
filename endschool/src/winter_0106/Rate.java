package winter_0106;

import java.util.Scanner;

public class Rate {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("환율을 입력하세요");
		double u = sc.nextDouble();			
        double k = 1 / u;

        while (true) { // 무한 반복 루프
            System.out.println("1. 달러 -> 원화, 2. 원화 -> 달러");
            int choice = sc.nextInt();

            if (choice == 1 || choice == 2) {
                System.out.println("금액을 입력하세요:");
                int money = sc.nextInt();
                double result = 0;

                if (choice == 1) {
                    result = money * u;
                    System.out.println("달러를 원화로 바꾸면 " + result + " 원입니다.");
                } else {
                    result = money * k;
                    System.out.println("원화를 달러로 바꾸면 " + result + " 달러입니다.");
                }

                break;
            } else {
                System.out.println("잘못된 선택입니다. 다시 시도하세요.");
            }
        }
    }
}
