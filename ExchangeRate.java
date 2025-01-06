package winter_0106;

import java.util.Scanner;

public class ExchangeRate {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("얼마를 계산하시겠습니까?(원) : ");
		int m = sc.nextInt();
		                                                                                                                                       
		double f = m*0.00068;
		System.out.println(m+"원은  "+f+"달러 입니다");
	}
}
